package csv;

import csv.annotations.CSVEntity;
import csv.annotations.CSVField;
import csv.exception.CSVEntityAnnotationNotPresentException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CSVParser<T> {

    private final String SEPERATOR = ";";

    /**
     * Checks if the class of the object has the CSVEntity anotation
     * @param object to be checked
     * @return true if parsable, false if null
     * @throws CSVEntityAnnotationNotPresentException if class doesn't have the CSVEntity anotation
     */
    public boolean parseable(T object) throws CSVEntityAnnotationNotPresentException {
        if(Objects.isNull(object)){
            return false;
        }
        if(object.getClass().isAnnotationPresent(CSVEntity.class)){
            return true;
        }
        throw new CSVEntityAnnotationNotPresentException();
    }

    /**
     * Get all the fields of a class that have the CSVField anotation
     * @param object to get the parseable fields from
     * @return List<Field> with all the parseable fields
     */
    public List<Field> getParseableFields(T object){
        List<Field> parseableFields = new ArrayList<>();
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field f : fields){
            if(f.isAnnotationPresent(CSVField.class)){
                parseableFields.add(f);
            }
        }
        return parseableFields;
    }

    /**
     * Return a CSV styled header of the fields
     * @param object to get the header from
     * @return String with the fieldnames seperated by a semicolon
     */
    public String getHeader(T object){
        final StringBuilder sb = new StringBuilder();
        List<Field> parseableFields = getParseableFields(object);
        for(Field f : parseableFields) {
            sb.append(f.getName());
            if(f != parseableFields.getLast())
                sb.append(SEPERATOR);
        }
        return sb.toString();
    }

    /**
     * Parse a single Object into the CSV format
     * @param object to be parsed
     */
    public String parse(T object) {
        StringBuilder sb = new StringBuilder();
        try{
            if(parseable(object)){
                String header = getHeader(object);
                System.out.println(header);
                sb.append(header);

                sb.append("\n");
//                sb.append(System.lineSeparator());

                String body = parseSingleObject(object);
                System.out.println(body);
                sb.append(body);
            }
        } catch (CSVEntityAnnotationNotPresentException e){
            System.out.println("Entity is not parseable");
        }
        return sb.toString();
    }

    /**
     *
     * @param object to be parsed into a string
     * @return String of the parseable values in the object in csv format
     */
    public String parseSingleObject(T object){
        List<Field> parseableFields = getParseableFields(object);
        final StringBuilder sb = new StringBuilder();

        for (Field f : parseableFields) {
            f.setAccessible(true);
            try {
                Object value = f.get(object);
                sb.append(value);
                if(f != parseableFields.getLast()){
                    sb.append(SEPERATOR);
                }
            } catch (IllegalAccessException e) {
                System.out.println("Unable to access field");
            }
        }
        return sb.toString();
    }

    /**
     * Parse a list of objects into a csv format
     * @param list of objects
     */
    public String parseList(T[] list) {
        StringBuilder sb = new StringBuilder();
        if (list.length == 0){
            System.out.println("Empty List");
            return "Empty List";
        } else {
            String header = getHeader(list[0]);
            System.out.println(header);
            sb.append(header);
            sb.append("\n");
            for(T elem : list){
                String body = parseSingleObject(elem);
                System.out.println(body);
                sb.append(body);
                if(elem != list[list.length - 1]){
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}

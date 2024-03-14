package csv;

import csv.annotations.CSVField;
import csv.entity.Car;
import csv.entity.Vector;
import csv.exception.CSVEntityAnnotationNotPresentException;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVParserTest {

    CSVParser<Car> parser = new CSVParser<>();
    Car mercedes = new Car("Mercedes", "Silver", 4, 23000);
    Car audi = new Car("Audi", "Schwarz", 2, 15000);
    Car opel = new Car("Opel", "Weiß", 4, 10000);

    Car nullCar = null;

    Car[] carlist = {mercedes, audi, opel};

    // not CSV parseable
    Vector vector = new Vector(1.0, 2.0, 3.0);
    CSVParser<Vector> vectorParser = new CSVParser<>();


    @Test
    void parseable() throws CSVEntityAnnotationNotPresentException {
        assertTrue(parser.parseable(mercedes));
    }

    @Test
    void notParseable(){
        assertThrows(CSVEntityAnnotationNotPresentException.class, () -> {
            vectorParser.parseable(vector);
        });
    }

    @Test
    void parseNull() throws CSVEntityAnnotationNotPresentException {
        assertFalse(parser.parseable(nullCar));
    }

    @Test
    void getHeader() {
        String header = "brand;colour;numDoors;price";
        assertEquals(header, parser.getHeader(mercedes));
    }

    @Test
    void parseSingleObject() {
        assertEquals("Mercedes;Silver;4;23000", parser.parseSingleObject(mercedes));
    }

    @Test
    void getParseableFields() {
//        List<Field> parseableFields = parser.getParseableFields(mercedes);
//        for(Field f : parseableFields){
//            assertTrue(f.isAnnotationPresent(CSVField.class));
//        }
    }

    @Test
    void parse() {

    }

    @Test
    void parseList() {

    }
}
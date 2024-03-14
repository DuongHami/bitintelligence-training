package csv;

import csv.entity.Car;
import csv.entity.Vector;
import csv.exception.CSVEntityAnnotationNotPresentException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    Vector[] vectorList = new Vector[0];

//    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
//    @BeforeEach
//    public void redirectOut() {
//        System.setOut(new PrintStream(out));
//    }

//    @AfterEach
//    public void cleanUpOut() {
//        System.setOut(null);
//    }


    /**
     * Positive test for parseable
     * @throws CSVEntityAnnotationNotPresentException
     */
    @Test
    void parseable() throws CSVEntityAnnotationNotPresentException {
        assertTrue(parser.parseable(mercedes));
    }

    /**
     * Negative test for parseable
     */
    @Test
    void notParseable(){
        assertThrows(CSVEntityAnnotationNotPresentException.class, () -> {
            vectorParser.parseable(vector);
        });
    }

    /**
     *
     * @throws CSVEntityAnnotationNotPresentException
     */
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
        String singleParse = parser.parse(mercedes);
        assertEquals("brand;colour;numDoors;price\nMercedes;Silver;4;23000", singleParse);
//        assertEquals("brand;colour;numDoors;price", out.toString());
    }

    @Test
    void parseList() {
        String listParse = parser.parseList(carlist);
        assertEquals("brand;colour;numDoors;price" +
                "\nMercedes;Silver;4;23000" +
                "\nAudi;Schwarz;2;15000" +
                "\nOpel;Weiß;4;10000", listParse);
    }

    @Test
    void parseEmptyList() {
        String listParse = vectorParser.parseList(vectorList);
        assertEquals("Empty List", listParse);
    }
}
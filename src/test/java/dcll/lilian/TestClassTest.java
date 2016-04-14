package dcll.lilian;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lilian on 14/04/2016.
 */
public class TestClassTest {

    TestClass testClass;

    @Before
    public void setUp(){
        testClass = new TestClass(2,"osef");
    }

    @Test
    public void testGetNombre(){
        assertEquals("Test getNombre",testClass.getNombre(),2);
    }

    @Test
    public void testGetMot(){
        assertEquals("Test getMot OK",testClass.getMot(),"osef");
    }

    @Test
    public void testToString(){
        assertEquals("Test toString OK",testClass.toString(),"TestClass{" +
                "nombre=" + 2 +
                ", mot='" + "osef" + '\'' +
                '}');
    }
}
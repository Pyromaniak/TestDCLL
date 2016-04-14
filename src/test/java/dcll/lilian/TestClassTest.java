package dcll.lilian;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lilian on 14/04/2016.
 */
public class TestClassTest {

    @Test
    public void testGetNombre(){
        TestClass testClass = new TestClass(2,"osef");
        assertEquals("Test getNombre",testClass.getNombre(),2);
    }

    @Test
    public void testGetMot(){
        TestClass testClass = new TestClass(2,"osef");
        assertEquals("Test getMot OK",testClass.getMot(),"osef");
    }

    @Test
    public void testToString(){
        TestClass testClass = new TestClass(2,"osef");
        assertEquals("Test toString OK",testClass.toString(),"TestClass{" +
                "nombre=" + 2 +
                ", mot='" + "osef" + '\'' +
                '}');
    }
}
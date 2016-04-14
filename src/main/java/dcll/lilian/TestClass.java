package dcll.lilian;

/**
 * Created by Lilian on 14/04/2016.
 */
public class TestClass {
    protected int nombre;
    protected String mot;

    public TestClass(int nombre, String mot) {
        this.nombre = nombre;
        this.mot = mot;
    }

    public int getNombre() {
        return nombre;
    }

    public String getMot() {
        return mot;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "nombre=" + nombre +
                ", mot='" + mot + '\'' +
                '}';
    }
}

package dcll.lilian;

/**
 * Created by Lilian on 14/04/2016.
 */

/*
* Un commentaire qui répond aux éxigences 1 et 2
* */

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

    /*
    * création du toString pour l'exigence 2
    * @return
    * */
    @Override
    public String toString() {
        return "TestClass{" +
                "nombre=" + nombre +
                ", mot='" + mot + '\'' +
                '}';
    }
}

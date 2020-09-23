
package programa1;

public class cipherDemo {
    public static void main(String[] args) {
        Modelo m = new Modelo();
        Vista v = new Vista();
        Controller c = new Controlador(m,v);
        c.run();
    }
}
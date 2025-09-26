
public class ejercicio4_2 {

    public static String pluralizar(int conteo, String palabra) {
        if (conteo == 1) {
            return palabra;
        } else {
            return conteo + " " + palabra + "s";
        }
    }

    public static void main(String[] args) {
        System.out.println(pluralizar(1, "Perro"));
        System.out.println(pluralizar(2, "Carro"));
        System.out.println(pluralizar(5, "Maestra"));
    }
}

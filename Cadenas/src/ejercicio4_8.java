
public class ejercicio4_8 {
    public static String extension(String ruta) {
        int punto = ruta.lastIndexOf(".");
        if (punto == -1) {
            return ""; // no tiene extensión
        }
        return ruta.substring(punto + 1);
    }

    public static void main(String[] args) {
        System.out.println(extension("debug.sh"));
        System.out.println(extension("/path/to/debug.sh"));
        System.out.println(extension("/the.dot/file.java"));
        System.out.println(extension("no-extension"));
    }
}


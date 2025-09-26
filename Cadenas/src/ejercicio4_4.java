public class ejercicio4_4 {
    public static String titleCase(String texto) {
        var primeraLetra = texto.substring(0, 1);
        var restoDelTexto = texto.substring(1);
        return String.format("%S%s", primeraLetra, restoDelTexto.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(titleCase("java"));
        System.out.println(titleCase("jAvA"));
        System.out.println(titleCase("JAVA"));
    }
}

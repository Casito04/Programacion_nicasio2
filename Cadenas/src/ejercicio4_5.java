public class ejercicio4_5 {
    public static boolean terminaEnS(String texto) {
        var ultimoCaracter = texto.charAt(texto.length() - 1);
        return (ultimoCaracter == 's') || (ultimoCaracter == 'S');
    }

    public static void main(String[] args) {
        System.out.println(terminaEnS("miércoles"));
        System.out.println(terminaEnS("jueves"));
        System.out.println(terminaEnS("sábado"));
    }
}



public class ejercicio4_13 {

    public static String elipsificar(String texto, int limite) {

        if (texto.length() <= limite) return texto;
        int espacio = texto.lastIndexOf(" ", limite);
        if (espacio == -1) return texto.substring(0, limite) + "…";
        else return texto.substring(0, espacio) + "…";
    }

    public static void main(String[] args) {
        System.out.println(elipsificar("Java is fun", 4));
        System.out.println(elipsificar("Java is fun", 6));
        System.out.println(elipsificar("Java is fun", 11));
        System.out.println(elipsificar("Java is fun", 20));
        System.out.println(elipsificar("Programar en Java es entretenido", 10));
        System.out.println(elipsificar("Hola mundo", 5));
        System.out.println(elipsificar("Hola mundo", 20));
    }
}

public class ejercicio4_6  {

    public static boolean esPalindrome(String texto) {
        if (texto.length() != 2) return false; // versión simple
        char a = Character.toLowerCase(texto.charAt(0));
        char b = Character.toLowerCase(texto.charAt(1));
        return a == b;
    }

    public static void main(String[] args) {
        System.out.println(esPalindrome("ab"));
        System.out.println(esPalindrome("ee"));
        System.out.println(esPalindrome("Aa"));
    }
}




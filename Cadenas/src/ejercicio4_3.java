public class ejercicio4_3 {

    public static boolean esVocal(char letra) {
        char letraMinuscula = Character.toLowerCase(letra);
        return "aeiou".indexOf(letraMinuscula) != -1;
    }

    public static void main(String[] args) {
        System.out.println(esVocal('a')); // true
        System.out.println(esVocal('A')); // true
        System.out.println(esVocal('c')); // false
        System.out.println(esVocal('@')); // false
    }
}
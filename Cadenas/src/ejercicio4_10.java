public class ejercicio4_10 {
    public static String domingoDePascua(int anio) {
        int a = anio % 19;
        int b = anio / 100;
        int c = anio % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 19 * l) / 433;
        int n = (h + l - 7 * m + 90) / 25;
        int p = (h + l - 7 * m + 33 * n + 19) % 32;

        String mes = (n < 10) ? "0" + n : "" + n;
        String dia = (p < 10) ? "0" + p : "" + p;

        return anio + "/" + mes + "/" + dia;
    }
    public static void main(String[] args) {
        System.out.println(domingoDePascua(2024));
        System.out.println(domingoDePascua(2025));
        System.out.println(domingoDePascua(1961));
        System.out.println(domingoDePascua(2038));
    }
}

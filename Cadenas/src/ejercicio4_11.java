public class ejercicio4_11 {
    public static String hexString(int r, int g, int b) {
        return String.format("%02X%02X%02X", r, g, b);
    }

    public static void main(String[] args) {
        System.out.println(hexString(0, 0, 0));
        System.out.println(hexString(255, 255, 255));
        System.out.println(hexString(12, 15, 77));
        System.out.println(hexString(128, 64, 32));
    }
}

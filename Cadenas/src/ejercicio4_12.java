public class ejercicio4_12 {

    public static boolean correoElectronicoValido(String correo) {
        int cantidadArrobas = correo.length() - correo.replace("@", "").length();
        if (cantidadArrobas != 1) {
            return false;}
        int posArroba = correo.indexOf("@");
        int posPunto = correo.lastIndexOf(".");
        if (posArroba == -1 || posPunto == -1) {
            return false;
        }
        if (posArroba == 0) {
            return false;
        }
        if (posPunto - posArroba <= 1) {
            return false;
        }
        if (posPunto == correo.length() - 1) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("abc@me.com → " + correoElectronicoValido("abc@me.com"));       // true
        System.out.println("abc@me. → " + correoElectronicoValido("abc@me."));             // false
        System.out.println("abc@.com → " + correoElectronicoValido("abc@.com"));           // false
        System.out.println("abc@me..com → " + correoElectronicoValido("abc@me..com"));     // false
        System.out.println("abcme.com → " + correoElectronicoValido("abcme.com"));         // false
        System.out.println("@me.com → " + correoElectronicoValido("@me.com"));             // false
        System.out.println("abc@me.c → " + correoElectronicoValido("abc@me.c"));           // true
        System.out.println("abc@@me.com → " + correoElectronicoValido("abc@@me.com"));     // false
    }
}

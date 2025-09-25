//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(empiezaConMinuscula("nicasio"));

  }

    public static boolean empiezaConMinuscula(String s){
        var primerCaracter = s.charAt(0);
        return Character.isLowerCase(primerCaracter);
    }
}
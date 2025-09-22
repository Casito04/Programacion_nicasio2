import java.util.Scanner;

public class calcasio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        double numero1 = entrada.nextDouble();

        // Pedir el operador
        System.out.print("Escribe la operación (+, -, *, /, ^): ");
        char signo = entrada.next().charAt(0);

        // Pedir el segundo número
        System.out.print("Escribe el segundo número: ");
        double numero2 = entrada.nextDouble();

        double resultado;

        switch (signo) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 == 0) {
                    System.out.println("No se puede dividir entre 0.");
                    return;
                }
                resultado = numero1 / numero2;
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
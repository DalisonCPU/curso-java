import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float nota1 = 0, nota2 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = teclado.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.printf("A média é %.1f", media);
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um número que deseja saber sua tabela de multiplicação: ");
            int number = input.nextInt();
            String newline = System.lineSeparator();
            System.out.print("Tabela de multiplicação de " + number + " : " + newline);
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + number * i);
            }
        }

    }
}

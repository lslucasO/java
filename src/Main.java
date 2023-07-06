import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");

    }
}
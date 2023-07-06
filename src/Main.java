import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N1: ");
        float n1 = scanner.nextFloat();
        System.out.println("N2: ");
        float n2 = scanner.nextFloat();

        float media = (n1 + n2) / 2;
        String situacao;

        if (media > 6){
            situacao = "aprovado";
        } else if (media == 6){
            situacao = "passou se arrastando";
        } else{
            situacao = "reprovado!!";
        }

        System.out.println("Sua média foi de: " + media);
        System.out.println("Sua situação: " + situacao.toUpperCase());

    }
}
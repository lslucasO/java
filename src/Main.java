import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> itemsList = new ArrayList<String>();


        boolean continuar = true;
        int i = 5;
        while (continuar) {
            System.out.println("Adicione objetos a uma lista: ");
            String object = scanner.nextLine();
            itemsList.add(object.toUpperCase());

            System.out.println("Objeto adicionado! deseja continuar? [S/N]");
            String escolha = scanner.nextLine();

            if (escolha.toUpperCase().equals("N")) {
                continuar = false;
            }
        }
        for (String item : itemsList){
            System.out.println(item);
        }
    }
}
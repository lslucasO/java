import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String[][] frutas = {{"Banana", "Morango"}, {"Abacate", "Melancia"}};
        int index = 0;
        while (index < frutas.length) {
            for (String item : frutas[index]) {
                System.out.println(item.toUpperCase());
            }
            index++;
        }
    }
}
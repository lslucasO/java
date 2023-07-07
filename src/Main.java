import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> jogo = new ArrayList<String>();
        jogo.add("pedra");
        jogo.add("papel");
        jogo.add("tesoura");

        System.out.println("BEM VINDO AO JOGO PEDRA, PAPEL OU TESOURA\nFAÇA SUA JOGADA: ");
        System.out.println("[0] PEDRA\n[1] PAPEL\n[2] TESOURA");
        int user_Choice = scanner.nextInt();
        int maquina_Choice = random.nextInt(2);

        System.out.println("VOCÊ ESCOLHEU: " + jogo.get(user_Choice).toUpperCase());
        System.out.println("MAQUINA ESCOLHEU: " + jogo.get(maquina_Choice).toUpperCase());

        if (user_Choice == maquina_Choice) {
            System.out.println("EMPATE!!");
        } else if (jogo.get(user_Choice).equals("pedra") && jogo.get(maquina_Choice).equals("tesoura")){
            System.out.println("VOCÊ VENCEU!");
        } else if (jogo.get(user_Choice).equals("tesoura") && jogo.get(maquina_Choice).equals("papel")){
            System.out.println("VOCÊ VENCEU!");
        } else if (jogo.get(user_Choice).equals("papel") && jogo.get(maquina_Choice).equals("pedra")){
            System.out.println("VOCÊ VENCEU!!");
        } else{
            System.out.println("VOCÊ PERDEU!");
        }
    }
}
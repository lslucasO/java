import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    private static ArrayList<String> jogo = new ArrayList<String>(); /* Variavel Global */
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static int user_Choice;
    private static int maquina_Choice;

    static void createArray() { /* Função */
        jogo.add("pedra");
        jogo.add("papel");
        jogo.add("tesoura");
    }
    static void randomizeChoice(){
        user_Choice = scanner.nextInt();
        maquina_Choice = random.nextInt(2);
    }
    static void announceGame(){
        System.out.println("BEM VINDO AO JOGO PEDRA, PAPEL OU TESOURA\nFAÇA SUA JOGADA: ");
        System.out.println("[0] PEDRA\n[1] PAPEL\n[2] TESOURA");
    }
    static void gameShow(){
        System.out.println("VOCÊ ESCOLHEU: " + jogo.get(user_Choice).toUpperCase());
        System.out.println("MAQUINA ESCOLHEU: " + jogo.get(maquina_Choice).toUpperCase());
    }
    static void gameResults(){
        if (user_Choice == maquina_Choice) {
            System.out.println("EMPATE!!");
        } else if (jogo.get(user_Choice).equals("pedra") && jogo.get(maquina_Choice).equals("tesoura")) {
            System.out.println("VOCÊ VENCEU!");
        } else if (jogo.get(user_Choice).equals("tesoura") && jogo.get(maquina_Choice).equals("papel")) {
            System.out.println("VOCÊ VENCEU!");
        } else if (jogo.get(user_Choice).equals("papel") && jogo.get(maquina_Choice).equals("pedra")) {
            System.out.println("VOCÊ VENCEU!!");
        } else {
            System.out.println("VOCÊ PERDEU!");
        }
    }

    public static void main(String[] args){

        createArray();
        announceGame();
        randomizeChoice();
        gameShow();
        gameResults();

    }
}
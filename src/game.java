import java.util.Scanner;

public class game{
    public static void Game(){

        Name();
        System.out.println();
		Board x = new Board();
        x.Board();
    }

    //Insere os nomes dos jogadores
    static void Name(){
        Scanner s = new Scanner(System.in);
        System.out.println("\nPlayer 1 uses X and player 2 uses O. ");

        System.out.print("Player 1 name: ");
        String p1 = s.nextLine(); //player 1 uses X

        System.out.print("Player 2 name: ");
        String p2 = s.nextLine(); // player 2 uses O
    }

    //Determina o caracter que o jogador vai jogar
    static void Caracter(){
        int counter = 0;
            if (counter%2 == 0) {

            }
    }

}
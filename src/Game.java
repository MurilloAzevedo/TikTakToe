import java.util.Scanner;

public class Game {

    static String PLAYER1 = null, PLAYER2 = null;
    static int OPTION = 0;
    static Scanner SCANNER = new Scanner(System.in);

    public static void Game(){

        do {
            System.out.println("Menu:");
            System.out.println("1. New Game");
            System.out.println("2. Instruction");
            System.out.println("3. Exit \n");
            System.out.print("Enter your option: ");

            OPTION = SCANNER.nextInt();
            Menu(OPTION);

        }while (OPTION != 3);
    }

    static void Menu(int OPTION){

        switch (Game.OPTION){
            case 1 :
                newGame();
                break;
            case 2 :
                Instruction instruction = new Instruction();
                instruction.Instruction();
                break;
            case 3 :
                Exit exit = new Exit();
                exit.Exit();
                break;
        }
    }

    static void newGame(){
        Name();
        Board board = new Board();
        board.Board();
    }

    //Insere os nomes dos jogadores
    static  void Name(){
        Scanner teste = new Scanner(System.in);
        System.out.println("\nPlayer 1 uses X and player 2 uses O. ");

        System.out.print("Player 1 name: ");
        PLAYER1 = SCANNER.next(); //player 1 uses X

        System.out.print("Player 2 name: ");
        PLAYER2 = SCANNER.next(); // player 2 uses O
        System.out.println();
    }
}
import java.util.Scanner;

public class game{
    public static void Game(){

        Scanner s = new Scanner(System.in);
        String[][] board = new String[4][4]; //board 3x3

        board[1][1]=" "; 
		board[1][2]=" ";
		board[1][3]=" ";
		board[2][1]=" ";
		board[2][2]=" ";
		board[2][3]=" ";
		board[3][1]=" ";
		board[3][2]=" ";
		board[3][3]=" ";

        System.out.print("Player 1 name:");
            
            String p1 = s.nextLine(); //player 1 uses X
            s.nextLine();

            System.out.print("Player 2 name:");
            String p2 = s.nextLine(); // player 2 uses O
            s.nextLine();

            boolean gameloop = true;

            System.out.println();
				System.out.println("      +---+---+---+");
				System.out.println("      | " + board[1][1] + " | " + board[1][2] + " | " + board[1][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + board[2][1] + " | " + board[2][2] + " | " + board[2][3] + " |");
				System.out.println("      +---+---+---+");
				System.out.println("      | " + board[3][1] + " | " + board[3][2] + " | " + board[3][3] + " |");
				System.out.println("      +---+---+---+");
    }

}
import javax.print.DocFlavor;
import java.util.Scanner;

public class Board {
    final static int LINHA = 5;
    final static int COLUNA = 5;
    static int TURN = 0;
    static Scanner SCANNER = new Scanner(System.in);
    static String[][] BOARD = new String[LINHA][COLUNA];

    public void Board() {

        Initialize();
        Print();

    }

    static void Turn(){
        int p1, p2;

        for (;TURN < 10 ; TURN++){

            if (TURN%2 == 0) {
                System.out.print(Game.PLAYER1 +  " Turn : ");
                p1 = SCANNER.nextInt();
                Verification();
            }else{
                System.out.print(Game.PLAYER2 +  " Turn : ");
                p2 = SCANNER.nextInt();
                System.out.println();
            }
        }
    }

    static void Verification(){

        for (int i = 0; i < LINHA; i++){
            for (int j = 0; j < COLUNA; j++){

                if (BOARD[i][j] != "X" || BOARD[i][j] != "0" ){


                }else {
                    System.out.println("Mensagem");
                }
            }
        }
    }

    static void Print(){
        for (int l = 0; l < LINHA; l++) {
            for(int c = 0; c < COLUNA; c++) {

                if (c % 2 != 0 && l%2 ==0) {
                    System.out.print(BOARD[l][c] = "|");

                } else if (c % 2 == 0 && l%2 == 0) {
                    System.out.print(BOARD[l][c] = String.valueOf(" ") );

                }else if(l%2 != 0){
                    System.out.print(BOARD[l][c] = "-");
                }
            }

            System.out.println();
        }
        System.out.println();
    }

    static void Initialize(){
        int aux = 1;
        for (int l = 0; l < LINHA; l++) {
            for(int c = 0; c < COLUNA; c++) {

                if (c % 2 != 0 && l%2 ==0) {
                    BOARD[l][c] = "|";

                } else if (c % 2 == 0 && l%2 == 0) {
                    BOARD[l][c] = String.valueOf(aux);
                    aux++;

                }else if(l%2 != 0){
                    BOARD[l][c] = "-";
                }
            }
        }
    }
}

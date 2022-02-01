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
        Turn();

    }

    static void Turn(){
        int p1, p2;
        int[] x = new int[1];

        for (;TURN < 10 ; TURN++){

            if (TURN%2 == 0) {
                System.out.print(Game.PLAYER1 +  " Turn : ");
                p1 = SCANNER.nextInt();
                if (Verification(Position(p1))){
                    x[] = Position(p1);
                    BOARD[x[0]][x[1]] = "X";
                }
                Print();

            }else{
                System.out.print(Game.PLAYER2 +  " Turn : ");
                p2 = SCANNER.nextInt();
                if (Verification(Position(p2))){
                    x[] = Position(p2);
                    BOARD[x[0]][x[1]] = "0";
                }
                System.out.println();
            }
        }
    }

    static int[] Position(int var){
        int x = 0, y = 0;

        for (int i = 0; i < LINHA; i++){
            for (int j = 0; j < COLUNA; j++){
                if(BOARD[i][j] == String.valueOf(var)){
                    x = i;
                    y = j;
                }
            }
        }
        return new int[] {x, y};
    }

    static boolean Verification(int[] x){

        if (BOARD[x[0]][x[1]] != "X" || BOARD[x[0]][x[1]] != "0" ){
            return true;
        }else{
            System.out.println("Mensagem");
            return false;
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

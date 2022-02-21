import javax.print.DocFlavor;
import java.util.Scanner;

public class Board {
    final static int LINHA = 5;
    final static int COLUNA = 5;
    static int TURN = 0;
    static Scanner SCANNER = new Scanner(System.in);
    static String[][] BOARDInit = new String[LINHA][COLUNA];
    static String[][] BOARD = new String[LINHA][COLUNA];
    static int POSITIONX = 0, POSITIONY = 0;

    public void Board() {

        Initialize();
        Print();
        Turn();

    }

    static void Turn(){
        int p1, p2;

        for (;TURN < 9 ; TURN++){

            if (TURN%2 == 0) {
                System.out.print(Game.PLAYER1 +  " Turn : ");
                p1 = SCANNER.nextInt();
                if (Verification(Position(p1))){
                    BOARD[POSITIONX][POSITIONY] = "X";
                    Winner(Position(p1));
                }
            }else{
                System.out.print(Game.PLAYER2 +  " Turn : ");
                p2 = SCANNER.nextInt();
                if (Verification(Position(p2))){
                    BOARD[POSITIONX][POSITIONY] = "0";
                    Winner(Position(p2));
                }
                System.out.println();
            }
            Print();
        }
    }

    static int[] Position(int var){

        for (int i = 0; i < LINHA; i++){
            for (int j = 0; j < COLUNA; j++){
                if(BOARDInit[i][j].equals(Integer.toString(var))){ //Não se compara Strings com "=="
                    POSITIONX = i;
                    POSITIONY = j;
                }
            }
        }
        return new int[] {POSITIONX, POSITIONY};
    }

    static boolean Verification(int[] x){

        if (BOARD[x[0]][x[1]].equals("X")  || BOARD[x[0]][x[1]].equals("0")){
            System.out.println("Mensagem");
            return false;
        }else{
            return true;
        }
    }

    static void Print(){
        for (int l = 0; l < LINHA; l++) {
            for(int c = 0; c < COLUNA; c++) {
                if (c % 2 == 0 && l%2 == 0) {

                     if(BOARD[l][c] == null) {
                        System.out.print(BOARD[l][c] = " ");
                    }else {
                         System.out.print(BOARD[l][c]);
                     }

                }else if (c % 2 != 0 && l%2 ==0) {
                    System.out.print(BOARD[l][c] = "|");

                } else if(l%2 != 0){
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

                if (c % 2 != 0 && l%2 == 0) {
                    BOARDInit[l][c] = "|";

                } else if (c % 2 == 0 && l%2 == 0) {
                    BOARDInit[l][c] = String.valueOf(aux);
                    aux++;

                }else if(l%2 != 0){
                    BOARDInit[l][c] = "-";
                }
            }
        }
    }

    static boolean Winner(int[] x) {

        Exit exit = new Exit();
        boolean winner = false;

        int counterxX = 0,counteryX = 0, counterDPX = 0, counterDSX = 0;
        int counterx0 = 0,countery0 = 0, counterDP0 = 0, counterDS0 = 0;
        int aux = 4;

        for(int line = 0; line < LINHA; line++){
            for ( int colunm = 0; colunm < COLUNA; colunm++){

                if (BOARD[line][colunm].equals("X") && colunm == line){
                    counterDPX++;
                    if (counterDPX == 3){
                        Print();
                        winner = true;
                        if (TURN % 2 == 0) {
                            System.out.println("The winner is " + Game.PLAYER1);
                            exit.Exit();
                        } else {
                            System.out.println("The winner is " + Game.PLAYER2);
                            exit.Exit();
                        }
                    }
                }else
                    if (BOARD[line][colunm].equals("X") && line ==  aux - colunm){
                    counterDSX++;
                    if (counterDSX == 3){
                        Print();
                        winner = true;
                        if (TURN % 2 == 0) {
                            System.out.println("The winner is " + Game.PLAYER1);
                            exit.Exit();
                        } else {
                            System.out.println("The winner is " + Game.PLAYER2);
                            exit.Exit();
                        }
                    }
                }else if (BOARD[line][colunm].equals("0") && colunm == line){
                    counterDP0++;
                    if (counterDP0 == 3){
                        Print();
                        winner = true;
                        if (TURN % 2 == 0) {
                            System.out.println("The winner is " + Game.PLAYER1);
                            exit.Exit();
                        } else {
                            System.out.println("The winner is " + Game.PLAYER2);
                            exit.Exit();
                        }
                    }
                }else if (BOARD[line][colunm].equals("0") && line ==  aux - colunm){
                    counterDS0++;
                    if (counterDS0 == 3){
                        Print();
                        winner = true;
                        if (TURN % 2 == 0) {
                            System.out.println("The winner is " + Game.PLAYER1);
                            exit.Exit();
                        } else {
                            System.out.println("The winner is " + Game.PLAYER2);
                            exit.Exit();
                        }
                    }
                }
            }
         }


//                    if (BOARD[0][0].equals(BOARD[0][2]) && BOARD[0][0].equals(BOARD[0][4]) && BOARD[0][0].equals("X")) {
//                        Print();
//                        winner = true;
//                        if (TURN % 2 == 0) {
//                            System.out.println("The winner is " + Game.PLAYER1);
//                            exit.Exit();
//                        } else {
//                            System.out.println("The winner is " + Game.PLAYER2);
//                            exit.Exit();
//                        }
//                    }else if (BOARD[2][0].equals(BOARD[2][2]) && BOARD[2][0].equals(BOARD[2][4]) && BOARD[0][0].equals("X")) {
//                        Print();
//                        winner = true;
//                        if (TURN % 2 == 0) {
//                            System.out.println("The winner is " + Game.PLAYER1);
//                            exit.Exit();
//                        } else {
//                            System.out.println("The winner is " + Game.PLAYER2);
//                            exit.Exit();
//                        }
//                    } else if(BOARD[4][0].equals(BOARD[4][2]) && BOARD[4][0].equals(BOARD[4][4]) && BOARD[0][0].equals("X")){
//                        Print();
//                        winner = true;
//                        if (TURN%2 == 0){
//                            System.out.println("The winner is " + Game.PLAYER1);
//                            exit.Exit();
//                        }else{
//                            System.out.println("The winner is " + Game.PLAYER2);
//                            exit.Exit();
//                        }
//                } else if(BOARD[0][0].equals(BOARD[2][0]) && BOARD[0][0].equals(BOARD[4][0]) && BOARD[0][0].equals("X")){
//                        Print();
//                        winner = true;
//                        if (TURN%2 == 0){
//                            System.out.println("The winner is " + Game.PLAYER1);
//                            exit.Exit();
//                        }else{
//                            System.out.println("The winner is " + Game.PLAYER2);
//                            exit.Exit();
//                        }
//                }
        return winner;
    }
}

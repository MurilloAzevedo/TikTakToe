import java.util.Scanner;

public class Teste {
    public static void Teste() {
    }
}
//import java.util.Scanner;
//
//public class Board {
//    final static int LINHA = 5;
//    final static int COLUNA = 5;
//    static int TURN = 0;
//    static Scanner SCANNER = new Scanner(System.in);
//    static String[][] BOARDInit = new String[LINHA][COLUNA];
//    static String[][] BOARD = new String[LINHA][COLUNA];
//    static int POSITIONX = 0, POSITIONY = 0;
//
//    public void Board() {
//
//        Initialize();
//        // Print();
//        Turn();
//
//    }
//
//    static void Turn(){
//        int p1, p2;
//        int[] x = new int[1];
//
//        for (;TURN < 10 ; TURN++){
//
//            if(TURN > 4){
//                Print();
//            }
//
//            if (TURN%2 == 0) {
//                System.out.print(Game.PLAYER1 +  " Turn : ");
//                p1 = SCANNER.nextInt();
//                if (Verification(Position(p1))){
//                    //Print();
//                }
//            }else{
//                System.out.print(Game.PLAYER2 +  " Turn : ");
//                p2 = SCANNER.nextInt();
//                if (Verification(Position(p2))){
//                    //  Print();
//                }
//                System.out.println();
//            }
//
//        }
//    }
//
//    static int[] Position(int var){
//
//        for (int i = 0; i < LINHA; i++){
//            for (int j = 0; j < COLUNA; j++){
//                if(BOARDInit[i][j].equals(Integer.toString(var))){ //Não se compara Strings com "=="
//                    POSITIONX = i;
//                    POSITIONY = j;
//                }
//            }
//        }
//        return new int[] {POSITIONX, POSITIONY};
//    }
//
//    static boolean Verification(int[] x){
//
//        if (BOARD[x[0]][x[1]] != "X" || BOARD[x[0]][x[1]] != "0" ){
//            return true;
//        }else{
//            System.out.println("Mensagem");
//            return false;
//        }
//    }
//
//    static void Print(){
//        for (int l = 0; l < LINHA; l++) {
//            for(int c = 0; c < COLUNA; c++) {
//
//                if (c % 2 == 0 && l%2 == 0) {
//
//                    if (TURN%2 == 0 && POSITIONX == l && POSITIONY == c) {
//                        BOARD[POSITIONX][POSITIONY] = "X";
//                        System.out.print(BOARD[POSITIONX][POSITIONY]);
//                    }else if (TURN%2 != 0 && POSITIONX == l && POSITIONY == c){
//                        BOARD[POSITIONX][POSITIONY] = "0";
//                        System.out.print(BOARD[POSITIONX][POSITIONY]);
//                    } else if(c % 2 == 0 && l%2 == 0) {
//                        System.out.print(BOARD[l][c] = " ");
//                    }
//
//                }else if (c % 2 != 0 && l%2 ==0) {
//                    System.out.print(BOARD[l][c] = "|");
//
//                } else if(l%2 != 0){
//                    System.out.print(BOARD[l][c] = "-");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    static void Initialize(){
//        int aux = 1;
//        for (int l = 0; l < LINHA; l++) {
//            for(int c = 0; c < COLUNA; c++) {
//
//                if (c % 2 != 0 && l%2 == 0) {
//                    BOARDInit[l][c] = "|";
//
//                } else if (c % 2 == 0 && l%2 == 0) {
//                    BOARDInit[l][c] = String.valueOf(aux);
//                    aux++;
//
//                }else if(l%2 != 0){
//                    BOARDInit[l][c] = "-";
//                }
//            }
//        }
//    }
//}

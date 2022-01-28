public class Board {
    final static int LINHA = 5;
    final static int COLUNA = 5;
    static String[][] BOARD = new String[LINHA][COLUNA];

    public static void Board() {

        int aux = 1;
        for (int l = 0; l < LINHA; l++) {
            for(int c = 0; c < COLUNA; c++) {

                if (c % 2 != 0 && l%2 ==0) {
                    System.out.print(BOARD[l][c] = "|");

                } else if (c % 2 == 0 && l%2 == 0) {
                    System.out.print(BOARD[l][c] = String.valueOf(aux) );
                    aux++;

                }else if(l%2 != 0){
                    System.out.print(BOARD[l][c] = "-");
                }
            }
            System.out.println();
        }
    }

    //Vincula o número de cada posição
//    static void NumeroPosição(){
//        int aux = 1;
//        for (int l = 0; l < LINHA; l++) {
//            for(int c = 0; c < COLUNA; c++) {
//                if (c % 2 == 0 && l%2 == 0) {
//                    System.out.print(BOARD[l][c] = String.valueOf(aux));
//                    aux++;
//                }
//            }
//        }
//    }
}

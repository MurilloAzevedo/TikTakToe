import java.security.cert.X509Certificate;

public class Board {
    final static int linha = 5;
    final static int coluna = 5;
    static String[][] aux = new String[linha][coluna];

    static String[][] board = new String[linha][coluna];

    public static void Board() {

        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {

//				if(l == 1 && c ==1) {
//					board[1][1] = "x";
//					aux[l][c] = board[1][1];
//					System.out.print(board[1][1]);
//				}

                if (l % 2 == 0) {
                    if (c % 2 == 0 && c > 0) {
                        board[l][c] = "|";
                        System.out.print(board[l][c]);
                    } else if(aux[l][c] == null ){
                        System.out.print(" ");
                    }
                } else if (l % 2 != 0) {
                    board[l][c] = "- ";
                    System.out.print(board[l][c]);
                }
            }
            System.out.println();
        }

    }
}

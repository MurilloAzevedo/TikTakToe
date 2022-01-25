import java.security.cert.X509Certificate;

public class Board {
    static int  LINE =  4;
    static int COLUMN = 4;

    public static void Board() {

        for (int i = 0; i <= LINE; i++) {

            for (int j = 0; j <= COLUMN; j++) {

                if (i % 2 == 0){
                    if (j % 2 == 0 && j > 0) {
                        System.out.print("|  ");
                    }
                    else {
                        System.out.print(" ");
                    }

                }else if( i % 2 != 0 && i > 0  )
                    System.out.print("- ");
            }

            System.out.println();
        }
    }
}

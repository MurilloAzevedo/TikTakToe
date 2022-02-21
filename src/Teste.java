import java.util.Scanner;

public class Teste {
    static final int SIZE = 5;
    static String[][] MATRIX = new String[SIZE][SIZE];

    public static void Teste() {
        int counter = 0;
        int aux = 4;
        for(int line = 0; line < SIZE; line++){
            for ( int colunm = 0; colunm < SIZE; colunm++){

                if (line ==  aux - colunm){
                    System.out.print(MATRIX[line][colunm] ="B");
                }else if(colunm == 1 && line == 0){
                    System.out.print(MATRIX[line][colunm] ="X");
                }
                else{
                    System.out.print(MATRIX[line][colunm] ="0");
                }

                if (MATRIX[line][colunm].equals("X") && colunm == line){

                }else if (MATRIX[line][colunm].equals("B") && line ==  aux - colunm){
                    counter++;
                }
            }
            System.out.println();
        }
        System.out.print("numero de X : " + counter);
    }
}


public class Teste {
    static int SIZE = 5;
    static String[][] x = new String[SIZE][SIZE];

    public static void Teste(){
        int aux = 1;
        for (int L = 0; L < SIZE ; L++) {
            for(int C = 0; C < SIZE ; C++) {

                if (C % 2 != 0 && L%2 ==0) {
                    System.out.print(x[L][C] = "|");

                } else if (C % 2 == 0 && L%2 == 0) {
                    System.out.print(x[L][C] = String.valueOf(aux) );
                    aux++;
                }else if(L%2 != 0){
                    System.out.print(x[L][C] = "-");
                }
            }
            System.out.println();
        }
    }
}

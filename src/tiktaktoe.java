import java.util.Scanner;

public class tiktaktoe{
    static int I = 0;

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int menu = 0;


        System.out.println("Menu:");
        System.out.println("1. New Game");
        System.out.println("2. Instruction");
        System.out.println("3. Exit \n");

        System.out.print("Enter your option: ");
        menu = s.nextInt();

        if (menu == 2){
            instruction i = new instruction();
            i.Instruction();
        }

        if (menu == 3){
            exit e = new exit();
            e.Exit();
        }


        if (menu == 1) {
            game g = new game();
            g.Game();
        }
    }
    
}

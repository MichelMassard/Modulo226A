import java.util.Scanner;
public class Coordinator {
    Scanner in = new Scanner(System.in);
    System.out.print("Inserire coordinata [0;4]: ");
    String input = in.nextLine();
        System.out.println(" 01234");
        for (int i = 0; i < 5; i++) {
            if (i == riga) {
                System.out.print(i + " ");
                for (int j = 0; j < 5; j++) {
                    if (j == colonna) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(i + "     ");
            }
        }
}
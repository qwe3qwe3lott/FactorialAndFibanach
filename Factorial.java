import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextInt();
        long y = 1;
        if(x < 0) {
            System.out.println("Число отрицательно!");
        } else if(x == 0) {
            System.out.println("1");
        } else {
            for(int i = 0; i < x; i++) {
                y = y*(i+1);
            }
            System.out.println("Факториал: " + y);
        }
    }
}

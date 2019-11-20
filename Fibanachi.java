import java.util.Scanner;
import java.util.ArrayList;
public class Fibanachi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите длину последовательности(больше 1): ");
        int n = in.nextInt();
        if(n>1) {
            System.out.println("Введите 2 первых элемента: ");
            list.add(in.nextInt());
            list.add(in.nextInt());
            if (((list.get(0) == 1)&&(list.get(1) == 1))||(list.get(0) == 0)&&(list.get(1) == 1)) {
                if (n > 2) System.out.println("Введите последующие элементы: ");
                for(int i = 2; i < (n); i++) {
                    list.add(list.get(i-2)+list.get(i-1));
                }
                System.out.println("Последовательность Фибаначи: ");
                for(int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            } else {
                System.out.println("Нелязя построить последовательность фибаначи");
            }
        } else {
            System.out.println("Длина последовательности должна быть больше одного элемента!");
        }
    }
}

import java.util.ArrayList;
public class RecursionWay {
    public static long fact(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }
    public static int fib( int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(fact(5));
        list.add(0);
        list.add(1);
        for (int i = 0; i < 5; i++) {
            list.add(fib(list.get(i),list.get(i+1)));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}

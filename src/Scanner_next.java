import java.util.Scanner;

public class Scanner_next {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = scan.next();
        System.out.println(phrase1);
    }
}

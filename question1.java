import java.util.Scanner;
public class question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number: ");
        int n = sc.nextInt();
        if (Math.sqrt(n) == (int)Math.sqrt(n)) {
            System.out.println("The number is a perfect square");
        } else {
            System.out.println("The number is not a perfect square");
            
        }
    }
}
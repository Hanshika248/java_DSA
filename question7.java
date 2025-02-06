import java.util.*;
public class question7 {
    public static int order(int x){
        int n = 0;
        while(x > 0){
            n++;
            x = x / 10;
        }
        return n;
    }

    public static void isArmstrong(int x){
        int n = order(x);
        int temp = x;
        int sum = 0;
        while(temp > 0){
            int r = temp % 10;
            sum = sum + (int)Math.pow(r, n);
            temp = temp / 10;
        }
        if(sum == x){
            System.out.println("The number is an Armstrong number");
        }else{
            System.out.println("The number is not an Armstrong number");
        }
    }
    public static void main(String[] args) {
        int n = 153;
        isArmstrong(n);
    }
}

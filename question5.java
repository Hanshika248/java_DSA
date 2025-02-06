import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sum: ");
        int sum = sc.nextInt();
        System.out.println("Enter a size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println("The pair is: " + arr[i] + " " + arr[j]);
                }
            }
        }

    }
}

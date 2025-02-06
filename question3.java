public class question3 {

    public static void printDigit(int n){
        int arr[] = new int[50];
        int i = 0;
        int j, r;
        while(n > 0){
            r = n % 10;
            arr[i] = r;
            i++;
            n = n / 10;
        }
        for(j = i - 1; j >= 0; j--){
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args) {
      int n = 4567;
       printDigit(n);
    }
} 
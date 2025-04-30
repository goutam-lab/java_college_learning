import java.util.Scanner;
public class fabnoic_series {
    public static int fab(int n){
        if(n==0 || n == 1 ){
            return n ; 
        }
        return fab(n-1) + fab(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(fab(i) + " ");
        }

    }
}
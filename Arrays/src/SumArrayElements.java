import java.util.Scanner;

public class SumArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String ans = "";

        if(n%2==1 || (n%2==0) && (n>=6 && n<=20) ){
            ans = "Weird";
        }
        else{
            if((n%2==0) && (n>=2 && n<=5) || (n>20)){
                ans="Not Weird";
            }
        }
        System.out.println(ans);
    }
}

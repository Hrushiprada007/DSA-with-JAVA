import java.util.Scanner;

public class Divsible_Number5 {
    public static void main(String[] args) {
        int d;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        d=sc.nextInt();
        if(d%5==0){
            System.out.println("This number is divisble by 5");
        }
        else{
            System.out.println("Not divisible by 5");
        }
    }
}

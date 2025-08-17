//count the digits
//import java.util.Scanner;
//
//public class CountNumber {
//    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        n = sc.nextInt();
//        int count = 0;
//        while (n>0){
//            n = n/10;//update n here
//                count++;// count the digits
//        }
//        System.out.println("Number of digits:"+count);
//
//
//    }
//}

//sum of the digits

import java.util.Scanner;

class SUMDIGIT{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int digit= n%10;
            sum= sum + digit;
            n/=10;


        }
        System.out.println("The sum of digits::"+sum);
    }
}


//Reverse the digits of a number

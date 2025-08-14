//Take  3 numbers input and tell if they can be the sides of a traingle.

import java.util.Scanner;

public class Check_Triangle {
    public static void main(String[] args) {
        int p,b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p,b and h value:");
        p= sc.nextInt();
        b= sc.nextInt();
        h=sc.nextInt();
        System.out.println("Enter three numbers:");
        if(p+b > h && b+h>p && p+h>b){
            System.out.println("it can made a triangle");
        }
        else{
            System.out.println("Not a trangle");
        }


    }
}

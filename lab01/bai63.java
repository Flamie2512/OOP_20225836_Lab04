package javabasics;

import java.util.Scanner;

public class bai63 {
    public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("nhap n: ");
    int n = keyboard.nextInt();
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    keyboard.close();

}
}
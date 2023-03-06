package baitap;

import java.util.Scanner;

public class Bai1 { 
 public static void main(String[] args) {
 int a,b;
 Scanner scanner =new Scanner(System.in);
 System.out.println("Nhap vao so a:");
 a=scanner.nextInt();
 System.out.println("Nhap vao so b:");
 b=scanner.nextInt();
 System.out.println("a+b="+(a+b));
 System.out.println("a-b="+(a-b));
 System.out.println("a*b="+(a*b));
 System.out.println("a/b="+(a/b));
 System.out.println("a % b="+(a%b));
 System.out.println(a>b);
 System.out.println(a<b);
 System.out.println(a=b);
 System.out.println(a<=b);
 System.out.println(a>=b);
 System.out.println(a!=b);
 }
}

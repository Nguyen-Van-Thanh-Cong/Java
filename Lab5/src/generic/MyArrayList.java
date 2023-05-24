package generic;

import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] args) {
		   
		   ArrayList mylist = new ArrayList();
	
		   mylist.add(10);
		   mylist.add("Hello");
		   mylist.add(true);
		   mylist.add(15.75);
	
		   int i = (Integer)mylist.get(0);
		   String s = (String)mylist.get(1);
		   boolean b = (boolean)mylist.get(2);
		   double d = (double)mylist.get(3);
	
		   System.out.println("Số nguyên : " + i);
		   System.out.println("Chuỗi: " + s);
		   System.out.println("Giá trị boolean: " + b);
		   System.out.println("Số thực: " + d);
		 }
	
}

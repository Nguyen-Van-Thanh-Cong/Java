
public class Main {
public static void main(String[]args) {
	GVCoHuu gvc=new GVCoHuu();
	GVThinhGiang gvm=new GVThinhGiang();
	
	System.out.println("Luong thang cua :");
	gvc.nhap();
	gvc.tinhluong();
	gvc.in();
	 
	System.out.println("Luong thang cua :");
	gvm.nhap();
	gvm.tinhluong();
	gvm.in();
}
}

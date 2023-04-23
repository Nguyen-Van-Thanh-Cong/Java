import java.util.Scanner;

public class SinhVien extends Nguoi {
private String lop,nganh;

public SinhVien() {
	super();
}

public SinhVien(String lop, String nganh) {
	super();
	this.lop = lop;
	this.nganh = nganh;
}
public void nhap() {
	super.nhap();
	Scanner sc=new Scanner (System.in);
	System.out.println("Lop,Nganh:");
	lop=sc.nextLine();
	nganh=sc.nextLine();
}
public void xuat() {
super.xuat();
System.out.println("Lop:"+this.lop+";Nganh:"+this.nganh);
}

public String getLop() {
	return lop;
}

public void setLop(String lop) {
	this.lop = lop;
}

public String getNganh() {
	return nganh;
}

public void setNganh(String nganh) {
	this.nganh = nganh;
}

@Override
public String toString() {
	return "SinhVien [lop=" + lop + ", nganh=" + nganh + "]";
}

}

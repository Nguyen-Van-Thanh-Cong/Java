import java.util.Scanner;

public class BenhNhan extends Nguoi {
 private String tiensu,chuandoan;

public BenhNhan() {
	super();

}

public BenhNhan(String tiensu, String chuandoan) {
	super();
	this.tiensu = tiensu;
	this.chuandoan = chuandoan;
}
public void nhap() {
	super.nhap();
	Scanner sc=new Scanner (System.in);
	System.out.println("Tien su,Chuan doan:");
	tiensu=sc.nextLine();
	chuandoan=sc.nextLine();
}
public void xuat() {
	super.xuat();
	System.out.println("Tien su:"+this.tiensu+";Chuan doan:"+this.chuandoan);
}
public String getTiensu() {
	return tiensu;
}

public void setTiensu(String tiensu) {
	this.tiensu = tiensu;
}

public String getChuandoan() {
	return chuandoan;
}

public void setChuandoan(String chuandoan) {
	this.chuandoan = chuandoan;
}

@Override
public String toString() {
	return "BenhNhan [tiensu=" + tiensu + ", chuandoan=" + chuandoan + "]";
}


 
 
}
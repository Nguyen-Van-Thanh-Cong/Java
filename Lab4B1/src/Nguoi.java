import java.util.Scanner;

public class Nguoi {
 private String  ten;
 private int tuoi;
 private String gioitinh;
 
 
public Nguoi() {
	super();
}


public Nguoi(String ten, int tuoi, String gioitinh) {
	super();
	this.ten = ten;
	this.tuoi = tuoi;
	this.gioitinh = gioitinh;
}
public void nhap(){
	Scanner sc = new Scanner (System.in);
	System.out.println("Ten,Gioi tinh,tuoi:");
	ten=sc.nextLine();
    gioitinh=sc.nextLine();
    tuoi=sc.nextInt();
}
public void xuat() {
	System.out.println("Ten:"+this.ten+";Gioi Tinh:"+this.gioitinh+";Tuoi:"+this.tuoi);
}
public String getTen() {
	return ten;
}


public void setTen(String ten) {
	this.ten = ten;
}


public int getTuoi() {
	return tuoi;
}


public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}


public String getGioitinh() {
	return gioitinh;
}


public void setGioitinh(String gioitinh) {
	this.gioitinh = gioitinh;
}


@Override
public String toString() {
	return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + "]";
}
 
 
}

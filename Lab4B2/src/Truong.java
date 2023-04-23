import java.util.Scanner;

public class Truong extends SinhVien{
private String tentruong,diachi,hieutruong;

public Truong() {
	super();
}

public Truong(String tentruong, String diachi, String hieutruong) {
	super();
	this.tentruong = tentruong;
	this.diachi = diachi;
	this.hieutruong = hieutruong;
}
public void nhap() {
	super.nhap();
	Scanner sc=new Scanner(System.in);
	System.out.println("Ten truong,Dia chi,Hieu truong:");
	tentruong=sc.nextLine();
	diachi=sc.nextLine();
	hieutruong=sc.nextLine();
}
public void xuat() {
	super.xuat();
	System.out.println("Ten truong:"+this.tentruong+";Dia chi:"+this.diachi+";Hieu truong:"+this.hieutruong);
}
public String getTentruong() {
	return tentruong;
}

public void setTentruong(String tentruong) {
	this.tentruong = tentruong;
}

public String getDiachi() {
	return diachi;
}

public void setDiachi(String diachi) {
	this.diachi = diachi;
}

public String getHieutruong() {
	return hieutruong;
}

public void setHieutruong(String hieutruong) {
	this.hieutruong = hieutruong;
}

@Override
public String toString() {
	return "Truong [tentruong=" + tentruong + ", diachi=" + diachi + ", hieutruong=" + hieutruong + "]";
}

}

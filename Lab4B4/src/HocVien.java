import java.util.Scanner;

public abstract class HocVien {
    protected String hoten,diachi,loaichuongtrinh,loai;

	
	public HocVien() {
		super();
	}

	public HocVien(String hoten, String diachi, String loaichuongtrinh, String loai) {
		super();
		this.hoten = hoten;
		this.diachi = diachi;
		this.loaichuongtrinh = loaichuongtrinh;
		this.loai = loai;
	}

	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ho ten,Dia chi,Loai chuong trinh dang ki,Loai uu tien:");
		hoten=sc.nextLine();	
		diachi=sc.nextLine();	
		loaichuongtrinh=sc.nextLine();	
		loai=sc.nextLine();	
	}
	
	public abstract int hocphi() ;
	
	
	public void in() {
		System.out.println("Ho ten:"+this.hoten+";Dia chi:"+this.diachi+";Loai chuong trinh:"+this.loaichuongtrinh+";Loai uu tien:"+this.loai);
	}

	
	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getLoaichuongtrinh() {
		return loaichuongtrinh;
	}

	public void setLoaichuongtrinh(String loaichuongtrinh) {
		this.loaichuongtrinh = loaichuongtrinh;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	@Override
	public String toString() {
		return "HocVien [hoten=" + hoten + ", diachi=" + diachi + ", loaichuongtrinh=" + loaichuongtrinh + ", loai="
				+ loai + "]";
	}

	
}

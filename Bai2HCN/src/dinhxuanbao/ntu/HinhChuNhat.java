package dinhxuanbao.ntu;
import java.util.Scanner;

public class HinhChuNhat {

	public static void main(String[] args) {
		System.out.println("CT Hiển thị chu vi diện tính và cạnh nhỏ nhất của hình chữ nhật");
		double chieuDai;
		double chieuRong;
		double chuVi;
		double dienTich;
		
		Scanner banPhim = new Scanner(System.in);
		System.out.println("Nhập vào chiều dài của hình chữ nhật: ");
		chieuDai = banPhim.nextDouble();
		System.out.println("Nhập vào chiều rộng của hình chữ nhật: ");
		chieuRong = banPhim.nextDouble();
		
		chuVi = (chieuDai + chieuRong) * 2;
		dienTich = chieuDai * chieuRong;
		double canhNho = Math.min(chieuDai,chieuRong);
		
		System.out.println("Chu vi của hình chữ nhật là: "+ chuVi);
		System.out.println("Diện tích của hình chữ nhật là: "+ dienTich);
		System.out.println("Cạnh nhỏ của hình chữ nhật là: "+ canhNho);
	}

}

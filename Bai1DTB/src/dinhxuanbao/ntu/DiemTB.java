package dinhxuanbao.ntu;
import java.util.Scanner;

public class DiemTB {

	public static void main(String[] args) {
		System.out.println("CT Hiển thị điểm tb của sinh viên");
		String hovaten;
		double DiemTB;
		
		Scanner banPhim = new Scanner(System.in);
		System.out.println("Nhập vào họ tên của sinh viên: ");
		hovaten = banPhim.nextLine();
		System.out.println("nhập vào điểm trung bình của sinh viên: ");
		DiemTB = banPhim.nextDouble();
		
		System.out.println("Họ và tên của sinh viên: "+ hovaten);
		System.out.println("Điểm trung bình của sinh viên: "+ DiemTB);
	}

}

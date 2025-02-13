package dinhxuanbao.ntu;
import java.util.Scanner;

public class TheTichLapPhuong {

	public static void main(String[] args) {
		System.out.println("CT hiển thị thể tích của khối lập phương");
		double canh;
		
		Scanner banPhim = new Scanner(System.in);
		System.out.println("Nhập vào cạnh của khối lập phương: ");
		canh = banPhim.nextDouble();
		
		double theTich = canh * canh * canh;
		System.out.println("Thể tích của khối lập phương là: "+ theTich);
	}

}

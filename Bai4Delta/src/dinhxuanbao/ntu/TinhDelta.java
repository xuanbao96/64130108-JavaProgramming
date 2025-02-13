package dinhxuanbao.ntu;
import java.util.Scanner;

public class TinhDelta {
	public static void main(String[] args) {
		System.out.println("CT Hiển thị delta và căn bậc 2 của delta");
		double a,b,c;
		Scanner banPhim = new Scanner(System.in);
		
		System.out.println("Nhập vào hệ số a: ");
		a = banPhim.nextDouble();
		System.out.println("Nhập vào hệ số b: ");
		b = banPhim.nextDouble();
		System.out.println("Nhập vào hệ số c: ");
		c = banPhim.nextDouble();
		
		double delta = b * b - 4 * a * c;
		
		if(delta >= 0) {
			double canDelta = Math.sqrt(delta);
			System.out.println("Delta là: "+ delta);
			System.out.println("Căn của Delta là: "+ canDelta);
		} else {
			System.out.println("Delta là: "+ delta);
			System.out.println("Phương trình vô nghiệm (delta âm, không có căn bậc 2).");
		}
	}
}

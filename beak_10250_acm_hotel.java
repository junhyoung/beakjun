//10250 ACM 호텔
import java.util.Scanner;
public class ACMHotel_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int numCase;
		numCase = scanner.nextInt();
		for( int i = 0 ; i < numCase ; i++) {
			
			int H,W,N;
			H = scanner.nextInt();
			W = scanner.nextInt();
			N = scanner.nextInt();
			
			int aa, bb;
			
			String room = "";
			
			aa = N % H;
			bb = N / H + 1;
			
			if (aa == 0) {
				aa = H;
				bb = N / H;
			}
			
			room += aa;
			if(bb<10)
				room += "0";
			room += bb;
			
			System.out.println(room);
		}

	}

}

//1026 보물
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int numCase = scanner.nextInt();
		int A[] = new int[numCase];
		int B[] = new int[numCase];

		//Input
		for(int i = 0; i < numCase;i++) {
			A[i] = scanner.nextInt();
		}
		for(int i = 0; i < numCase;i++) {
			B[i] = scanner.nextInt();
		}
		
		Arrays.sort(A);
		Arrays.sort(B);

		
		
		int res = 0;
		for( int i = 0; i < numCase ; i++) {
			res += A[i] * B[numCase - i - 1];
		}
		System.out.println(res);
		
		
	}
	

}

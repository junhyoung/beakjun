//1463 1로 만들기
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		
		num = scanner.nextInt();
		
		int dp[] = new int[num + 1];
		dp[1] = 0;
		for(int i = 2 ; i <= num ; i++) {
			dp[i] = dp[i-1];
			if( i%3 == 0 )
				dp[i] = dp[i/3] < dp[i] ? dp[i/3] : dp[i];
			if( i%2 == 0 )
				dp[i] = dp[i/2] < dp[i] ? dp[i/2] : dp[i];
				
				
			dp[i]++;
//			System.out.println(i+": " +dp[i]);
		}
		
		System.out.println(dp[num]);
	}
	
	

}

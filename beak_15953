//15953_카카오코드페스티벌_
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int numCase;
		numCase = scanner.nextInt();
		for( int i = 0 ; i < numCase ; i++) {
			int first, second;
			int reward = 0;
			
			int [] first_Reward = new int [] {500,300,200,50,30,10};
			int [] second_Reward = new int [] {512,256,128,64,32};
			
			
			first = scanner.nextInt();
			second = scanner.nextInt();
			
			if(first == 0 )
				first = 100;
			if(second == 0 )
				second = 64;
			
			for(int j = 1; j <= 6 ; j ++) {
				if(first >= 0) {
					if(first > 0 && first <= j) {
						reward += first_Reward[j - 1];
					}
					first -= j ;
				}
				
				if( second >= 0 && j <= 5) {
					if( Math.pow(2,j - 1) >= second && second > 0  ) {
						reward += second_Reward[j - 1];
					}
					second  -= Math.pow(2,j - 1);
					
				}				
			}
			if (reward == 0)
				System.out.println("0");
			else
				System.out.println(reward+"0000");
		}
		
		
	}
	
	

}

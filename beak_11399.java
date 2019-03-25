//11399 ATM
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int numCase = scanner.nextInt();
		
		int wait[] = new int [numCase];
		int totalWait = 0;
		
		
		for(int i=0;i<numCase;i++) {
			wait[i] = scanner.nextInt();
		}

		Arrays.sort(wait);
		for(int i = 0; i < numCase ; i++) {
			//System.out.println(wait[i] * (numCase - i));
			totalWait += wait[i] * (numCase - i);
		}
		
		System.out.println(totalWait);
	}
	
	

}

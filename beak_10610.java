//10610 30
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String num = scanner.next();

		String[] numbers = num.split("");
		
		Arrays.sort(numbers);
		int i;
		int sum = 0;
		for(i = 0; i< num.length() ;i++) {
			sum += Integer.parseInt(numbers[i]);
			//System.out.println(numbers[i]);
		}
		//System.out.println(sum);
		
		
		if(!numbers[0].contentEquals("0")|| sum % 3 != 0 ) {
			System.out.println(-1);
		}
		else {
			for(int j = num.length() - 1 ;j >= 0 ; j--) {
				System.out.print(numbers[j]);
			}
		}
		
	}

}

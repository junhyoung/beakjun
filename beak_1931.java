//1931 회의실 배정
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int numCase = scanner.nextInt();
		conference[] C = new conference [numCase];
		
		
		for(int i = 0; i < numCase; i++) {
			
			C[i]= new conference(scanner.nextInt(), scanner.nextInt()); // main 함수는 static 함수이므로 static 선언된 class만 선언가능
		}
		
		Arrays.sort(C);
		
		int count = 0;
		int endTime = 0;
	
		for(int i=0; i<numCase;i++) {
			if(C[i].getST() >= endTime) {
				endTime = C[i].getET();
				count++;
			}
		}
		System.out.println(count);
	}
	
 static class conference implements Comparable<conference>{
		int startTime;
		int endTime;
		
		public conference(int sT,int eT){
			this.startTime = sT;
			this.endTime = eT;
		}
		public int getST() {
			return this.startTime;
		}
		public int getET() {
			return this.endTime;
		}
		public int compareTo(conference C) {
			if(this.endTime == C.endTime)
				return this.getST() - C.getST();
			else
				return this.getET() - C.getET();
			
		}
	}

}

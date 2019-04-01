//1181 단어정렬
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int numCase = scanner.nextInt();
		words [] word = new words[numCase];
		//nextInt 다음에 개행문자 제거
		scanner.nextLine();
		
		for( int i = 0; i<numCase; i++) {
			word[i] = new words(scanner.nextLine());
		}
		
		Arrays.sort(word);
		String beforeWord = "";
		for(int i=0;i<numCase;i++) {
			if(beforeWord.equals(word[i].getWord()))
				continue;
			
			System.out.println(word[i].getWord());
			beforeWord = word[i].getWord();
		}
		
	}
	
	static class words implements Comparable<words>{
		String word;
		
		words(String word){
			this.word = word;
		}
		
		int getLength() {
			return word.length();
		}
		String getWord() {
			return word;
		}
		
		public int compareTo(words A) {
			if(A.getLength() == this.getLength()) {
				return this.getWord().compareTo(A.getWord());
			}
			else {
				return this.getLength() - A.getLength();
			}
			
		}
		
	}

}

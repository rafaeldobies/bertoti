package metodos;

public class printWords {

	public static void printWords(String str) {
		
		int i= 0;
		
		while (true) {
			//System.out.println(str);
			int startWord = str.indexOf("category:",i);
			if (startWord==-1) break;
			int endWord = str.indexOf(" ",startWord);
			
			
			
			System.out.println(str.substring(startWord+9, endWord));
			String word = (str.substring(startWord+9, endWord));
			
			printWordsBackwards(word);
			i=endWord+1;
		}
		
	}
	
	public static void printWordsBackwards(String str) {
		
		int frase=str.length();
		
		frase-=1;
		for (int i=frase;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
		System.out.println("");
	}
	
	
	
	
}

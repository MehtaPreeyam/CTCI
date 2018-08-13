package ArraysAndStrings;

// Write a method that will perform basic string compression using the counts of repeated characters. So aabcccccaaa
// will output a2b1c5a3
public class StringCompression {
	public static String compress(String word){
		StringBuilder sb = new StringBuilder();
		int count=1;
		char currentChar = word.charAt(0);
		for(int i=1; i<word.length(); i++){
			if(word.charAt(i) == currentChar)
				count++;
			else{
				sb.append(currentChar);
				sb.append(count);
				currentChar = word.charAt(i);
				count = 1;
			}
		}
		sb.append(currentChar);
		sb.append(count);
		if(sb.toString().length() < word.length()){
			return sb.toString();
		}
		else return word;
	}
	public static void main(String args[]){
		System.out.println(compress("aabcccccaaa"));
	}
}

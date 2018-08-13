package ArraysAndStrings;
// Algorithm to see if a string is a permutation of another string
public class isPermutation {
	public static Boolean isPermutation(String s1, String s2){
		if(s1.length() != s2.length())
			return false;
		int[] letters = new int[128];
		char[] s_array = s1.toCharArray();
		for(char c: s_array){
			letters[c]++;
		}
		char[] s2_array=s2.toCharArray();
		for(char c: s2_array){
			letters[c]--;
			if(letters[c]<0)
				return false;
		}
		return true;
	}
	public static void main(String args[]){
		System.out.println(isPermutation("dfwfwdfwgg", "ggwfdwfwfd"));
	}

}

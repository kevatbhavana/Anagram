import java.util.*;

public class AnagramsCheck {
	public static void main(String args[]) {		
		String str1,str2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string no. 1: ");
		str1 = sc.nextLine();
		System.out.println("Enter string no. 2: ");
		str2 = sc.nextLine();
		isAnagram(str1,str2);
	}

	public static void isAnagram(String str1,String str2) {
		str1 = str1.toLowerCase();
		System.out.println("After converting to lower case str1 = "+str1);
		str2 = str2.toLowerCase();
		System.out.println("After converting to lower case str2 = "+str2);
		if(str1.length()!=str2.length()) {
			System.out.println("The two stings "+str1+" and "+str2+" are not Anagrams");
		}
		else {
			char[] word1 = str1.toCharArray();
			char[] word2 = str2.toCharArray();
			Arrays.sort(word1);
			Arrays.sort(word2);
			int result = 0;
			for(int i=0;i<word1.length;i++) {
				if(word1[i]==word2[i]){
					result = 1;
				}
				else{
					result = 0;	
				}
			}
			System.out.println("Value of result is "+result);
			if (result==1) {
				System.out.println("The two stings "+str1+" and "+str2+" are Anagrams");
			}
			else {
				System.out.println("The two stings "+str1+" and "+str2+" are not Anagrams");
			}
		}	
	}
}

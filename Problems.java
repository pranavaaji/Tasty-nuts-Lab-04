/**
 * 
 * String library: 
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
 *
 *
 */
public class Problems {

	/**
	 * Given two strings, append them together (known as "concatenation") and return
	 * the result. However, if the concatenation creates a double-char, then omit
	 * one of the chars, so "abc" and "cat" yields "abcat".
	 * 
	 * conCat("abc", "cat") -> "abcat"
	 * conCat("dog", "cat") -> "dogcat"
	 * conCat("abc", "") -> "abc"
	 * conCat("avocado", "oompa-loompa") -> "avocadoompa-loompa"
	 * 
	 * @param first
	 *            the first string
	 * @param second
	 *            the second string
	 * @return the concatenation of first and second with one occurrence of double
	 *         chars removed
	 */
	public static String conCat(String first, String second) {
		if(first.equals("") ||  second.equals("")){
			return first+second;
			
			}
		else if(first.charAt(first.length()- 1) == second.charAt(0)) {
			return first + second.substring(1);
			
		}
		
		else {
			return first + second;
		}
		 

	}

	/**
	 * In this method, you will place a (very limited) Chipotle order based on the
	 * input. The return String should be "Bowl with ____ rice and ____ fajita veggies 
	 * and _____ salsa.", where the blanks are filled using the instructions below. 
	 * If the boolean guac is true, add a space and "Guac please." at the end.
	 * 
	 * For examples, please see the public tests. You may assume all inputs will be valid.
	 * 
	 * @param rice
	 *            'b' or 'B' for "brown", 'w' or 'W' for "white"
	 * @param fajitas
	 *            0 for "no", <10 for "some", >=10 for "a lot of"
	 * @param salsa
	 *            1 for "pico", 2 for "verde", 3 for "corn"
	 * @param guac
	 *            whether the bowl should have guac or not
	 * @return the order as described above
	 */

	public static String chipotleOrder(char rice, int fajitas, int salsa, boolean guac) { 
		String answer= "Bowl with";
		
		if(rice=='b' || rice=='B') {
			answer+= " brown rice and ";
		}
		
		else{
			answer+= " white rice and ";
			
		}
		
		if(fajitas==0) {
			answer+= "no fajita veggies and ";
			
		}
		
		else if(fajitas > 0 && fajitas < 10) {
			answer+= "some fajita veggies and ";
		}
		
		else {
			answer+= "a lot of fajita veggies and ";
			
		}
		

		if(salsa==1) {
			answer+= "pico salsa.";
			
		}
		
		else if (salsa==2) {
			answer+= "verde salsa.";
			
		}
		
		else {
			answer+= "corn salsa.";
		}
		
		if(guac) {
			answer+= " Guac please.";
			
		}
	
		return answer;
	
	}

	/**
	 * Count the number of times the word "code" or "Code" appears in a given String.
	 * 
	 * countCode("code") -> 1
	 * countCode("codingbat") -> 0
	 * countCode("hour of code") -> 1
	 * countCode("I coded during the hour of code") -> 2
	 * countCode("I love code. Code is good. I codeveloped code with my codesigner.") -> 5
	 * 
	 * @param str
	 *            the input string
	 * @return the occurrence count of "code" or "Code" in the input string 
	 */
	public static int countCode(String str) {
		int sum=0;
		for(int i=0; i <= str.length()-4; i++) {
			if((str.charAt(i)=='c'|| str.charAt(i)=='C') && str.charAt(i+1)=='o' && str.charAt(i+2)=='d' &&  str.charAt(i+3)=='e'){
				sum=sum+1;

			}
		
		}
		return sum;

	
	
	}

	/**
	 * Given an int array, return true if the array contains "2 twice or more", or "3 twice or more".
	 * 
	 * 
	 * double23({2, 4, 2, 5}) -> true 
	 * double23({3, 3}) -> true 
	 * double23({2, 4, 3, 1}) -> false
	 * 
	 * @param arr
	 *            the array
	 * @return whether the array contains "2 twice or more", or "3 twice or more".
	 */
	public static boolean double23(int[] arr) {
		int two=0;
		int three=0;
		
		for( int i=0; i < arr.length-1; i++) {
			if(arr[i]==2) {
				two=two+1;
				if(two>=2) {
					return true;
					
				}
				
			}
			if(arr[i]==3) {
				three= three+1;
				if(three>=2) {
					return true;
				}

				
			}
		}
		
		return false;
	}
}
	

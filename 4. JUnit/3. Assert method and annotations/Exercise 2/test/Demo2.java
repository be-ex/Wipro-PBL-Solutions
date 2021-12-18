package test;


public class Demo2 {
	
	public boolean palindromeCheck(String test) {

		String temp = "";
		for (int i = 0; i < test.length(); i++) {
			temp = temp.concat(String.valueOf(test.charAt(i)));
		}
		
		if (temp.equalsIgnoreCase(test)) {
			return true;
		}
		
		return false;
	}
}

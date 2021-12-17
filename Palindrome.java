package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String a="madam";
		String rev="";
		int length=a.length();
		for (int i = length-1; i >=0; i--) 
			
		rev=rev+a.charAt(i);
		if(a.equals(rev))
			System.out.println(a+"is a palindrome");
		else
			System.out.println(a+"is not a palindrome");

	}

}

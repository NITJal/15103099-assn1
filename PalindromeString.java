import java.util.Scanner;

public class PalindromeString {
public static void main(String args[])
{
	String str=""; 
	System.out.println("enter the string ");
	Scanner s=new Scanner(System.in);
	str=s.nextLine();
	StringBuffer s1=new StringBuffer(str);
	String rev=s1.reverse().toString();
	if(str.equals(rev))
	{
		System.out.println("yes , the given string is a palindrome");
	}
	else
		System.out.println("The given string is not a palindrome");
}
}

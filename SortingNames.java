import java.util.Scanner;

public class SortingNames {
public static void main(String args[])
{
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of names you want to sort ");
	n=s.nextInt();
	String str[]=new String[n];
	int i,j;
	System.out.println("enter the names");
	for(i=0;i<n;i++) 
	{
		str[i]=s.nextLine();
	}
	String temp="";
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(str[i].compareTo(str[j])>0)
			{
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
		}
	}
	System.out.println("the sorted list is :");
	for(i=0;i<n;i++)
		System.out.print(str[i]+" ");
}
}

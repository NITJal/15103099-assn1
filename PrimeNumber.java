import java.util.Scanner;

public class PrimeNumber {
public static void main(String args[])
{
	int n;
	System.out.println("enter the number ");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	Integer a[]=new Integer[n+5];
	int i,j;
	for(i=1;i<=n;i++)
		a[i]=0;
	for(i=2;i<=n;i++)
	{
		if(a[i]==0)
		  System.out.print(i+" ");
		for(j=i+1;j<=n;j++)
			if(j%i==0)
				a[j]=1;
	}
	
}
}

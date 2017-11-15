import java.util.Scanner;

public class MatrixMultiplication {
public static void main(String args[])
{
	int m,n,p,q,i,j,k;
	Scanner s=new Scanner(System.in);
	System.out.println("enter rows and columns of first matrix ");
	m=s.nextInt();
	n=s.nextInt();
	System.out.println("enter rows and columns of second matrix ");
	p=s.nextInt();
	q=s.nextInt();
	if(n==p)
	{
		int A[][]=new int[m][n];
		System.out.println("enter elements of first matrix ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				A[i][j]=s.nextInt();
		int B[][]=new int[p][q];
		System.out.println("enter elements of second matrix ");
		for(i=0;i<p;i++)
			for(j=0;j<q;j++)
				B[i][j]=s.nextInt();
		int C[][]=new int[m][q];
		int sum=0;
		for(i=0;i<m;i++) 
		{
			for(j=0;j<q;j++) 
			{
				for(k=0;k<p;k++)
				{
					sum=sum+A[i][k]*A[k][j];
				}
				C[i][j]=sum;
				sum=0;
			}
		}
		System.out.println("The product of the matrices is :");
		for(i=0;i<m;i++) {
			System.out.println();
			for(j=0;j<q;j++)
				System.out.print(C[i][j]+" ");
		}
	}
}
}

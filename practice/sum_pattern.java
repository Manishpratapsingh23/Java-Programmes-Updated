/*
Write a program to print triangle of user defined integers sum.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6
Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15


*/
import java.util.*;
public class sum_pattern{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
        int n=sc.nextInt();
        int sum=0;
        sc.close();
		for(int i=1;i<=n;i++)
        {
			for(int k=1;k<=i;k++)
			{	
                if(k==i)
			       System.out.print(k);
                else
                     System.out.print(k+ "+");                 			       
}
            for(int j=1;j<=1;j++)
            {
            	System.out.print("=");
            }
			sum=sum+i;
            System.out.println(sum);
        }
    }
	
}
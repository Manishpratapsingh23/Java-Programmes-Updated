import java.util.Scanner;
import java.util.Arrays;
public class abc2{

    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.print(Arrays.toString(arr));
		}
		}
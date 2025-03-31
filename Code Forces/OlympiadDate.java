
import java.util.Scanner;

public class OlympiadDate {
    public static int helper(int arr[], int n){
        if(n==0) return 0;
        int ans=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) count++;
            if(count==3){
                ans=i+1;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            System.out.println(helper(arr,n));
        }
    }
}

package Array;

import java.util.Scanner;

public class maxConsecutiveOnes {
	//Naive approach
	int maxConsecutiveOnes(int arr[],int n) {
		int res=0;
		
		for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i;j<n;j++)
			{
				if(arr[j]==1) curr++;
				else  break;
			}
			res=max(res,curr);
		}
		return res;
	}
	//Efficient 
	public int maxConsOne(int arr[],int n) {
		int res=0;
		int curr=0;
		for(int i=0;i<n;i++) 
		{
		
			if(arr[i]==0)
				  curr=0;
			else {
				curr++;
				res=max(res,curr);
			}
		}
		return res;
	}
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of array:");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the elements only one and zero:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		maxConsecutiveOnes obj=new maxConsecutiveOnes();
		System.out.println("Naive: max ones: "+obj.maxConsecutiveOnes(arr, n));
		System.out.println("Efficeint: "+obj.maxConsOne(arr, n));
	}
	public static int max(int res, int curr) {
		if(res<curr)
			return curr;
		return res;
}	
}

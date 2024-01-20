package Array;

import java.util.Scanner;

public class maxSum {
	//Naive
	int maxSumS(int arr[],int n) {
		int res=arr[0];
		for(int i=0;i<n;i++)
		{
			int curr=0;
			for(int j=i;j<n;j++)
			{
				curr=curr+arr[j];
				res=max(res,curr);
			}
		}
		return res;
	}
	
	//Efficient approach
	int maxSum(int arr[],int n) {
		int res=arr[0];
		int maxEnding=arr[0];
		for(int i=1;i<n;i++) {
			maxEnding=max(maxEnding+arr[i],arr[i]);
			res=max(res,maxEnding);
		}
		return res;
	}
	
	public int max(int curr, int res) {
		if(curr>res)
			return curr;
		return res;
	}

	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of array:");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		maxSum obj=new maxSum();
		System.out.println("max sum of sub array: "+obj.maxSumS(arr, n));
	System.out.println("efficeint : "+obj.maxSum(arr, n));
	}
}

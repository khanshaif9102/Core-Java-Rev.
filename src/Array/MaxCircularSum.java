package Array;

import java.util.Scanner;

public class MaxCircularSum {
	//Naive
	int maxCircularSum(int arr[],int n)
	{
		int res=arr[0];
		for(int i=0;i<n;i++) {
			int curr_sum=arr[i];
			int curr_max=arr[i];
			for(int j=1;j<n;j++) {
				int index=(i+j)%n;
				curr_sum+=arr[index];
				curr_max=max(curr_max,curr_sum);
			}
			res=max(res,curr_max);
		}
		return res;
	}
	public int max(int curr_max, int curr_sum) {
		if(curr_max>curr_sum)
			return curr_max;
		return curr_sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of array:");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		MaxCircularSum obj=new MaxCircularSum();
		System.out.println(obj.maxCircularSum(arr, n));
	}
}

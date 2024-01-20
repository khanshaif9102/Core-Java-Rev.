package Array;

import java.util.Scanner;

public class Max_EvenOdd{
	//Naive approach
	int maxEvenOdd(int arr[],int n) {
		int res=1;
		for(int i=0;i<n;i++)
		{
			int curr=1;
			for(int j=i+1;j<n;j++) {
				if((arr[j]%2==0 && arr[j-1]%2!=0)||
				(arr[j]%2!=0 && arr[j-1]%2==0))
				curr++;
				else break;
			}
			res=max(res,curr);
		}
		return res;
	}
	
	//Efficient
	int maxEvenOdd1(int arr[],int n) {
		int res=1;
		int curr=1;
		for(int i=1;i<n;i++) {
			if((arr[i]%2==0 && arr[i-1]%2!=0)||
			(arr[i]%2!=0 && arr[i-1]%2==0)) {
				curr++;
				res=max(res,curr);
			} else
				curr=1;
		}
		return res;
	}
	public int max(int res, int curr) {
		if(curr>res)
			return curr;
		return res;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of array:");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Max_EvenOdd obj=new Max_EvenOdd();
		System.out.println(obj.maxEvenOdd(arr, n));
		System.out.println(" Efficient : "+obj.maxEvenOdd1(arr, n));
	}
}

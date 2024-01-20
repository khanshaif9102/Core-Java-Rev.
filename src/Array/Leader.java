package Array;

import java.util.Scanner;

public class Leader {
	//Naive
	public void leader(int arr[],int n)
	{
		for(int i=0;i<n;i++) {
			boolean flag=false;
			for(int j=i+1;j<n;j++) 
			if(arr[i]<=arr[j]){
				flag=true;
				break;
			}
			if(flag==false) {
				System.out.println("leaders: "+arr[i]);
			}
		}
		System.out.println("=========================");
	}
	//Efficient
	public void Leader(int arr[]) {
		int n=arr.length;
		int curr_ldr=arr[n-1];
		System.out.println(curr_ldr);
		for(int i=n-2;i>=0;i--)
		{
			if(curr_ldr<arr[i])
			{
				curr_ldr=arr[i];
				System.out.println(curr_ldr);
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of array:");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Leader obj=new Leader();
		obj.leader(arr, n);
		obj.Leader(arr);
	}
}

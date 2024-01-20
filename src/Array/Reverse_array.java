package Array;

import java.util.Scanner;

public class Reverse_array {
	public void reverse(int arr[],int n) {
		int low=0,high=n-1;
		while(low<high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
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
		Reverse_array obj=new Reverse_array();
		obj.reverse(arr, n);
		
	}
}

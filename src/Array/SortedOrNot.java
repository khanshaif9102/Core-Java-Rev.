package Array;

import java.util.Scanner;

public class SortedOrNot {
	boolean isSorted(int arr[],int n) {
		
		for(int i=1;i<n;i++)
			if(arr[i]<arr[i-1])
				return false;
		return true;
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
		SortedOrNot obj=new SortedOrNot();
		System.out.println(obj.isSorted(arr, n));
	}
}

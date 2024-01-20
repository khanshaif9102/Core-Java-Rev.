package Array;

import java.util.Scanner;

public class Largest_Element {
	int largest(int arr[],int n) {
		int res=0;
		for(int i=1;i<n;i++)
		
			if(arr[res]<arr[i])
				res=i;
		return arr[res];
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
		int largest=arr[0];
		for(int i=1;i<n;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		System.out.println("Largest element is:"+largest);
		Largest_Element obj=new Largest_Element();
		System.out.println(obj.largest(arr, n));
	}
}

package Array;

import java.util.Scanner;

public class Left_Rotate_one {
	public void left_rotate_one(int arr[],int n) {
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		} arr[n-1]=temp;
		for(int i=0;i<n;i++) {
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
		Left_Rotate_one obj=new Left_Rotate_one();
		obj.left_rotate_one(arr, n);
//		int temp=arr[0];
//		for(int i=1;i<n;i++)
//		{
//			arr[i-1]=arr[i];
//			
//		}
//		arr[n-1]=temp;
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
	}
}

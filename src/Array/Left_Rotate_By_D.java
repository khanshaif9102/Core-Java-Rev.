package Array;

import java.util.Scanner;

public class Left_Rotate_By_D {
	public void leftRotateOne(int arr[],int n)
	{
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
	}
	public void leftRotate(int arr[],int n,int d) {
		for(int i=0;i<d;i++)
			leftRotateOne(arr,n);
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the size of array:");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("hot many times you want to rotate:");
		int d=sc.nextInt();
		Left_Rotate_By_D obj=new Left_Rotate_By_D();
		obj.leftRotate(arr, n, d);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

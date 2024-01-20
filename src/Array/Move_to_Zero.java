package Array;

import java.util.Scanner;

public class Move_to_Zero 
{
	public void naive(int arr[],int n) 
	{
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0) 
			{
				for(int j=i+1;j<n;j++)
					if(arr[j]!=0) {
				 int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
					}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println("==============="+arr[i]);
		}
	}
	public void efficient(int arr[],int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int temp=arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("elements: "+arr[i]);
		}
	}
	public static void main(String args[])
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
		Move_to_Zero obj=new Move_to_Zero ();
		obj.naive(arr, n);
		obj.efficient(arr, n);
		
	}
}

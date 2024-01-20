package Array;

import java.util.Scanner;

public class Second_Largest {
	int second(int arr[],int n)
	{
		int res=-1,largest=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[largest])
			{
				res=largest;
				largest=i;
			} else if(arr[i]!=arr[largest]) {
				if(res==-1||arr[i]>arr[res])
					res=i;
			}
		} return res;
		
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
		int res=-1,largest=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[largest]) {
				res=largest;
				largest=i;
			}
			else if(arr[i]!=arr[largest]) {
				if(res==-1||arr[i]>arr[res])
					res=i;
			}
		}
		System.out.println(arr[res]);
	}
}

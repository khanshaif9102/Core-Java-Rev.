package Array;

import java.util.Scanner;

public class Remove_Dup {
	int remove_dup(int arr[],int n) {
	int res=1;
	for(int i=1;i<n;i++)
	{
		if(arr[i]!=arr[res-1]) 
		{
			arr[res]=arr[i];
			res++;
		}
	}
return res;
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
		Remove_Dup obj=new Remove_Dup();
		System.out.println(obj.remove_dup(arr, n));
		
	}
}

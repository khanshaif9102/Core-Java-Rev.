package Array;

import java.util.Scanner;

public class Search_In_Array 
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//searching an element in array
		System.out.println("entet the element which you want to search:");
		int x=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x) {
				System.out.println("index :"+i+" = "+arr[i]);
			}
		}
	}
}

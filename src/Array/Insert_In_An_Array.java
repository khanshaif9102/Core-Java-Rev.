package Array;

import java.util.Scanner;

public class Insert_In_An_Array {
	int insert(int arr[],int n,int x,int cap,int pos) {
		if(n==cap)
		{
			return n;
		}
		int idx=pos-1;
		System.out.println("progressing");
		for(int i=n-1;n>=idx;i--)
		arr[i+1]=arr[1];
		arr[idx]=x;
		return (n+1);
	}
	public static void main(String args[])
	{	
		int n=10;
		int[] arr=new int[n];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		System.out.println("insertion");
		int cap=4;
		int pos=2;
		int x=15;
		Insert_In_An_Array obj=new Insert_In_An_Array();
		System.out.println(obj.insert(arr, n, x, cap, pos));
	}
}

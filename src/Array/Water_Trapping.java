package Array;

import java.util.Scanner;

public class Water_Trapping {
	//Naive
	int getWater(int arr[],int n) {
		int res=0;
		for(int i=1;i<n-1;i++)
		{
			//left max
			int lMax=arr[i];
			for(int j=0;j<i;j++)
				lMax=max(lMax,arr[j]);
			
			//Right max
				int rMax=arr[i];
			for(int j=i+1;j<n;j++)
				rMax=max(rMax,arr[j]);
				
				res=res+(min(lMax,rMax)-arr[i]);
		}
		return res;
	}
	public int min(int m, int n) {
		if(m<n)
			return m;
		return n;
	}
	public int max(int m, int n) {
	if(m<n)
		return n;
	return m;
	}
	//Efficient
	int getWater_E(int arr[],int n) {
		int res=0;
		int[] lmax=new int[n];
		int[] rmax=new int[n];
		//left max
		lmax[0]=arr[0];
		for(int i=1;i<n;i++)
			lmax[i]=max(arr[i],lmax[i-1]);
		//right max
		rmax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
			rmax[i]=max(arr[i],rmax[i+1]);
		for(int i=1;i<n-1;i++)
			res+=min(lmax[i],rmax[i])-arr[i];
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
	Water_Trapping obj=new Water_Trapping();
	System.out.print("trapped water is: ");
	System.out.print(obj.getWater(arr, n));
	System.out.println("==========================");
	System.out.println(obj.getWater_E(arr, n));
}
}
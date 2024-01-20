package Array;

import java.util.Scanner;

public class frequency {
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
	int freq=1;
	int i=1;
	while(i<n) {
		while(i<n &&arr[i]==arr[i-1]) {
			freq++;
			i++;
			break;
		}
		System.out.println(arr[i-1]+" "+freq);
		i++;
		freq=1;
	}
	if(n==1 || arr[n-1]!=arr[n-2]) {
		System.out.println(arr[n-1]+" "+1);
	}
	
}
}

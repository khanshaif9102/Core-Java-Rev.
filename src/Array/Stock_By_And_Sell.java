package Array;

import java.util.Scanner;

public class Stock_By_And_Sell {
	//Naive
	int maxProfit(int price[],int start,int end) {
		if(end<=start)
			return 0;
		int profit=0;
		for(int i=start;i<end;i++) {
			for(int j=i+1;j<=end;j++) {
				if(price[i]<price[j]) {
					int curr_profit=price[j]-price[i]+
							maxProfit(price,start,i-1)+
							maxProfit(price,j+i,end);
					profit=max(curr_profit,profit);
				}
			}
		}
		return profit;
	}
	
	private int max(int profit, int curr_profit) {
		if(profit>curr_profit) 
			return profit;
		return curr_profit;
	}
	
	int maxProfit(int price[],int n) {
		int profit=0;
		for(int i=1;i<n;i++)
			if(price[i]>price[i-1])
				profit+=(price[i]-price[i-1]);
		return profit;
	}

	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("enter the size of array:");
	n=sc.nextInt();
	int[] price=new int[n];
	System.out.print("enter the elements:");
	for(int i=0;i<n;i++) {
		price[i]=sc.nextInt();
	}
	Stock_By_And_Sell obj=new Stock_By_And_Sell();
	System.out.println(obj.maxProfit(price, 0,n-1 ));
	
	System.out.println("efficient one");
	System.out.println(obj.maxProfit(price, n));
	}
}

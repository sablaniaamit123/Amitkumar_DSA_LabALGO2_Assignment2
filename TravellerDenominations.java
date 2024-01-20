/**
 * @class          TravellerDenominations App Class 
 * @author          Amresh Tripathi 
 * @date            04-Apr-2023
 * @version         1.0
 */
package app;

import java.util.Scanner;
import model.BillCounter;
import model.MergeSort;

public class TravellerDenominations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		
		System.out.println("Enter the currency denominations values");		
		for(int i=0;i<size;i++)
			currency[i]=sc.nextInt();
		
		// sort the bills in increasing order, we have used merge sort here 
		MergeSort ms=new MergeSort();
		ms.sort(currency, 0, size-1);
		
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		
		BillCounter bc=new BillCounter();
		bc.counting(currency,amount);
		
		sc.close();
	}
}
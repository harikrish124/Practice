package practice;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[10];
		int n;
		int i,j,temp;
		System.out.println("Enter the array limit");
		n=sc.nextInt();
		System.out.println("Enter the array"+ n+" Element");
		
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
//		System.out.println(Arrays.toString(ar));
		System.out.print(" Entered Array Guys");
		
		System.out.print("[");
		for(i=0;i<n;i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.print("]");
		
		//sorting using bubble sort techinque
		
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
				
			}
		}
		
		//printing sorted array
		
		
		System.out.println("");
		System.out.println("sorted Array [");
		
		for(i=0;i<n;i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.print("]");

		
		
		
		
	}

}

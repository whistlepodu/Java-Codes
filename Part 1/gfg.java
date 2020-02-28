import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner in = new Scanner(System.in);
	     int T = in.nextInt();
	     int flag=0;
	     while(T>0)
	     {
	         int n = in.nextInt();
	         long arr[] = new long[n];
	         for(int i=0;i<n;i++)
	         {
	             arr[i]=in.nextLong();
	         }
	         
	         for(int i=1;i<n-1;i++)
	         {
	             flag=0;
	             long x = arr[i];
	             for(int j=0;j<i;j++)
	             {
	                 if(j!=i && arr[j]<x && x>arr[i+1] && arr[j]<arr[i+1])
	                 {
	                     flag=1;
	                     break;
	                 }
	             }
	         }
	         if(flag==1)
	            System.out.println("Yes");
	         else
	            System.out.println("No");
	         T--;
	     }
	 }
}
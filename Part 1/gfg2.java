import java.util.*;
import java.lang.*;
import java.io.*;
class gfg2
 {
	public static void main (String[] args)
	 {
    	 Scanner in = new Scanner(System.in);
    	 int T = in.nextInt();
    	 while(T>0)
    	 {
    	     int n = in.nextInt();
    	     List<Integer> al = new ArrayList<Integer>();
    	     int sum=0;
    	     int arr[] = new int[n];
    	     for(int i=0;i<n;i++)
    	     {
    	         arr[i]=in.nextInt();
    	     }
    	     for(int i=0;i<n-2;i++)
    	     {
    	         for(int j=i+1;j<n-1;j++)
    	         {
    	             for(int k=j+1;k<n;k++)
    	             {
    	                 if(i<j && j<k)
    	                 {
    	                     if(arr[i]<arr[j] && arr[j]<arr[k])
    	                     {
    	                         sum = arr[i] + (arr[j] * arr[k]);
    	                         al.add(sum);
    	                     }
    	                 }
    	             }
    	         }
    	     }
    	     if(al.isEmpty())
    	     {
    	         System.out.println("-1");
    	     }
    	     else
    	     {
    	         Integer mm = Collections.max(al);
    	         System.out.println(mm);
    	     }
    	     T--;
    	 }
	 }
}
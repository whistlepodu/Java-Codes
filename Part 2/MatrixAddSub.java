import java.util.Scanner;
public class MatrixAddSub
{
    public static void main(String args[])
    {
        System.out.print('\f');
        int m,n,i,j;
        System.out.println("Enter no. of Rows: ");
        Scanner x = new Scanner(System.in);
        m = x.nextInt();
        System.out.println("Enter no. of Columns: ");
        Scanner y = new Scanner(System.in);
        n = y.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        int[][] arr3 = new int[m][n];
        System.out.println("Enter Elements of 1st Matrix: ");
        Scanner a = new Scanner(System.in);
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr1[i][j] = a.nextInt();
            }
        }
        System.out.println("Enter Elements of 2nd Matrix: ");
        Scanner b = new Scanner(System.in);
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr2[i][j] = b.nextInt();
            }
        }
        System.out.println("Addition Result of Two Matrices: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print('\t');
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]);
            }
            System.out.print('\n');
        }
        System.out.println("Substraction Result of Two Matrices: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print('\t');
                arr3[i][j] = arr1[i][j] - arr2[i][j];
                System.out.print(arr3[i][j]);
            }
            System.out.print('\n');
        }
    }
}
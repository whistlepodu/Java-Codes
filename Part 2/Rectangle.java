import java.util.Scanner;
public class Rectangle
{
    public static void main(String args[])
    {
        System.out.print('\f');
        float len,bre;
        System.out.println("Enter Length: ");
        Scanner in = new Scanner(System.in);
        len = in.nextFloat();
        System.out.println("Enter Breadth: ");
        Scanner in1 = new Scanner(System.in);
        bre = in1.nextFloat();
        CalcArea(len,bre);
        CalcPeri(len,bre);
        System.out.println();
    }
    public static void CalcArea(float len, float bre)
    {
        double Area;
        Area = len * bre;
        System.out.println("Area of Circle: " + Area);
    }
    public static void CalcPeri(float len, float bre)
    {
        double Peri;
        Peri = 2 * (len +  bre);
        System.out.println("Circumference of Circle: " + Peri);
    }
}
import java.util.Scanner;
public class Square
{
    public static void main(String args[])
    {
        System.out.print('\f');
        float side;
        System.out.println("Enter Side: ");
        Scanner in = new Scanner(System.in);
        side = in.nextFloat();
        CalcArea(side);
        CalcPeri(side);
        System.out.println();
    }
    public static void CalcArea(float side)
    {
        double Area;
        Area = side * side;
        System.out.println("Area of Square: " + Area);
    }
    public static void CalcPeri(float side)
    {
        double Peri;
        Peri = 4 * side;
        System.out.println("Perimeter of Square: " + Peri);
    }
}
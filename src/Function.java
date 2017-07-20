import java.util.Scanner;

public class Function
{
    public static void main(String[] args)
    {

        //
        System.out.println("Введите границу масива");
        Scanner in = new Scanner(System.in);

        int[] a1 = Task1(in.nextInt());

        for (int c : a1)
        {
            System.out.println(c);
        }

         //

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту");
        int a = sc.nextInt();
        System.out.println("Введите ширину");
        int b = sc.nextInt();

        System.out.println(drawRectangle(a, b));

        //

        System.out.println("Введите сторону квадрата");
        int d = sc.nextInt();
        System.out.println(drawRectangle(d));


        //
        System.out.println("Введите два целых числа для поиска максимального");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        System.out.println("Максимальное значение  = " + getMax(a2, b2));

        //
        System.out.println("Введите два дробных числа для поиска максимального");
        float a3 = sc.nextFloat();
        float b3 = sc.nextFloat();
        System.out.println("Максимальное значение = " + getMax(a3, b3));

    }



    //

    public static int[] Task1(int n1)
    {
        int[] mas = new int[n1];

        for (int i = 0; i < n1; i++) {
            mas[i] = i + 1;
        }
        return mas;

    }
    //

    public static String[][] drawRectangle(int a, int b)
    {
        String [][] sqr = new String[a][b];
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b ; j++)
            {
                sqr[i][j] = "+";
            }
        }
        for (int i = 1; i < a-1; i++)
        {
            for (int j = 1; j < b-1 ; j++)
            {
                sqr[i][j] = " ";
            }
        }

        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b ; j++)
            {
                System.out.print(sqr[i][j]);
            }
            System.out.println();
        }


        return sqr;
    }

    //

    public static String[][] drawRectangle(int a)
    {
        String [][] sqr1 = new String[a][a];
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < a ; j++)
            {
                sqr1[i][j] = "+";
            }
        }

        for (int i = 1; i < a-1; i++)
        {
            for (int j = 1; j < a-1 ; j++)
            {
                sqr1[i][j] = " ";
            }
        }

        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < a ; j++)
            {
                System.out.print(sqr1[i][j]);
            }
            System.out.println();
        }


        return sqr1;
    }



//
    public static int getMax(int a, int b)
    {

      int max;
         if (a > b)
        max = a;
        else
        max = b;

     return max;
    }


    //
    public static float getMax(float a, float b)
    {

        float max;
        if (a > b)
            max = a;
        else
            max = b;

        return max;
    }
}

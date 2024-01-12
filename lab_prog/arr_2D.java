package lab_prog;

public class arr_2D {
    public static void main(String [ ] args)
    {
        int num[][]=new int [3][2];
        num[0][0]=2;
        num[0][1]=5;
        num[1][0]=6;
        num[1][1]=8;
        num[2][0]=7;
        num[2][1]=3;
    
        for(int a[] : num)
        {
            for(int b : a)
            {
                System.out.print(  b+ " ");
            }
            System.out.println();
        }
    }
}

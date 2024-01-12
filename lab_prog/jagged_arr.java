package lab_prog;

public class jagged_arr {
    public static void main(String [] args)
    {
        int nums[][]={
            {2, 8, 3, 9}, {5, 8, 1}, {2, 3}
        };
        for( int a[] : nums)
        {
            for( int b : a)
            {
                System.out.print(b +" ");
            }
            System.out.println();
        }
    }
}

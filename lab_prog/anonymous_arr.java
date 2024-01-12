package lab_prog;

class clc
{
    public int add(int nums[])
    {
        int result =0;
        for(int n : nums)
        {
            result = result + n;
        }
        return result;
    }
}
public class anonymous_arr
{
    public static void main(String [] args)
    {
        clc obj = new clc();
        
        int result = obj.add(new int[]{5,3,8,7});//anonymous array
        System.out.println(result);
    }
}
class add
{
    int addition(int a, int b)
    {
        return a+b;
    }
    float addition(float a, float b, int c)
    {
        return a+b+c;
    }
    int addition(int a, int b, int c)
    {
        return a+b+c;
    }

}
class method_overloading
{
    public static void main(String [] args)
    {
        add plus = new add();
        System.out.println("sum is"+ plus.addition(1, 2));
        System.out.println("sum is"+ plus.addition(1.3f, 2.03f, 9));
        System.out.println("sum is"+ plus.addition(1, 2, 3));
    }
}
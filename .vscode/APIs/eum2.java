package APIs;

enum result{
    PASS, FAIL, NR;
    int marks;
    result()
    {
        System.out.println("constructor");
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }
    
    

}

public class eum2 {
    public static void main(String[] args) {
        result.PASS.setMarks(99);
       System.out.println( result.PASS.getMarks());

       System.out.println(result.FAIL.getMarks());

       //same as nr also
    }
}

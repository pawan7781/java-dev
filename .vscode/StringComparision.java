public class StringComparision {
    public static void main(String[] args) {
        String s1 = "pw";
        String s2 = new String("PW");
        String s3 = new String("pw");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
    
}

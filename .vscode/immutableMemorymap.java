public class immutableMemorymap {
    public static void main(String[] args) {
        String s1 = "pawan";
        String s2 = "pawan";
        String s3 = new String("piyush magarde");
        String s4 = new String("piyush magarde");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
    }
}

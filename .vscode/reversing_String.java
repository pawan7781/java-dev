public class reversing_String {
    public static void main(String[] args) {

        //case 1 pwjava to avajwp
        String str1 = "pwjava";
        String str2 = "";
        for (int i = str1.length()-1; i>=0; i--)
        {
            str2 =str2 + str1.charAt(i); 
        }
        System.out.println(str1);
        System.out.println(str2);

        //case 2 pwskills java to java pwskills
        String s1 = "pwskills java";
        String s2 = "";
        String sarr[] = s1.split(" ");
        for(int i = sarr.length-1 ; i>=0; i--)
        {
            s2=s2 + sarr[i] +" ";
        }
        System.out.println(s1);
        System.out.println(s2);

        //case 3 pwskills java to avaj sllikswp
        String st1="pwskills java";
        String st2= "";
        for(int i=st1.length()-1; i>=0; i--)
        {
            st2=st2+st1.charAt(i);
        }
        System.out.println(st1);
        System.out.println(st2);

        //case 4 pwskills java to sllikswp avaj
        String a = "pwskills java";
        String b = "";
        String arr[] = s1.split(" ");
        for(String elem : arr)
        {
            for(int i = elem.length()-1; i>=0; i--)
            {
                b = b + elem.charAt(i);
            }
            b=b +" ";
        }
        System.out.println(a);
        System.out.println(b);


    }
}

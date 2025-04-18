interface IDemo3{
    public String m1(String str);
}
public class Program03 {

    //By using Anonymous Inner class

    public static void main(String[] args) {
        IDemo3 iDemo3 = new IDemo3() {
            @Override
            public String m1(String str) {
                return str.toUpperCase();
            }
        };
        String str = iDemo3.m1("Sachin");
        System.out.println("Uppercase string : " + str);
        //By using lambda expression
        IDemo3 iDemo31 = str1 -> str.toUpperCase();
        System.out.println(iDemo31.m1("Sachin"));
    }
}

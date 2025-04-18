interface IDemo{

    public void m1();
}
public class Program01 {
    //Method with no argument and no return type

//    public static void m1(){
//        System.out.println("Hello");
//    }
    //No need to give name of method and no need to provide return type
    //Compiler will bind and jvm will call that method
    public static void main(String[] args) {


        //Without lambda expression
        //1 . You need to implement IDemo interface else you need to use Anonymous inner class
        // By using Anonymous Inner class
        IDemo iDemo1 = new IDemo() {
            @Override
            public void m1() {
                System.out.println("Hello");
            }
        };
        iDemo1.m1();

    //By using lambda expression

        IDemo iDemo2 = () -> System.out.println("Hello");
        iDemo2.m1();
    }
}

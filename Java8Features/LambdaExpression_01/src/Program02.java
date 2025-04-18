interface IDemo2{
    public void m1(int a,int b);
}
public class Program02 {
    public static void main(String[] args) {

        //Without Lambda expression i.e Using Anonymous Inner class

        IDemo2 iDemo2 = new IDemo2(){

            @Override
            public void m1(int a, int b) {
                System.out.println("Sum : " + (a+b));
            }

        };

        iDemo2.m1(10,20);//Sum : 30

        //By using lambda expression
        //No need to give datatype of parameter also because compiler knows
        IDemo2 iDemo21 = (a,b)-> System.out.println("Sum : " + (a+b));
        iDemo21.m1(10,30);//Sum : 40
    }
}

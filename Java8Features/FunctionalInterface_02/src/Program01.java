
@FunctionalInterface
interface Interf{
    public void add(int a,int b);
}
class Demo implements Interf{

    @Override
    public void add(int a, int b) {
        System.out.println("The sum is : "+(a+b));
    }
}
public class Program01 {
    public static void main(String[] args) {

        //Traditional Approach (3.class files will be generated it will take more time)
        Interf interf = new Demo();
        interf.add(10,20);

        //By Lambda expression(No need to write Demo class to implement) only 2.class files will be generated
        Interf interf1 = (a,b) -> System.out.println("The sum is : "+(a+b));
        interf1.add(10,30);
    }
}

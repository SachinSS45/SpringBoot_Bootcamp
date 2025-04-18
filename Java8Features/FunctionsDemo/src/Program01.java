import java.util.function.Function;
import java.util.function.Predicate;

class MyFunctions implements Function<String,Integer>{

    @Override
    public Integer apply(String data){
        return data.length();
    }
}
public class Program01 {
    public static void main(String[] args) {

        //Normal Approach
        Function<String,Integer> function = new MyFunctions();
        int length = function.apply("Sachin");
        System.out.println(length);

        //As Function interface is FunctionalInterface we can use lambda expression :
        // No need create new class to implement

        Function<String,Integer> f1 = str -> str.length();
        System.out.println(f1.apply("Sachin"));

        //andThen()
        Function<Integer,Integer> f2 = i -> i*2;
        System.out.println(f1.andThen(f2).apply("Sachin"));//12 :

        //compose()
        Function<Integer,Double> f3 = i-> i/2.0;
        System.out.println(f3.compose(f2).apply(5));

    }
}

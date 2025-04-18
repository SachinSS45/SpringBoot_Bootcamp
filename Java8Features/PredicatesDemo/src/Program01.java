import java.util.function.Predicate;
/*
    Predicate : It is and functional interface which contains only one abstract method i.e
    boolean test(T);
 */
public class Program01 {

    public static void performOperations(Predicate<Integer> p,int[] arr){

        for(int data : arr){
            if(p.test(data)){
                System.out.print(data + "\t");
            }
        }
    }
    public static void main(String[] args) {
        //Write a predicate to check whether the given number is greater than 10 or not
        Predicate<Integer> p = i -> i>10;
        p.test(20);//true

        //Write a predicate to check whether the given string length is greater than 3 or not
        Predicate<String> p2 = str -> str.length()>3;
        p2.test("Sachin");//true

        //write a predicate to check whether the given array number is less than 18 or not?

        int[] arr = {0,5,10,15,20,25,30};

        Predicate<Integer> p3 = i -> i<18;
        System.out.println("Numbers less than 18 : ");
        performOperations(p3,arr);
        System.out.println();
        //write a predicate to check whether the given array values which are even
        Predicate<Integer> p4 = i -> i%2==0;
        System.out.println("Number which are even : ");
        performOperations(p4,arr);
        System.out.println();
        System.out.println("Number which are not less than 18 : ");
        //Number which are not less than 18
        performOperations(p3.negate(),arr);//Use negate function

        //Number which are less than 18 and even both
        System.out.println();
        System.out.println("Number which are less than 18 and even both : ");
        performOperations(p3.and(p4),arr);
        System.out.println();

        //Number which are less than 18 or even numbers
        System.out.println("Number which are less than 18 or even numbers ; ");
        performOperations(p3.or(p4),arr);

        //Number which are not less than 18 and even numbers
        System.out.println("Number which are not less than 18 and even numbers : ");
        performOperations(p3.negate().and(p4),arr);
    }
}

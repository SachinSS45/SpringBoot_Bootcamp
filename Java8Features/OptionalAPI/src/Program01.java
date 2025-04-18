import java.util.Scanner;

//API
class User{

    //Written by developer
    public String getUserById(Integer id){
        if(id==10) return "Sachin";
        else if(id==19) return "Dravid";
        else if(id==7) return "Dhoni";
        else if(id==18) return "Virat";
        else return null;
    }
}
public class Program01 {
    //API is now used by end user
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id : ");
        Integer id = sc.nextInt();

        User user = new User();
        String userName = user.getUserById(id);
        System.out.println("Hello :: " + userName.toUpperCase());
        //If we enter value other than 10,19,7,18 it will give null return and on that API developer is doing UpperCase
        //so it will give NullPointerException so it should be handled by API developer so that is why
        //Optional class is present in Java to handle null pointer exception
        //check Program02
    }
}

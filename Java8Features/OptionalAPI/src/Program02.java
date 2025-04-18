import java.util.Optional;
import java.util.Scanner;

class User1{

    //Written by developer
    public Optional<String> getUserById(Integer id){
        String name = null;
        if(id==10) name="Sachin";
        else if(id==19) name="Dravid";
        else if(id==7) name = "Dhoni";
        else if(id==18) name="Virat";

        return Optional.ofNullable(name);
    }
}
public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id : ");
        Integer id = sc.nextInt();

        User1 user = new User1();
        Optional<String> optional = user.getUserById(id);

        if(optional.isPresent()){
            System.out.println("Hello : " + optional.get().toUpperCase());
        }else{
            System.out.println("Data not found");
        }
    }
}

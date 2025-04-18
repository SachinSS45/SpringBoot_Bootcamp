import java.util.function.Predicate;

public class Student {
    private String name;
    private Integer age;

    Student(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public static void performOperation(Predicate<Integer> p,Student[] std){

        for(Student student:std){

            if(p.test(student.age)){
                System.out.println(student.name + " age is less than 30");
            }else{
                System.out.println(student.name + " age is not less than 30");
            }
        }
    }
}

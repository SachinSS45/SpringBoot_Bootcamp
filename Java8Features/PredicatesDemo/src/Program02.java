import java.util.function.Predicate;

public class Program02 {
    public static void main(String[] args) {
        Student[] std = new Student[3];
        Student std1 = new Student("Sachin",25);
        Student std2 = new Student("Rushi",31);
        Student std3 = new Student("Vijay",28);
        std[0] = std1;
        std[1] = std2;
        std[2] = std3;

        Predicate<Integer> p1 = age->age<30;
        Student.performOperation(p1,std);
    }
}

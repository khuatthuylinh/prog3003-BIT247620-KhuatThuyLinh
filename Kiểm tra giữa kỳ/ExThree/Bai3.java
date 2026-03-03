import java.util.Arrays;
import java.util.List;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    @Override
    public String toString(){
        return id +". " + name + ": " + gpa;
    }
}

public class Bai3 {
    public static void main(String[] args){
        List<Student> list = Arrays.asList(
                new Student("1","Linh",4.0),
                new Student("2","Tuấn",3.0),
                new Student("3","Anh",3.5));
        
        list.stream()
                .filter(s -> s.getGpa() >= 3.2)
                .sorted((a, b) -> Double.compare(b.getGpa(), a.getGpa()))
                .forEach(System.out::println);
    }   
}

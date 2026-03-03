import java.util.ArrayList;
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
    
    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double gpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    
    @Override
    public String toString(){
        return id +". " + name + ": " + gpa;
    }
}

class StudentManager<T>{
    private List<T> data= new ArrayList<>();
    public void add(T item){
        data.add(item);
    }
    public List<T> getAll() {
        return data;
    }
}
        
public class Bai1 {
    public static void main(String[] args){
        StudentManager<Student> sv =new StudentManager<>();
        
        sv.add(new Student("1", "Linh", 4.0));
        sv.add(new Student("2", "Tuấn", 3.0));
        sv.add(new Student("3", "Anh", 3.5));
        
        sv.getAll().forEach(System.out::println);
    }
}

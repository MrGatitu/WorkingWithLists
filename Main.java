import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();
        
        
        Employees employee1 = new Employees("Billy", "B34TR7");
        Employees employee2 = new Employees("Alice", "A12TR8");
        Employees employee3 = new Employees("John", "J56TR9");
    
        
        employeesList.add(employee1);
        employeesList.add(employee2);
        employeesList.add(employee3);
    
        
        for (Employees employee : employeesList) {
            System.out.println(employee);
        }
    }
}

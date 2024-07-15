public class Employees {
    String name;
    String idNumber;

    public Employees(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID Number: " + idNumber;
    }
}

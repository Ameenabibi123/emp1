public class Employee {

    //Fields (attributes)
    String name;
    int id;
    double salary;
    String location;

//constructor
public Employee(String name, int id, double salary ,String location){

    this.name =name;
    this.id =id;
    this.salary =salary;
    this.location = location;
}

    //method to display employee details
    public void displayInfo(){
        System.out.println("Employee Id" +id);
        System.out.println("Employee Name" +name);
        System.out.println("salary" +salary);
        System.out.println("location" +location);

    }

    //main methos
    public static void main(String[] args) {
        //creating an object of employee
        Employee emp1 = new Employee("Ameena",101,50000,"hubli");

        emp1.displayInfo();

    }
}

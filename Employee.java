public class Employee {

    //Fields (attributes)
    String name;
    int id;
    double salary;

//constructor
public Employee(String name, int id, double salary){

    this.name =name;
    this.id =id;
    this.salary =salary;
}

    //method to display employee details
    public void displayInfo(){
        System.out.println("Employee Id" +id);
        System.out.println("Employee Name" +name);
        System.out.println("salary" +salary);
    }

    //main methos
    public static void main(String[] args) {
        //creating an object of employee
        Employee emp1 = new Employee("Ameena",101,50000);
        emp1.displayInfo();
    }
}

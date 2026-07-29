class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
    void displayEmployee(){
        System.out.println("Employee Name: "+name);
    }}
    //department class (aggregation)
    class Department{
        String departmentName;
        Employee employee; //aggregation
        Department(String departmentName,
                   Employee employee){
            this.departmentName=departmentName;
            this.employee=employee;
        }
        void displayDepartment(){
            System.out.println("Department: "+departmentName);
            employee.displayEmployee();
        }
    }

public class AggregationExample {
    public static void main(String[] args){
        Employee emp=new Employee("Milanjuk lama");
        //department has an employee object
        Department dept=new Department("Information technology",emp);
        dept.displayDepartment();
        System.out.println("\n Emp still exist: ");
        emp.displayEmployee();
    }
}
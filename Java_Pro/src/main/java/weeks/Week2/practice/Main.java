package weeks.Week2.practice;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
            new Manager("Ivan","projectmanager",3000, 200),
            new Developer("Vasiliy","junior",2500,"Java"),
            new Employee("Georgiy","QA",2000),
            new Employee("Alexandr","QA",2000)
        };

        for (Employee employee: employees){
            System.out.println(employee.getName() + ' ' + employee.getSalary() + ' ' + employee.calculateBonus());
        }





    }
}

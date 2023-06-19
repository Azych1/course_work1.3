public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.printAllEmployees();

        System.out.println(employeeBook.calculateAllSalaries());

        System.out.println("Самый бедный: " + employeeBook.findPoorEmployee());

        System.out.println("Самый богатый: " + employeeBook.findRichEmployee());

        System.out.println(employeeBook.calculateAverageSalary());

        employeeBook.printFullName();

        employeeBook.indexSalary(50);

        employeeBook.printAllEmployees();

        System.out.println();
        System.out.println(employeeBook.findPoorEmployeeByDepartment(4));
        System.out.println();
        System.out.println(employeeBook.findRichEmployeeByDepartment(4));
        System.out.println();
        System.out.println(employeeBook.findSalariesSumByDepartment(4));
        System.out.println();
        System.out.println(employeeBook.calculateAverageSalaryByDepartment(4));

        System.out.println();

        employeeBook.indexSalaryByDepartment(4, 50);

        employeeBook.printAllEmployees();

        System.out.println();
        employeeBook.printAllEmployeesByDepartment(4);

        System.out.println();
        employeeBook.printEmployeesWithSalaryLessThen(100000);
        System.out.println();
        employeeBook.printEmployeesWithSalaryMoreThen(100000);

        System.out.println();
        employeeBook.deleteEmployeeByFullNameOrId(null, 1);
        employeeBook.addNewEmployee("Берри", "Маурино", "Майклович", 4, 650000);
        System.out.println();
        employeeBook.printAllEmployees();
        System.out.println();
        employeeBook.setSalaryOrDepartmentOfEmployee(12, 1900000, 5);
        employeeBook.setSalaryOrDepartmentOfEmployee(5, 1999999, 5);
        employeeBook.printAllEmployees();
        System.out.println();
        employeeBook.printAllEmployeesFullNamesDistributedByDepartments();


    }
}
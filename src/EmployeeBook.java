public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public EmployeeBook() {
        employees[0] = new Employee("Вениаминов", "Валентин", "Эдгарович", 1, 12500);
        employees[1] = new Employee("Дуров", "Павел", "Валерьевич", 2, 13500);
        employees[2] = new Employee("Иванов", "Иван", "Иванович", 3, 15000);
        employees[3] = new Employee("Батталов", "Георгий", "Иванович", 4, 56000);
        employees[4] = new Employee("Ньюман", "Гарри", "Джонович", 5, 750000);
        employees[5] = new Employee("Борисовский", "Вадим", "Васильевич", 1, 12000);
        employees[6] = new Employee("Багров", "Данила", "Сергеевич", 2, 24000);
        employees[7] = new Employee("Кулибин", "Иван", "Петрович", 3, 25000);
        employees[8] = new Employee("Путин", "Владимир", "Владимирович", 4, 800000);
        employees[9] = new Employee("Медведев", "Дмитрий", "Анатольевич", 5, 7000);
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double calculateAllSalaries() {
        double salaries = 0;
        for (Employee employee : employees) {
            salaries += employee.getSalary();
        }
        return salaries;
    }

    public Employee findPoorEmployee() {
        Employee poorEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < poorEmployee.getSalary()) {
                poorEmployee = employee;
            }

        }
        return poorEmployee;
    }

    public Employee findRichEmployee() {
        Employee richEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > richEmployee.getSalary()) {
                richEmployee = employee;
            }

        }
        return richEmployee;
    }

    public double calculateAverageSalary() {
        return calculateAllSalaries() / employees.length;
    }

    public void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public void indexSalary(int indexingValue) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (indexingValue + 100) / 100);
        }
    }

    public Employee findPoorEmployeeByDepartment(int department) {
        Employee poorEmployeeByDepartment = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (poorEmployeeByDepartment == null) {
                    poorEmployeeByDepartment = employee;
                } else if (employee.getSalary() < poorEmployeeByDepartment.getSalary()) {
                    poorEmployeeByDepartment = employee;
                }
            }

        }
        return poorEmployeeByDepartment;
    }

    public Employee findRichEmployeeByDepartment(int department) {
        Employee richEmployeeByDepartment = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (richEmployeeByDepartment == null) {
                    richEmployeeByDepartment = employee;
                } else if (employee.getSalary() > richEmployeeByDepartment.getSalary()) {
                    richEmployeeByDepartment = employee;
                }
            }

        }
        return richEmployeeByDepartment;
    }

    public int findSalariesSumByDepartment(int department) {
        int salariesSumByDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                salariesSumByDepartment += employee.getSalary();
            }
        }
        return salariesSumByDepartment;
    }

    public double calculateAverageSalaryByDepartment(int department) {
        double salariesByDepartment = 0;
        int counterOfEmployeesByDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                salariesByDepartment += employee.getSalary();
                counterOfEmployeesByDepartment++;
            }
        }
        return salariesByDepartment / counterOfEmployeesByDepartment;
    }

    public void indexSalaryByDepartment(int department, int indexingValue) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * (indexingValue + 100) / 100);
            }
        }
    }

    public void printAllEmployeesByDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.toStringExceptDepartment());
            }
        }
    }

    public void printEmployeesWithSalaryLessThen(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee.toStringWhenFilteringSalary());
            }
        }
    }

    public void printEmployeesWithSalaryMoreThen(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.println(employee.toStringWhenFilteringSalary());
            }
        }
    }

    public void deleteEmployeeByFullNameOrId(String fullName, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (fullName != null && id != 0) {
                if (employees[i].getFullName() == fullName && employees[i].getId() == id) {
                    employees[i] = null;
                }
            } else if (fullName != null && id == 0) {
                if (employees[i].getFullName() == fullName) {
                    employees[i] = null;
                }
            } else if (fullName == null && id != 0) {
                if (employees[i].getId() == id) {
                    employees[i] = null;
                }
            }
        }
    }

    public void addNewEmployee(String surname, String name, String patronymic, int department, int salary) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(surname, name, patronymic, department, salary);
                System.out.println("Создан новый сотрудник:");
                System.out.println(employees[i].getFullName());
                break;
            }
        }
    }

    public void setSalaryOrDepartmentOfEmployee(int id, int salary, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                if (salary != 0 && department != 0) {
                    employees[i].setSalary(salary);
                    employees[i].setDepartment(department);
                } else if (salary == 0 && department != 0) {
                    employees[i].setDepartment(department);
                } else if (salary != 0 && department == 0) {
                    employees[i].setSalary(salary);
                }
            }
        }
    }

    public void printAllEmployeesFullNamesDistributedByDepartments() {
        System.out.println("Список сотрудников по отделам:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел " + i + ":");
            for (Employee employee : employees) {
                if (employee.getDepartment() == i) {
                    System.out.println(employee.getFullName());
                }
            }
        }
    }


}



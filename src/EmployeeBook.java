import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {


    Map<String, Employee> employees = new HashMap<>();

    public EmployeeBook() {
        employees.put("Fedorova Maria Ivanovna", new Employee(1, 63000));
        employees.put("Sidorova Elena Viktorovna", new Employee(4, 59000));
        employees.put("Petrova Anna Andreevna", new Employee(3, 61000));
        employees.put("Ivanova Irina Ivanovna", new Employee(2, 65000));

    }


    // Task #0
    public void printListEmployee() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
        System.out.println();
    }

    public int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees.values()) {
            sum += employee.getMonthSalary();
        }
        return sum;
    }

    public void findMinSalary() {
        int min = Integer.MAX_VALUE;
        String minSalaryEmployee = "";
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (min > entry.getValue().getMonthSalary()) {
                min = entry.getValue().getMonthSalary();
                minSalaryEmployee = entry.getKey();

            }
        }
        System.out.println("Cотрудник с минимальной ЗП: " + minSalaryEmployee + " ЗП = " + min);
    }

    public void findMaxSalary() {
        int max = Integer.MIN_VALUE;
        String maxSalaryEmployee = "";
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (max < entry.getValue().getMonthSalary()) {
                max = entry.getValue().getMonthSalary();
            }
        }
        System.out.println("Cотрудник с максимальной ЗП: " + maxSalaryEmployee + " ЗП = " + max);
    }

    public float calculateAverageSalary() {
        int sumAverage = calculateSumSalary();
        return (float) sumAverage / employees.size();

    }

    public void printName() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);

        }
    }

    // Task #1  Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
    public void indexingTheSalary(int percent) {
        for (Employee employee : employees.values()) {
            int salary = employee.getMonthSalary();
            int newSalary = salary + (salary * percent / 100);
            employee.setMonthSalary(newSalary);
        }
    }

    // Task #2 Получить в качестве параметра номер отдела (1-5) и найти (всего 6 методов):
    public int findEmployeeDepartmentMinSalary(int number) {
        int minSalary = Integer.MAX_VALUE;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getDepartment() == number &&
                    minSalary > entry.getValue().getMonthSalary()) {
                minSalary = entry.getValue().getMonthSalary();
            }
        }
        return minSalary;
    }

    public int findEmployeeDepartmentMaxSalary(int number) {
        int maxSalary = Integer.MIN_VALUE;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getDepartment() == number &&
                    maxSalary < entry.getValue().getMonthSalary()) {
                maxSalary = entry.getValue().getMonthSalary();
            }
        }
        return maxSalary;
    }

    public int paidTotalSalaryDeparments(int number) {
        int totalSalari = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getDepartment() == number) {
                totalSalari += entry.getValue().getMonthSalary();
            }
        }
        return totalSalari;
    }

    public float calculateAverageSalaryDepartment(int number) {
        int sumSalary = 0;
        int count = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getDepartment() == number) {
                sumSalary += entry.getValue().getMonthSalary();
                count++;
            }
        }
        return count > 0 ? sumSalary / count : 0;
    }

    public void indexingTheSalaryDepartment(int number, int percent) {
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() == number) {
                int salaryDepartment = employee.getMonthSalary();
                int newSalaryDepartment = salaryDepartment + (salaryDepartment * percent / 100);
                employee.setMonthSalary(newSalaryDepartment);
            }
        }
    }

    public void printListEmployeeDepartment(int number) {
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() == number) {
                System.out.println(employee);
            }
        }
    }

    // Task #3 Получить в качестве параметра число и вывести:
    public void printSalaryLessNumber(int num) {
        System.out.printf("Сотрудники у которых зп меньше %d:\n", num);
        int index = 0;
        for (Employee employee : employees.values()) {
            if (employee.getMonthSalary() < num) {
                System.out.println(employee);
                index++;
            }
        }
        if (index == 0) {
            System.out.printf("Меньше числа %d сотрудников нет\n", num);
        }
    }

    public void printSalaryGreaterNumber(int num) {
        int index = 0;
        System.out.printf("Сотрудники у которых зп больше (или равно) %d:\n", num);
        for (Employee employee : employees.values()) {
            if (employee.getMonthSalary() >= num) {
                System.out.println(employee);
                index++;
            }
        }
        if (index == 0) {
            System.out.printf("Больше или равно числу %d сотрудников нет\n", num);
        }
    }

    // Task #4
    public void addNewEmployee(String fullName, int department, int monthSalary) {
        employees.put(fullName, new Employee(department, monthSalary));
        System.out.println(employees.toString());

    }

public boolean removeEmployee(int number) {
    if (employees.remove(number) != null) {
        System.out.println("Сотрудник удален");
        System.out.println(employees.toString());
        return true;
    }
    System.out.println("Сотрудник с таким id не найден");
    return false;

}

// Task #5
// a) Добавить метод для получения сотрудника по id
public Employee getEmployeeId(int employeeId) {
    return employees.get(employeeId);
}

}




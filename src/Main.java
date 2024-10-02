public class Main {

    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        employee[0] = new Employee("Fedorova Maria Ivanovna", 5, 57000);
        employee[1] = new Employee("Sidorova Elena Viktorovna", 4, 59000);
        employee[2] = new Employee("Petrova Anna Andreevna", 3, 61000);
        employee[3] = new Employee("Ivanova Irina Ivanovna", 2, 65000);
        employee[4] = new Employee("Fedorov Fedor Fedorovich", 1, 70000);
        employee[5] = new Employee("Novikov Nikolay Sergeevich", 5, 57500);
        employee[6] = new Employee("Petrov Petr Petrovich", 4, 58000);
        employee[7] = new Employee("Sokolov Sergey Sergevich", 3, 61500);
        employee[8] = new Employee("Morozova Maria Grigorievna", 2, 64000);
        employee[9] = new Employee("Popov Pavel Sergeevich", 1, 69000);
        printListEmployee(employee);
        System.out.println();
        System.out.println("сумма затрат на ЗП в месяц: " + calculateSumSalary(employee));
        System.out.println();
        System.out.println("Сотрудника с минимальной ЗП: " + findMinSalary(employee));
        System.out.println();
        System.out.println("Сотрудника с максимальной ЗП: " + findMaxSalary(employee));
        System.out.println();
        System.out.println("Среднее значение зарплат за месяц: " + calculateAverageSalary(employee));
        System.out.println();
        printName(employee);
    }

    private static void printListEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculateSumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees)
            sum += employee.getSalary();
        return sum;
    }

    private static int findMinSalary(Employee[] employees) {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    private static int findMaxSalary(Employee[] employees) {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    private static float calculateAverageSalary(Employee[] employees) {
        int sumAverage = calculateSumSalary(employees);
        return (float) sumAverage / employees.length;
    }

    public static void printName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Name: " + employees[i].getName());
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
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
        System.out.println("Сотрудника с минимальной ЗП: " + findMinSaiary(employee));
        System.out.println();
        System.out.println("Сотрудника с максимальной ЗП: " + findMaxSaiary(employee));
        System.out.println();
        System.out.println("Среднее значение зарплат за месяц: " + calculateAverageSalary(employee));
        System.out.println();
        printName(employee);
    }

    private static void printListEmployee(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    private static int calculateSumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    private static int findMinSaiary(Employee[] employees) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (min >= employees[i].getSalary()) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    private static int findMaxSaiary(Employee[] employees) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (max <= employees[i].getSalary()) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    private static int calculateAverageSalary(Employee[] employees) {
        int sumAverage = calculateSumSalary(employees);
        return sumAverage / employees.length;
    }

    public static void printName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Name: " + employees[i].getName());
        }
    }
}


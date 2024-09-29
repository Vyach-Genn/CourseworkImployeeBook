import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Employee[] employeesArr = new Employee[10];
        employeesArr[0] = new Employee("Fedorova Maria Ivanovna", 5, 57000);
        employeesArr[1] = new Employee("Sidorova Elena Viktorovna", 4, 59000);
        employeesArr[2] = new Employee("Petrova Anna Andreevna", 3, 61000);
        employeesArr[3] = new Employee("Ivanova Irina Ivanovna", 2, 65000);
        employeesArr[4] = new Employee("Fedorov Fedor Fedorovich", 1, 70000);
        employeesArr[5] = new Employee("Novikov Nikolay Sergeevich", 5, 57500);
        employeesArr[6] = new Employee("Petrov Petr Petrovich", 4, 58000);
        employeesArr[7] = new Employee("Sokolov Sergey Sergevich", 3, 61500);
        employeesArr[8] = new Employee("Morozova Maria Grigorievna", 2, 64000);
        employeesArr[9] = new Employee("Popov Pavel Sergeevich", 1, 69000);
        indexingTheSalary(employeesArr, 10);
        Random random = new Random();
        // Получить в качестве параметра номер отдела (1-5)
        int departamentNumber = 1 + random.nextInt(5);
        // Получить в качестве параметра число для сравнения с зарплатой
        int compareSalary = 55000 + random.nextInt(30001);
//        // Сотрудника с минимальной зп;
        int minDepartmentSalary = findEmployeeDepartmentMinSalary(employeesArr, departamentNumber);
//        System.out.println("№ департамента " + departamentIndex + ". Минимальная зп отдела: " + minDepartmentSalary);
//        System.out.println();
//        // Сотрудника с максимальной зп;
        int maxDepartmentSalary = findEmployeeDepartmentMaxSalary(employeesArr, departamentNumber);
//        System.out.println("№ департамента " + departamentIndex + ". Масксимальная зп отдела: " + maxDepartmentSalary);
//        System.out.println();
//        // Сумму затрат на зп по отделу;
        int totalDepartmentSalary = paidTotalSalaryDeparments(employeesArr, departamentNumber);
//        System.out.println("№ департамента " + departamentIndex + ". Сумма затрат на отдел: " + totalDepartmentSalary);
//        System.out.println();
//        // Среднюю зп по отделу
        int averageDepartmentSalary = calculateAverageSalaryDepartment(employeesArr, departamentNumber);
//        System.out.println("№ департамента " + departamentIndex + ". Средняя сумма затрат на отдел: " + averageDepartmentSalary);
//        System.out.println();
        // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра;
        indexingTheSalaryDepartment(employeesArr, departamentNumber, 2);
        // Напечатать всех сотрудников отдела (все данные, кроме отдела).
        printListEmployeeDepartment(employeesArr, departamentNumber);
        System.out.println();
        printSalaryLessNumber(employeesArr, compareSalary);
        System.out.println();
        printSalaryGreaterNumber(employeesArr, compareSalary);

    }

    // Task #1  Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
    private static void indexingTheSalary(Employee[] employeesArr, int percent) {
        for (Employee employee : employeesArr) {
            int salary = employee.getMonthSalary();
            int newSalary = salary + (salary * percent / 100);
            employee.setMonthSalary(newSalary);
        }

    }

    // Task #2 Получить в качестве параметра номер отдела (1-5) и найти (всего 6 методов):
    // а) Сотрудник отдела с минимальной зп;
    private static int findEmployeeDepartmentMinSalary(Employee[] employeesArr, int number) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number && minSalary > employee.getMonthSalary()) {
                minSalary = employee.getMonthSalary();
            }
        }
        return minSalary;
    }

    // b) Сотрудник отдела с максимальной зп;
    private static int findEmployeeDepartmentMaxSalary(Employee[] employeesArr, int number) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number && maxSalary < employee.getMonthSalary()) {
                maxSalary = employee.getMonthSalary();
            }
        }
        return maxSalary;
    }

    // c) Сумма затрат на отдел;
    private static int paidTotalSalaryDeparments(Employee[] employeesArr, int number) {
        int totalSalari = 0;
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number) {
                totalSalari += employee.getMonthSalary();
            }
        }
        return totalSalari;
    }

    //  d) Средняя зп по отделу;
    private static int calculateAverageSalaryDepartment(Employee[] employeesArr, int number) {
        int sumSalary = 0;
        int count = 0;
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number) {
                sumSalary += employee.getMonthSalary();
                count++;
            }
        }
        return count > 0 ? sumSalary / count : 0;
    }

    // e) Проиндексировать зарплату всех сотрудников отдела на процент;
    private static void indexingTheSalaryDepartment(Employee[] employeesArr, int number, int percent) {
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number) {
                int salaryDepartment = employee.getMonthSalary();
                int newSalaryDepartment = salaryDepartment + (salaryDepartment * percent / 100);
                employee.setMonthSalary(newSalaryDepartment);
            }

        }

    }

    // f) Напечатать всех сотрудников отдела (все данные, кроме отдела)
    private static void printListEmployeeDepartment(Employee[] employeeArr, int number) {
        for (Employee employee : employeeArr) {
            if (employee.getDepartment() == number) {
                System.out.println(employee);
            }
        }
    }

    // Task #3 Получить в качестве параметра число и вывести:
    // a)  Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль);
    private static void printSalaryLessNumber(Employee[] employeesArr, int num) {
        System.out.printf("Сотрудники у которых зп меньше %d:\n", num);
        for (Employee employee : employeesArr) {
            if (employee.getMonthSalary() < num) {
                System.out.println(employee);
            }
        }

    }

    // b)  Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
    private static void printSalaryGreaterNumber(Employee[] employeesArr, int num) {
        System.out.printf("Сотрудники у которых зп больше (или равно) %d:\n", num);
        for (Employee employee : employeesArr) {
            if (employee.getMonthSalary() >= num) {
                System.out.println(employee);
            }
        }

    }


}


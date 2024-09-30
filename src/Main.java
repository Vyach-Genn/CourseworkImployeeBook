import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArr = new Employee[10];
        EmployeeBook employeeBook = new EmployeeBook(employeesArr);
        Random random = new Random();


        // Task #1  Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
        int present = 10;
        employeeBook.indexingTheSalary(present);

        // Task #2 Получить в качестве параметра номер отдела (1-5) и найти (всего 6 методов):

        // Получить в качестве параметра номер отдела (1-5)
        int departamentNumber = 1 + random.nextInt(5);

        // Получить в качестве параметра число для сравнения с зарплатой
        int compareSalary = 55000 + random.nextInt(30001);

        // а) Сотрудник отдела с минимальной зп;
        int minDepartmentSalary = employeeBook.findEmployeeDepartmentMinSalary(departamentNumber);
//        System.out.println("№ департамента " + departamentIndex + ". Минимальная зп отдела: " + minDepartmentSalary);
//        System.out.println();

//        // b) Сотрудник отдела с максимальной зп;
        int maxDepartmentSalary = employeeBook.findEmployeeDepartmentMaxSalary(departamentNumber);
//        System.out.println("№ департамента " + departamentIndex + ". Масксимальная зп отдела: " + maxDepartmentSalary);
//        System.out.println();

//        // c) Сумму затрат на зп по отделу;
        int totalDepartmentSalary = employeeBook.paidTotalSalaryDeparments(departamentNumber);
//        System.out.println("№ департамента " + departamentIndex + ". Сумма затрат на отдел: " + totalDepartmentSalary);
//        System.out.println();

//        // d) Среднюю зп по отделу
        int averageDepartmentSalary = employeeBook.calculateAverageSalaryDepartment(departamentNumber);
//        System.out.println("№ департамента " + departamentIndex + ". Средняя сумма затрат на отдел: " + averageDepartmentSalary);
//        System.out.println();

        // e) Проиндексировать зарплату всех сотрудников отдела на процент;
        employeeBook.indexingTheSalaryDepartment(departamentNumber, 2);

        // f) Напечатать всех сотрудников отдела (все данные, кроме отдела)
        employeeBook.printListEmployeeDepartment(departamentNumber);
        System.out.println();

        // Task #3 Получить в качестве параметра число и вывести:

        // a)  Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль)
        employeeBook.printSalaryLessNumber(compareSalary);
        System.out.println();

        // b)  Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
        employeeBook.printSalaryGreaterNumber(compareSalary);
        System.out.println();

        // Task #4
        // a) Добавить нового сотрудника. (метод должен найти свободную ячейку в массиве
        // и положить нового сотрудника в нее
        Employee newEmployee = new Employee("Sysin Egor Petrovich", 2, 54000);
        boolean IsNewEmployee = employeeBook.addNewEmployee(newEmployee);
        System.out.println();

        // b) Удалить сотрудника (находим сотрудника по id, нуллим его ячейку в массиве);
        int numberId = 5;
        employeeBook.removeEmployee(numberId);
        System.out.println();


        // Task #5
        // a) Добавить метод для получения сотрудника по id
        int employeeId = 4;
        employeeBook.getEmployeeId(employeeId);


    }

}


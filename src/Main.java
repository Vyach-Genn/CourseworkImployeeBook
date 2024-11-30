import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        Random random = new Random();

        // Task #1 методы из basicDifficulty
        // a)  Получить список всех сотрудников со всеми имеющимися по ним данными
        employeeBook.printListEmployee();

        // b)  Посчитать сумму затрат на ЗП в месяц;
        System.out.println("сумму затрат на ЗП в месяц: " + employeeBook.calculateSumSalary());
        System.out.println();

        // c) Найти сотрудника с минимальной ЗП;
        employeeBook.findMinSalary();
        System.out.println();

        // d) Найти сотрудника с максимальной ЗП;
        employeeBook.findMaxSalary();
        System.out.println();

        // e) Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b);
        System.out.println("Cреднее значение зарплат: " + employeeBook.calculateAverageSalary());
        System.out.println();

        // f)  Распечатать ФИО всех сотрудников (метод ничего).
        employeeBook.printName();
        System.out.println();



        // Task #2  Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
        int present = 10;
        employeeBook.indexingTheSalary(present);

        // Task #3 Получить в качестве параметра номер отдела (1-5) и найти (всего 6 методов):

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
        float averageDepartmentSalary = employeeBook.calculateAverageSalaryDepartment(departamentNumber);
//        System.out.println("№ департамента " + departamentIndex + ". Средняя сумма затрат на отдел: " + averageDepartmentSalary);
//        System.out.println();

        // e) Проиндексировать зарплату всех сотрудников отдела на процент;
        employeeBook.indexingTheSalaryDepartment(departamentNumber, 2);

        // f) Напечатать всех сотрудников отдела (все данные, кроме отдела)
        employeeBook.printListEmployeeDepartment(departamentNumber);
        System.out.println();

        // Task #4 Получить в качестве параметра число и вывести:

        // a)  Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль)
        employeeBook.printSalaryLessNumber(compareSalary);
        System.out.println();

        // b)  Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
        employeeBook.printSalaryGreaterNumber(compareSalary);
        System.out.println();

        // Task #5
        // a) Добавить нового сотрудника. (метод должен найти свободную ячейку в массиве
        // и положить нового сотрудника в нее
        employeeBook.addNewEmployee("Sysin Egor Petrovich", 2, 54000);
        System.out.println();

        // b) Удалить сотрудника (находим сотрудника по id, нуллим его ячейку в массиве);
        int numberId = 3;
        employeeBook.removeEmployee(numberId);
        System.out.println();

        // Task #6
        // a) Добавить метод для получения сотрудника по id
        int employeeId = 4;
        employeeBook.getEmployeeId(employeeId);


    }

}


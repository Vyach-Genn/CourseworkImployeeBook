public class EmployeeBook {

    private Employee[] employeesArr;

    public EmployeeBook(Employee[] employeesArr) {
        this.employeesArr = employeesArr;
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
    }

    public Employee[] getEmployeesArr() {
        return employeesArr;
    }

    // Task #1  Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
    public void indexingTheSalary(int percent) {
        for (Employee employee : employeesArr) {
            int salary = employee.getMonthSalary();
            int newSalary = salary + (salary * percent / 100);
            employee.setMonthSalary(newSalary);
        }
    }

    // Task #2 Получить в качестве параметра номер отдела (1-5) и найти (всего 6 методов):
    // а) Сотрудник отдела с минимальной зп;
    public int findEmployeeDepartmentMinSalary(int number) {
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number && minSalary > employee.getMonthSalary()) {
                minSalary = employee.getMonthSalary();
            }
        }
        return minSalary;
    }

    // b) Сотрудник отдела с максимальной зп;
    public int findEmployeeDepartmentMaxSalary(int number) {
        int maxSalary = Integer.MIN_VALUE;
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number && maxSalary < employee.getMonthSalary()) {
                maxSalary = employee.getMonthSalary();
            }
        }
        return maxSalary;
    }

    // c) Сумма затрат на отдел;
    public int paidTotalSalaryDeparments(int number) {
        int totalSalari = 0;
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number) {
                totalSalari += employee.getMonthSalary();
            }
        }
        return totalSalari;
    }

    //  d) Средняя зп по отделу;
    public int calculateAverageSalaryDepartment(int number) {
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
    public void indexingTheSalaryDepartment(int number, int percent) {
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number) {
                int salaryDepartment = employee.getMonthSalary();
                int newSalaryDepartment = salaryDepartment + (salaryDepartment * percent / 100);
                employee.setMonthSalary(newSalaryDepartment);
            }
        }
    }

    // f) Напечатать всех сотрудников отдела (все данные, кроме отдела)
    public void printListEmployeeDepartment(int number) {
        for (Employee employee : employeesArr) {
            if (employee.getDepartment() == number) {
                System.out.println(employee);
            }
        }
    }

    // Task #3 Получить в качестве параметра число и вывести:
    // a)  Всех сотрудников с зп меньше числа (распечатать id, фио и зп в консоль);
    public void printSalaryLessNumber(int num) {
        System.out.printf("Сотрудники у которых зп меньше %d:\n", num);
        for (Employee employee : employeesArr) {
            if (employee.getMonthSalary() < num) {
                System.out.println(employee);
            }
        }
    }

    // b)  Всех сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль).
    public void printSalaryGreaterNumber(int num) {
        System.out.printf("Сотрудники у которых зп больше (или равно) %d:\n", num);
        for (Employee employee : employeesArr) {
            if (employee.getMonthSalary() >= num) {
                System.out.println(employee);
            }
        }
    }

    // Task #4
    // a) Добавить нового сотрудника. (метод должен найти свободную ячейку в массиве
    // и положить нового сотрудника в нее
    public boolean addNewEmployee(Employee newEmployee) {
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i] == null) {
                employeesArr[i] = newEmployee;
                System.out.println("Сотрудник добавлен");
                return true;
            }
        }
        System.out.println("Мест нет.");
        return false;
    }

    // b) Удалить сотрудника (находим сотрудника по id, нуллим его ячейку в массиве);
    public boolean removeEmployee(int numberId) {
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i] != null && employeesArr[i].getId() == numberId) {
                employeesArr[i] = null;
                System.out.printf("Сутрудник с ID %d был удален.", numberId);
                return true;
            }
        }
        System.out.printf("Сутрудник с ID %d был не найден.", numberId);
        return false;

    }

    // Task #5
    // a) Добавить метод для получения сотрудника по id
    public boolean getEmployeeId(int employeeId) {
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i] != null && employeesArr[i].getId() == employeeId) {
                System.out.println(employeesArr[i]);
                return true;
            }
        }
        System.out.printf("Сутрудник с ID %d был не найден.", employeeId);
        return false;
    }

}

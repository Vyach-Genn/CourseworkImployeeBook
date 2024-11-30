import java.util.Objects;

public class Employee {
    // Лоля класса
    //private String fullName;
    private int department;
    private int monthSalary;
    // Статическая переменная-счетчик для id
    private static int nextId = 1;
    // Поле id для каждого объекта класса
    private int id;

    public Employee(int department, int monthSalary) {
        this.department = department;
        this.monthSalary = monthSalary;
        this.id = nextId++;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return department == employee1.department && monthSalary == employee1.monthSalary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, monthSalary);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, ЗП: %d", id,  monthSalary);
    }

    public String toStringTwo() {
        return String.format("ID: %d, Отдел: %d,  ЗП: %d", id, department, monthSalary);
    }
}

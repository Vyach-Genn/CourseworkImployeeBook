import java.util.Objects;

public class Employee {
    // Лоля класса
    private String fullName;
    private int department;
    private int monthSalary;
    // Статическая переменная-счетчик для id
    private static int nextId = 1;
    // Поле id для каждого объекта класса
    private int id;

    public Employee(String name, int department, int monthSalary) {
        this.fullName = name;
        this.department = department;
        this.monthSalary = monthSalary;
        this.id = nextId++;
    }

    public String getName() {
        return fullName;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && monthSalary == employee.monthSalary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, monthSalary, id);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s,  salary: %d", id, fullName, monthSalary);
    }
}

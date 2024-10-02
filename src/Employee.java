import java.util.Objects;

public class Employee {
    // Поля класса
    private String name;
    private int department;
    private int salary;
    // Статическая переменная-счетчик для id
    private static int index = 1;
    // Поле id для каждого объекта класса
    private int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = index++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }

    @Override
    public String toString() {
        return String.format("%d,  %s,  department=%d,  salary=%d", id, name, department, salary);
    }
}

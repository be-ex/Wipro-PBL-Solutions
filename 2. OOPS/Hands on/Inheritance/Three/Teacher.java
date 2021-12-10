package Three;

public class Teacher extends Person {

    private int salary;
    private String subject;

    public Teacher(int salary, String subject) {
        this.salary = salary;
        this.subject = subject;
    }

    Teacher() {
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "{ name= " + super.getName() + ", date of birth= " + super.getDateOfBirth() +
                " salary='" + getSalary() + "'" +
                ", subject='" + getSubject() + "'" +
                "}";
    }

}

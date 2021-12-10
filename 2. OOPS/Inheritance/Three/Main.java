package Three;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Sabir");
        teacher.setDateOfBirth("10/07/1998");
        teacher.setSalary(40000);
        teacher.setSubject("Mathematics");
        System.out.println("Teacher details: " + teacher.toString());

        CollegeStudent student = new CollegeStudent();
        student.setName("Arvind Kumar");
        student.setDateOfBirth("07/02/1998");
        student.setCollegeName("Quantum school of technology");
        student.setStudentId(10023);
        student.setYear("Fourth");
        System.out.println("Student details: " + student.toString());
    }
}

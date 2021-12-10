package Two;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Ravish Kumar");
        emp.setAnnualSalary(25869.55);
        emp.setDateOfJoining("20/08/1998");
        emp.setNationalInsuaranceNo("100EQ55RR5978UP");

        System.out.println(emp.toString());
    }
}

package Two;

public class Employee extends Person {

    private double annualSalary;
    private String dateOfJoining;
    private String nationalInsuaranceNo;

    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getDateOfJoining() {
        return this.dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getNationalInsuaranceNo() {
        return this.nationalInsuaranceNo;
    }

    public void setNationalInsuaranceNo(String nationalInsuaranceNo) {
        this.nationalInsuaranceNo = nationalInsuaranceNo;
    }

    @Override
    public String toString() {
        return "{ name= " + super.getName() +
                " annualSalary='" + getAnnualSalary() + "'" +
                ", dateOfJoining='" + getDateOfJoining() + "'" +
                ", nationalInsuaranceNo='" + getNationalInsuaranceNo() + "'" +
                "}";
    }

}
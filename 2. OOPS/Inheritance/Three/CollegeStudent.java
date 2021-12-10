package Three;

public class CollegeStudent extends Student {

    private String collegeName;
    private String year;

    public String getCollegeName() {
        return this.collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{ name=" + super.getName() + ", date of birth= " + super.getDateOfBirth() + ", student id= "
                + super.getStudentId() +
                ", collegeName='" + getCollegeName() + "'" +
                ", year='" + getYear() + "'" +
                "}";
    }

}

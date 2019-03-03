package ac.za.cputAssignmentStudent;

public abstract class Student implements AccademicReport {

    public Student(String firstName, String lastName, String nationalID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalID = nationalID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String toString()
    {
        return String.format("%s %s\n National Identification Number: %s",
                getFirstName(),getLastName(),getNationalID());
    }

    private String lastName;
    private String nationalID;

}

package ac.za.cputAssignmentStudent;

public class Report implements AccademicReport {

    public Report(String studNu, String studDetails, int number, double moduleFee) {
        this.studNu = studNu;
        this.studDetails = studDetails;
        this.number = number;
        this.moduleFee = moduleFee;
    }

    public String getStudNu() {
        return studNu;
    }

    public void setStudNu(String studNu) {
        this.studNu = studNu;
    }

    public String getStudDetails() {
        return studDetails;
    }

    public void setStudDetails(String studDetails) {
        this.studDetails = studDetails;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getModuleFee() {
        return moduleFee;
    }

    public void setModuleFee(double moduleFee) {
        this.moduleFee = moduleFee;
    }

    private String studNu;
    private String studDetails;
    private int number;
    private double moduleFee;

    @Override
    public double getMarks() {
        return 0;

    }
}

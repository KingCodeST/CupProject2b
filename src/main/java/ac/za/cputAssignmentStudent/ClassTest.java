package ac.za.cputAssignmentStudent;

public class ClassTest extends Student {

    private int MarksPerTest;

    public ClassTest(String firstName, String lastName, String nationalID, int marks) {
        super(firstName, lastName, nationalID);
       setMarksPerTest(marks);
    }



    @Override
    public double getMarks() {
        return getMarksPerTest();
    }

    public int getMarksPerTest() {
        return MarksPerTest;
    }

    public void setMarksPerTest(int marksPerTest) {
        MarksPerTest = marksPerTest;
    }

    public String toString()
    {
        return String.format("Marked Student: %s\n%s: $%,.2f ",
                super.toString(),"Term Test Marks ",getMarksPerTest());
    }
}

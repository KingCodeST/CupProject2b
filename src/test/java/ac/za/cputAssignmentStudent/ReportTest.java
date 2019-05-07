package ac.za.cputAssignmentStudent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReportTest {
        Report report;
    @Before
    public void setUp() throws Exception {
        report =new Report("T","3232323",56,6787);
    }


    @Test
    public void getStudNu() {
        assertNotNull("54r",report.getStudNu());
    }


    @Test
    public void getStudDetails() {
        assertNotNull("Adp =99 Mark for the year ADT =88 ",report.getStudDetails());
    }


    @Test
    public void getNumber() {
        assertNotNull("56",report.getNumber());
    }



    @Test
    public void getModuleFee() {
        assertNotNull(String.valueOf(56),report.getModuleFee());
    }


    @Test
    public void getMarks() {
        assertNotNull(String.valueOf(100),report.getMarks());
    }
}
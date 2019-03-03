package ac.za.cputAssignmentStudent;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {



    @Before
    public void setUp() throws Exception {
        Student stud;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFirstName() {
        Student stud =null;

        Assert.assertNotNull("Validate that the must not be null"+stud);
    }

    @Test
    public void setFirstName() {
        Student stud =null;

        Assert.assertNotNull("Validate that the must not be null"+stud);

    }

    @Test
    public void getLastName() {
        Student stud =null;

        Assert.assertNotNull("Validate that the must not be null"+stud);
    }

    @Test
    public void setLastName() {
        Student stud =null;

        Assert.assertNotNull("Validate that the must not be null"+stud);
    }

    @Test
    public void getNationalID() {
        Student stud =null;

        Assert.assertTrue("Validate that the must not be null",stud.getNationalID(""));
    }

    @Test
    public void setNationalID() {
        Student stud =null;

        Assert.assertTrue("Validate that the must not be null",stud.getNationalID(""));

    }

    @Test
    public String toString() {
        return null;
    }
}
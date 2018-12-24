import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {


    MainClass Main = new MainClass();

    @Test
    public void testGetLocalNumber()
    {
        int expected = Main.getLocalNumber();
        int actual = 14;
        //assertion
        Assert.assertTrue("getLocalNumber != 14",actual == expected);
        //check output
        System.out.println("getLocalNumber" + " = " + Main.getLocalNumber());
    }

    @Test
    public void testGetClassNumber()
    {
        int compared_number =  45;
        //assertion
        Assert.assertTrue("current number less than 45",compared_number < Main.getLocalNumber());
        //check output
        System.out.println("current number " + " = " + Main.getClassNumber());
    }

    @Test
    public void testGetClassString() {
        String compared_string = Main.getClassString();
        String expected_string = "hello";
        String expected_string2 = "Hello";
        //assertion
        if (compared_string.contains(expected_string2)) {
            Assert.assertTrue("Sub-string was found in: " + compared_string, true);
        } else if (compared_string.contains(expected_string)) {
            Assert.assertTrue("Sub-string was found in: " + compared_string, true);
        } else {
            Assert.assertFalse("Sub-string wasn't found in: " + compared_string, true);{
            }
        }
            //check output
            System.out.println("getClassString = " + Main.getClassString());
        }


    }

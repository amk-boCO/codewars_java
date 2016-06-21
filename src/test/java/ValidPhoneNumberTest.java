import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidPhoneNumberTest {
    @Test
    public void test_validPhoneNumbers() {
        assertEquals(true, ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
    }

    @Test
    public void test_invaldPhoneNumbers() {
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(AAA) 456-7890"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("  (AAA) 456-7890"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("  (AAA) 456-7890  A"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(1a3) 456-7890"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(123) 456-7fg0"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(12c) 4th6-7890"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("  (201) 456-7890"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(201) 456-7890   "));
    }
}

//Description:
//
//Write a function that accepts a string, and returns true if it is in the form of a phone number.
//Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
//
//Only worry about the following format:
//(123) 456-7890 (don't forget the space after the close parentheses)
//
//Examples:
//
//validPhoneNumber("(123) 456-7890")  =>  returns true
//validPhoneNumber("(1111)555 2345")  => returns false
//validPhoneNumber("(098) 123 4567")  => returns false

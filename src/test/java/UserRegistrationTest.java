import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void firstNameValid(){
        assertEquals(UserRegistration.FirstName("Swpnil"),true);
    }
    @Test
    public void firstNameInvalid(){
        assertEquals(UserRegistration.FirstName("sWAPNIL"),false);
    }

    @Test
    public void lastNameValid(){
        assertEquals(UserRegistration.LastName("Yadav"),true);
    }
    @Test
    public void lastNameInvalid(){
        assertEquals(UserRegistration.LastName("yADAV"),false);
    }
    @Test
    public void emailIdValid(){
        assertEquals(UserRegistration.emailId("swapniYl543@gmail.com"),true);
    }
    @Test
    public void emailID_Invalid(){
        assertEquals(UserRegistration.emailId("swapn.com"),false);
    }
    @Test
    public void phNumberValid(){
        assertEquals(UserRegistration.phNumber("+91 8104345244"),true);
    }
    @Test
    public void phNumberInvalid(){
        assertEquals(UserRegistration.phNumber("8104345244"),false);
    }
    @Test
    public void PasswordValid(){
        assertEquals(UserRegistration.Password("sY1@fs3esdv"),true);
    }
    @Test
    public void PasswordInvalid(){
        assertEquals(UserRegistration.Password("12345"),false);
    }

}
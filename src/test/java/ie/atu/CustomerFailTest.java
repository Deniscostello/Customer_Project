package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFailTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testTitleFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Customer("Mis", "Denis", 12345678,"H91A123" ));
        assertEquals("Invalid title, please use Mr , Ms , or Mrs", exMessage.getMessage());
    }

    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Customer("Mr", "D", 65493123,"123HO17" ));
        assertEquals("Invalid name,must be minimum 3 characters", exMessage.getMessage());
    }

    @Test
    void testPhoneFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Customer("Mrs", "Dave", 1234,"987AS12" ));
        assertEquals("Invalid phone no. ,must be 7 characters minimum", exMessage.getMessage());
    }

    @Test
    void testEircodeFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> new Customer("Ms", "Jane", 32145678,"12" ));
        assertEquals("Invalid eircode, must be 7 characters", exMessage.getMessage());
    }
    @AfterEach
    void tearDown() {
    }
}
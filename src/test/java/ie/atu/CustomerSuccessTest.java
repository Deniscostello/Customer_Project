package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerSuccessTest {

    private Customer myCustomer;

    @BeforeEach
    void setUp() {
        myCustomer = new Customer("Mr", "Denis", 12345678, "H914321");
    }

    @Test
    void testTitleSuccess(){
        assertEquals("Mr", myCustomer.getTitle());
        myCustomer.setTitle("Ms");
        assertEquals("Ms",myCustomer.getTitle());
        myCustomer.setTitle("Mrs");
        assertEquals("Mrs", myCustomer.getTitle());
    }

    @Test
    void testNameSuccess(){
        assertEquals("Denis", myCustomer.getName());
    }

    @Test
    void testPhoneSuccess(){
        assertEquals(12345678, myCustomer.getPhone());
    }

    @Test
    void testEircodeSuccess(){
        assertEquals("H914321",myCustomer.getEircode());
    }

    @AfterEach
    void tearDown() {
    }
}
package junit.simpletest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuotientTest {

    @Test
    void testquotient() {
        Quotient q = new Quotient();
        assertEquals(2,q.quotient(12,6));
    }

}
package junit.simpletest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YesOrNoTest {

    @Test
    void testBoolToWord() {
        assertEquals( "Yes", YesOrNo.boolToWord(true));
        assertEquals("No", YesOrNo.boolToWord(false));
    }
}
package L5;

import model.Human;
import model.Patient;
import org.junit.jupiter.api.*;
import service.NameService;



import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NameServiceTest {
    final NameService NAME_SERVICE = new NameService();
    final Human HUMAN = new Patient(2, "alex", "qwertyui");
    final String prevName = HUMAN.getName();

    @Test
    @DisplayName("3")
    void positiveTest (){
        assertDoesNotThrow(()->NAME_SERVICE.setName("Paul", HUMAN));
        assertEquals("Paul", HUMAN.getName());
    }

    @Test
    @DisplayName("4")
    void negativeTest (){
        assertDoesNotThrow(()->NAME_SERVICE.setName("", HUMAN));
        assertEquals(prevName, HUMAN.getName());
    }
}

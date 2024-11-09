package L5;

import model.Human;
import model.Patient;
import org.junit.jupiter.api.*;
import service.AgeService;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;




import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AgeServiceTest {
    final AgeService AGE_SERVICE = new AgeService();
    final Human HUMAN = new Patient(2, "alex", "qwertyui");

    @Test
    @DisplayName("1")
    void positiveTest (){
        assertDoesNotThrow(()->AGE_SERVICE.setAge(34, HUMAN));
        assertEquals(34, HUMAN.getAge());
    }

    @Test
    @DisplayName("2")
    void negativeTest (){
        assertDoesNotThrow(()->AGE_SERVICE.setAge(-34, HUMAN));
        assertEquals(0, HUMAN.getAge());
    }
}

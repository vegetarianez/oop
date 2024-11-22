package L7;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
public class TestsString {
    MyList<String> list = new MyList<>();



    @Test
    @DisplayName("add")
    void AddTest() {
        assertEquals(list.getSize(), 0);
        list.add("Привет");
        assertEquals(list.getSize(), 1);
        assertEquals(list.getTail().getValue(), "Привет");
        assertEquals(list.getHead().getValue(), "Привет");
        list.add("Пока");
        assertEquals(list.getSize(), 2);
        assertEquals(list.getTail().getValue(), "Пока");
        assertEquals(list.getHead().getValue(), "Привет");
    }
    @Test
    @DisplayName("delete without node")
    void delete1() {
        list.add("Привет");
        list.add("Пока");
        list.delete();
        assertEquals(list.getSize(), 1);
        assertEquals(list.getTail().getValue(), "Привет");
        assertEquals(list.getHead().getValue(), "Привет");
        list.delete();
        assertEquals(list.getSize(), 0);
    }
    @Test
    @DisplayName("delete with node")
    void delete2() {
        list.add("Привет");
        list.add("dos");
        list.add("Привет");
        list.add("uno");
        list.add("Привет");
        list.add("Привет");
        list.add("que pasa");
        list.add("Привет");

        list.delete("Привет");
        assertEquals(list.getSize(), 3);
        assertEquals(list.getTail().getValue(), "que pasa");
        assertEquals(list.getHead().getValue(), "dos");
    }
    @Test
    @DisplayName("find")
    void findByValueTest() {
        list.add("que pasa");
        list.add("!ola!");
        assertEquals(list.findByValue("que pasa").getValue(), "que pasa");
        assertEquals(list.findByValue("!ola!").getValue(), "!ola!");
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {
    private Container<String> container;

    @BeforeEach
    void setUp() {
        container = new Container<>(4);
    }


    @Test
    void testAdd() {
        container.add("A");
        container.add("B");
        container.add("C");
        container.add("D");

        assertEquals(4, container.size());
        assertEquals("A", container.get(0));
        assertEquals("B", container.get(1));
        assertEquals("C", container.get(2));
        assertEquals("D", container.get(3));
    }

    @Test
    void testGet() {
        container.add("A");
        container.add("B");
        container.add("C");
        container.add("D");

        assertEquals("A", container.get(0));
        assertEquals("B", container.get(1));
        assertEquals("C", container.get(2));
        assertEquals("D", container.get(3));
    }

    @Test
    void testRemove() {
        container.add("A");
        container.add("B");
        container.add("C");
        container.add("D");

        container.remove(1);

        assertEquals(3, container.size());
        assertEquals("A", container.get(0));
        assertEquals("C", container.get(1));
        assertEquals("D", container.get(2));
    }

    @Test
    void testSize() {
        assertEquals(0, container.size());
        container.add("A");
        assertEquals(1, container.size());
        container.add("B");
        assertEquals(2, container.size());
        container.add("C");
        assertEquals(3, container.size());
        container.add("D");
        assertEquals(4, container.size());
    }

    @Test
    void testExpCapacity() {
        container.add("A");
        container.add("B");
        container.add("C");
        container.add("D");
        container.add("E");

        assertEquals(5, container.size());
        assertEquals("A", container.get(0));
        assertEquals("B", container.get(1));
        assertEquals("C", container.get(2));
        assertEquals("D", container.get(3));
        assertEquals("E", container.get(4));

    }

    @Test
    void testClear() {
        container.add("A");
        container.add("B");
        container.add("C");
        container.add("D");

        container.clear();
        assertEquals(0, container.size());
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, Main.countWords(""));
    }

    @Test
    public void testSingleWord() {
        assertEquals(1, Main.countWords("Hello"));
    }

    @Test
    public void testMultipleWords() {
        assertEquals(5, Main.countWords("Hello from GitHub Classroom tool"));
    }

    @Test
    public void testWithSpaces() {
        assertEquals(3, Main.countWords("  Java   is fun "));
    }
}

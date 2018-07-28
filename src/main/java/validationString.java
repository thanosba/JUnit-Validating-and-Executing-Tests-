import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.*;
public class validationString {
    String message = "Testing Purpose";
    stringParameters messageU = new stringParameters(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageU.printMessage());
        assertThat(message, CoreMatchers.containsString("Testing"));
    }
}

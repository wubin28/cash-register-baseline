package cashregister;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CashRegisterTest {

    @Test
    public void process() {
        Printer mockPrinter = mock(Printer.class);

        assertEquals(5, 2 + 3);
    }
}
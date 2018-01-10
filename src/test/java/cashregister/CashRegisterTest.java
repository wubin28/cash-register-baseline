package cashregister;

import org.junit.Test;

public class CashRegisterTest {


    @Test
    public void should_print_null_purchase() {
        //initialize CashRegister and fake Printer

        cashRegister.process(null);

        //verify that printer was called
    }
}
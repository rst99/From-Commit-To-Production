
import org.junit.Test;

import java.sql.Date;

import ch.hsr.mge.gadgeothek.domain.Gadget;
import ch.hsr.mge.gadgeothek.domain.Loan;

import static org.junit.Assert.assertTrue;


public class DomainLoanTest {

    @Test
    public void isLoanOverdueBy2Days() {
        Gadget gadget = new Gadget("MyGadget");
        Loan loan = new Loan("id", gadget, new Date(2017,10,1), new Date(2017,10,10));

        // assert statements
        assertTrue(loan.isOverdue());
    }
}
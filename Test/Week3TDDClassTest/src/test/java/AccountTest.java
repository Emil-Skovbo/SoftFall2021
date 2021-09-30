import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class AccountTest {


    static Map<Long,Account> items = new HashMap<>();
    static long nextId = 0;
    public static Collection<Account> list() {
        return items.values();
    }
    public static Account find(long id) {
        return items.get(id);
    }


    @Test
    @DisplayName("testing 123")
    public void transferTargetTest(){
        Account acc = new Account();
        Account acc2 = new Account();

        acc.setMoney(100);
        assertEquals(100,acc.getMoney());
        acc.transferTargetTest(50,acc2);
        assertEquals(50,acc.getMoney());
    }
    @Test
    public void transferAmountTest(){
        new UnsupportedOperationException();
        Account acc = new Account();
        Account acc2 = new Account();
        acc.setMoney(1000);
        acc2.setNumber(2);
        assertEquals(1000,acc.getMoney());
        assertEquals(0,acc2.getMoney());

        acc.transferToTarget(1000,acc2);

        assertEquals(0,acc.getMoney());
        assertEquals(1000,acc2.getMoney());
    }

}

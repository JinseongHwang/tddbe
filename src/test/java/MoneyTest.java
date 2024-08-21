import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    /**
     * 주석의 숫자는 내가 작성한 순서 (잘 모르겠다면 마지막 줄부터 작성하는 테크닉)
     */
    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five); // 3. 두 Money의 합을 Expression으로 표현한다.
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD"); // 2. 실세계에서 환율이 적용되는 'Bank'를 도입 (유비쿼터스 언어로)
        assertEquals(Money.dollar(10), reduced); // 1. reduced는 Expression에 환율을 적용한 결과의 Expression
    }
}

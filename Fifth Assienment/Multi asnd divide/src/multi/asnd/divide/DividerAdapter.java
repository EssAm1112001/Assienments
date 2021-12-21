
package multi.asnd.divide;

import java.math.BigDecimal;

public class DividerAdapter implements DivideInterface{
    private Multiplier m;
    public DividerAdapter(Multiplier m)
    {
        this.m=m;
    }
    @Override
    public BigDecimal divide(BigDecimal num1) {
        //num1 = new BigDecimal("100");
        BigDecimal num2 = new BigDecimal("10");
        BigDecimal mul = num1.multiply(num2);
        return mul;
    }
    
}

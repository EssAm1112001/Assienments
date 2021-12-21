
package multi.asnd.divide;

import java.math.BigDecimal;

public class Multiplier implements MultiplyInterface{

    @Override
    public BigDecimal multiply(BigDecimal num1) {
        //num1 = new BigDecimal("100");
        BigDecimal num2 = new BigDecimal("10");
        BigDecimal mul = num1.multiply(num2);
        return mul;
    }
    
}

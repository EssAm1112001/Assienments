
package multi.asnd.divide;

import java.math.BigDecimal;

public class Divider implements DivideInterface{

    @Override
    public BigDecimal divide(BigDecimal num1) {
       // num1 = new BigDecimal("100");
        BigDecimal num2 = new BigDecimal("10");
        BigDecimal  div = num1.divide(num2);
        return div;
    }
    
}

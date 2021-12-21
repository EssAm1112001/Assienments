
package multi.asnd.divide;

import java.math.BigDecimal;

public class MultiAsndDivide {
    public static void main(String[] args) {
        Divider div1 = new Divider();
        BigDecimal num1 = new BigDecimal("100");
        System.out.println(div1.divide(num1));
        DividerAdapter div2 = new DividerAdapter(new Multiplier());
        System.out.println(div2.divide(num1));
    }    
}

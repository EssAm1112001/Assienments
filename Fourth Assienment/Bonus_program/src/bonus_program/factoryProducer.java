
package bonus_program;
public class factoryProducer {
    public static abstractClass getFactory(int n)
    {
        switch(n)
        {
            case 1:
                return new CS();
            case 2:
                return new IS();
            case 3:
                return new BIO();
            default:
                return null;
        }
    }
}


package program1;
public class Ball implements Tossable{
  private  String name;
    public Ball(String brandName){
        name = brandName;
    }
    public String getBrandName()
    {
        return name;
    }
    public void bounce(){}
    @Override
    public void toss() {
        System.out.println("The Ball has been tossed");
    }
    
}

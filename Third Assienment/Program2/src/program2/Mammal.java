
package program2;
public class Mammal implements Animal{
    @Override
    public void eat()
    {
        System.out.println("The Mammalian eat leaves and nuts");
    }
    @Override
    public void travel()
    {
        System.out.println("The Mammalian travel twice in the year");
    }
    public int NoofLegs(int n)
    {
        System.out.println("The number of legs : "+n);
        return n;
    }
    public String FavFood(String food)
    {
        System.out.println("The Favourite food is " + food);
        return food;
    }
}

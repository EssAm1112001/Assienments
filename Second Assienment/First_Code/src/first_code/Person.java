
package first_code;
public class Person {
    public String name ;
    public String address;
    public String email;
    public String phone;
    Person(String name , String address , String email , String phone)
    {
        this.address=address;
        this.email=email;
        this.name=name;
        this.phone=phone;
    }
    @Override
    public String toString()
    {
        System.out.println("In person class\nThe Name :"+name+"\nAddress : "+address+"\nEmail : "+email+"\nPhone : "+phone+"\n===============");
        return "";
    }
}

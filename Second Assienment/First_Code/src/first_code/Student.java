
package first_code;
public class Student extends Person {
    final public String freshman="Freshman";
    final public String sophomore = "Sophomore";
    final public String junior = "Junior";
    final public String senior = "Senior";

    public Student(String name, String address, String email, String phone) {
        super(name, address, email, phone);
    }
    @Override
    public String toString()
    {
        System.out.println("In Student class\nThe Name :"+name+"\nAddress : "+address+"\nEmail : "+email+"\nPhone : "+phone
                +"\nMy study status is : "+junior+"\n===============");
        return "";
    }
}

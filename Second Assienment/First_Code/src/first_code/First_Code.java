
package first_code;
public class First_Code {
    public static void main(String[] args) {
        //Person
        Person p = new Person("EssAm" , "Minya" , "em7354802@gmail.com" , "01117768480");
        p.toString();
        //===============================
        //Date hired
        MyDate d = new MyDate(1,11,2015);
        MyDate d2 = new MyDate(17,12,2025);
        MyDate d3 = new MyDate(19,10,2010);
        //Employee
        Employee e = new Employee("Khaled" , "Asuit" , "khaled.123@yahoo.com" , "011111111111" , "in third floor" , 3000.0 ,d);
        e.toString();
        //===============================
        //Student
        Student s = new Student("Mahmoud" , "Sohag" , "mahemeho_111@fci.edu.eg" , "01140620084");
        s.toString();
        //===============================
        //Faculty
        Faculty f = new Faculty("EssAm" , "New Minya" , "esamm5224@gmail.com" , "05555555555" , "I have no office" , 10000.0,d2,10,1);
        f.toString();
        //===============================
        //Staff
        Staff n = new Staff("Ali","Alex","ali.222@yahho.com","0097254815852","No office",200.0,d3,"The devil");
        n.toString();
    }
    
}


package bonus_program;
public class BIO extends abstractClass{
     @Override
    departments getDepartment(String departName) {
        if(departName.equalsIgnoreCase("Head of department"))
        {
            return  new bioDepartment();
        }
        else if(departName.equalsIgnoreCase("Doctors"))
        {
            return new bioDoctors();
        }
        else if (departName.equalsIgnoreCase("Students"))
        {
            return  new bioStudents();
        }
        else
            return null;
    }
    
}

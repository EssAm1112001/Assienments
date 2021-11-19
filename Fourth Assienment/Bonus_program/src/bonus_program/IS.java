
package bonus_program;
public class IS extends abstractClass{
     @Override
    departments getDepartment(String departName) {
        if(departName.equalsIgnoreCase("Head of department"))
        {
            return  new isDepartment();
        }
        else if(departName.equalsIgnoreCase("Doctors"))
        {
            return new isDoctors();
        }
        else if (departName.equalsIgnoreCase("Students"))
        {
            return  new isStudents();
        }
        else
            return null;
    }
    
}

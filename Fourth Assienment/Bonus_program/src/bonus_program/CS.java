
package bonus_program;
public class CS extends abstractClass{

    @Override
    departments getDepartment(String departName) {
        if(departName.equalsIgnoreCase("Head of department"))
        {
            return  new csDepartment();
        }
        else if(departName.equalsIgnoreCase("Doctors"))
        {
            return new csDoctors();
        }
        else if (departName.equalsIgnoreCase("Students"))
        {
            return  new csStudents();
        }
        else
            return null;
    }
    
}

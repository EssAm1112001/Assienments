
package first_program;
public class memberFactory {
    public  Staff member(String job)
    {
        String s = job.toLowerCase();
        switch(s)
        {
            case "doctor":
                return  new Doctor();
            case "teacher assistant":
                return new TeachingAssistant();
            default:
                return null;
        }
    }
}

package second_code;
public class Second_Code {
    public static void main(String[] args) {
        //Subject
        Subject sub1 = new Subject("MA305" , "Math" , 3);
        Subject sub2 = new Subject("CS341" , "Computer Network" , 3);
        //Address 
        address ad = new address("13 sudani street","Minya", "Egypt");
        //===========================
        //Student
        Student s = new Student("EssAm" , 80027291 , 2.68 ,sub1 , sub2,ad );
        s.toString();
    }
    
}


package second_code;
public class Student {
  public String name;
  private int id;
  public double GPA;
  public Subject sub1;
  public Subject sub2;
  public address as;
  public Student(String name , int id , double GPA , Subject sub1 ,Subject sub2 , address as)
  {
      this.GPA=GPA;
      this.id=id;
      this.name=name;
      this.sub1=sub1;
      this.sub2=sub2;
      this.as=as;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  public String detGrade(double GPA)
  {
      if(GPA>=3.5&&GPA<=4)
      {
          System.out.println("Grade : A");
      }
      else if(GPA>=3&&GPA<3.5)
      {
          System.out.println("Grade : B");
      }
      else if(GPA>=2.6&&GPA<3)
      {
          System.out.println("Grade : C");
      }
      else if(GPA>=2&&GPA<2.6)
      {
          System.out.println("Grade : D");
      }
      else 
      {
          System.out.println("Grade : F");
      }
      return "";
  }
  public String defSuccess(double GPA)
  {
      if(GPA>=2)
      {
          System.out.println("Status : Succeeded");
      }
      else
      {
          System.out.println("Status : Fallen");
      }
      return "";
  }
  public String warning(double GPA)
  {
      if(GPA<2)
      {
          System.out.println("Your GPA is smaller than 2 , so you should postpone one subject");
      }
      if(GPA<1.5)
      {
           System.out.println("Your GPA is smaller than 1.5 , so you should postpone two subjects");
      }
      return "" ;
  }
  public String toString()
  {
      System.out.println("Name : "+name+"\nID : "+id+"\nGPA : "+GPA+"\nAddress : "+as.StrNum+" "+as.City+" "+as.Country+"\nSubjects : "+"\nFirst Subject : \nSubject Name : "+sub1.subjectName+"\nSubject Code : "+sub1.subjectId
      +"\nSubject Hours : "+sub1.subHours+"\nSecond Subject :\nSubject Name : "+sub2.subjectName+"\nSubject Code : "+sub2.subjectId
      +"\nSubject Hours : "+sub2.subHours+defSuccess(GPA)+detGrade(GPA)+warning(GPA));
      return "" ;
  }
}


package bonus_program;

import java.util.Scanner;

public class Bonus_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==========Welcome in FCI Minya==========");
        System.out.print("If you want to continue enter \"ok\" : ");
        String ok = input.nextLine();
        String yesORno;
        int answer;
        if(ok.equalsIgnoreCase("OK"))
        {
            System.out.println("^|^ Welcome ^|^");
            System.out.println("In our faculty there is three departments ,each department has a head of department"
                    + ",doctors and studens.");
            do
            {
            System.out.println("Departments are : ");
            System.out.println("1 - CS"+"\n2 - IS"+"\n3 - BIO");
            System.out.print("Enter the number of department that you want to inquire about it : ");
            int numOfDepart = input.nextInt();
            yesORno = input.nextLine();
              switch(numOfDepart)
              {
                  case 1 :
                  abstractClass ab1 = factoryProducer.getFactory(numOfDepart);  
                  System.out.println("Welcome in CS department ^|^");
                      do
                      {
                      System.out.println("What do you looking for....?!");
                      System.out.println("1 - Head of department"+"\n2 - Doctors"+"\n3 - Students");
                      System.out.print("Answer : ");
                      answer = input.nextInt();
                         yesORno = input.nextLine();
                          switch(answer)
                      {
                          case 1 :
                          departments d1 = ab1.getDepartment("Head of departMENT");  
                          d1.headOfDepartment();
                          break;
                          case 2 :
                          departments d2 = ab1.getDepartment("Doctors");  
                          d2.doctors();
                          break;
                          case 3 :
                          departments d3 = ab1.getDepartment("Students");  
                          d3.students();
                          break;
                          default :
                          System.out.println("Wrong choice!!!");
                          break;
                      }
                          System.out.print("Do you want to continue in CS..?[Y/y || N/n] : ");
                          yesORno = input.nextLine();
                      }while(yesORno.equalsIgnoreCase("Y"));
                      break;
                  case 2 :
                      abstractClass ab2 = factoryProducer.getFactory(numOfDepart);  
                      System.out.println("Welcome in IS department ^|^");
                      do
                      {
                      System.out.println("What do you looking for....?!");
                      System.out.println("1 - Head of department"+"\n2 - Doctors"+"\n3 - Students");
                      System.out.print("Answer : ");
                      answer = input.nextInt();
                         yesORno = input.nextLine();
                          switch(answer)
                      {
                          case 1 :
                          departments d1 = ab2.getDepartment("Head of departMENT");  
                          d1.headOfDepartment();
                          break;
                          case 2 :
                          departments d2 = ab2.getDepartment("Doctors");  
                          d2.doctors();
                          break;
                          case 3 :
                          departments d3 = ab2.getDepartment("Students");  
                          d3.students();
                          break;
                          default :
                          System.out.println("Wrong choice!!!");
                          break;
                      }
                          System.out.print("Do you want to continue in I"
                                  + "S..?[Y/y || N/n] : ");
                          yesORno = input.nextLine();
                      }while(yesORno.equalsIgnoreCase("Y"));
                      break;
                  case 3 :
                      abstractClass ab3 = factoryProducer.getFactory(numOfDepart);  
                      System.out.println("Welcome in BIO department ^|^");
                      do
                      {
                      System.out.println("What do you looking for....?!");
                      System.out.println("1 - Head of department"+"\n2 - Doctors"+"\n3 - Students");
                      System.out.print("Answer : ");
                      answer = input.nextInt();
                         yesORno = input.nextLine();
                          switch(answer)
                      {
                          case 1 :
                          departments d1 = ab3.getDepartment("Head of departMENT");  
                          d1.headOfDepartment();
                          break;
                          case 2 :
                          departments d2 = ab3.getDepartment("Doctors");  
                          d2.doctors();
                          break;
                          case 3 :
                          departments d3 = ab3.getDepartment("Students");  
                          d3.students();
                          break;
                          default :
                          System.out.println("Wrong choice!!!");
                          break;
                      }
                          System.out.print("Do you want to continue in BIO..?[Y/y || N/n] : ");
                          yesORno = input.nextLine();
                      }while(yesORno.equalsIgnoreCase("Y"));
                      break;
                  default :
                      System.out.println("Wrong choise???");
                      break;
              }
              System.out.print("Do you want to continue in query..?[Y/y || N/n] : ");
                          yesORno = input.nextLine();
            }
            while(yesORno.equalsIgnoreCase("y"));
        }
        else
        {
            System.out.println("Exit");
        }
    }
    
}

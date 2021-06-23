import java.util.Scanner;
import java.util.StringTokenizer;
class Customer
{
    String name,dob;
    void readdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the customer name");
        name=sc.next();
        System.out.println("Enter the date of birth in dd/mm/yyyy format");
        dob=sc.next();
        sc.close();
    }
    void display()
    {        
        StringTokenizer st = new StringTokenizer(dob,"/");
        System.out.println("The details of the customer are :");
        System.out.print("<Name,DD,MM,YYYY>"+name);
        while(st.hasMoreTokens())
            System.out.print(","+st.nextToken());
    }
}
public class Program2b 
{
    public static void main(String[]args)
    {
        Customer p = new Customer();
        p.readdata();
        p.display();
            }
}

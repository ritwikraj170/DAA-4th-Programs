import java.lang.*; 
import java.util.*; 
public class Program3a 
{
    public static void main(String[] args) 
    {
        int a,b,result;
        Scanner read=new Scanner (System.in); 
        System.out.println("enter a&b"); 
        a=read.nextInt();
        b=read.nextInt();
        try
        {
            result=a/b;
            System.out.println("result="+result); 
        }
        catch(Exception e) 
        {
        System.out.println("Exception error="+e); 
        }
    } 
}

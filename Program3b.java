import java.util.*;
import java.io.*;
class rand extends Thread 
{
    public int result; 
    static int num;
    public int generate() 
    {
        Random rangen=new Random(); 
        num=rangen.nextInt(100);
        return(num); 
    }
    public void run() 
    {
        while(true) 
        {
            try 
            {
                result=generate(); 
                System.out.println("Random number:"+result); 
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) 
            {
                System.out.println("Exception in Rand"+ex); 
            }
        }        
    }
}
class square extends Thread 
{
    public int sqnum(int a) 
    {
        return(a*a); 
    }
    public void display(int a) 
    {
        System.out.println("Square:"+a); 
    }
    public void run() 
    {
        while(true) 
        {
            try 
            {
                display(sqnum(rand.num));
                Thread.sleep(1000); 
            }
            catch(InterruptedException ex) 
            {
                System.out.println("Exception in Rand"+ex); 
            }
        } 
    }
}
class cube extends Thread 
{
    public int cubenum(int a) 
    {
        return(a*a*a); 
    }
    public void display(int a) 
    {
        System.out.println("Cube:"+a); 
    }
    public void run() 
    {
        while(true) 
        {
            try 
            {
                display(cubenum(rand.num));
                Thread.sleep(1000);
            }
            catch(InterruptedException ex) 
            {
                System.out.println("Exception in Rand"+ex); 
            }
        } 
    }
}
public class Program3b 
{
    public static void main(String[] args) throws Exception 
    {
        rand obj_rand=new rand(); 
        obj_rand.start();
        square obj_sq=new square(); 
        obj_sq.start();
        cube obj_cu=new cube();
        obj_cu.start(); 
    }
}
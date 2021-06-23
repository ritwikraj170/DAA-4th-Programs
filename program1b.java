import java.lang.*;
import java.util.*;
class Stack 
{
   int st[]=new int[10];
   int top;
   int size;
   Stack()
   {
       top=-1;
       size=5;
   }
   void push(int item)
   {
       if(top==size-1)
           System.out.println("Stack overflow");
       else
       {
           st[++top]=item;
       }
   }
   void pop()
   {
       if(top==-1)
       {
           System.out.println("Stack Underflow");
       }
       else
       {
           System.out.println("item popped=" +st[top--]);
        }
   } 
   void display()
   {
       if(top==-1)
       {
           System.out.println("stack underflow");
       }
       else
       {
           for(int i=0;i<=top;i++)
           {
               System.out.println(+st[i]);
           }
       }
       }
}
   public class program1b
   {
       public static void main(String args[])
       {
           Stack Ob=new Stack();
           Scanner read=new Scanner(System.in);
           for(;;)
           {
               System.out.println("Enter 1:Push 2:Pop 3:Display 4:Exit");
               int ch=read.nextInt();
               switch(ch)
               {
                   case 1: System.out.println("Enter item");
                           int item=read.nextInt();
                           Ob.push(item);
                           break;
                   case 2: Ob.pop();
                           break;
                   case 3: System.out.println("Stack contains");
                           Ob.display();
                           break;
                   default : return;
                }
            }
        }
    }


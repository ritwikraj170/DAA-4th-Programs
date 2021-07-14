import java.lang.*;
import java.util.*;
public class Program6   //Knapsack Problem
{
    int n,m;
    int w[]=new int[10];
    int p[]=new int[10];
    int v[][]=new int[10][10];
    void getdata()
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number of items:");
        n=read.nextInt();
        System.out.println("Enter weight of each element:");
        for(int i=1;i<=n;i++)
        {
            w[i]=read.nextInt();
        }
        System.out.println("Enter profit of each item:");
        for(int i=1;i<=n;i++)
        {
            p[i]=read.nextInt();
        }
        System.out.println("Enter the maximum capacity:");
        m=read.nextInt();
        }
    int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    void optimal()
    {
        for(int i=0;i<=n;i++)
        {
            for (int j=0;j<=m;j++)
            {
                if(i==0|j==0)
                {
                    v[i][j]=0;
                }
                else if (w[i]>j)
                {
                    v[i][j]=v[i-1][j];
                }
                else
                {
                    v[i][j]=max(v[i-1][j],p[i]+v[i-1][j-w[i]]);
                }
            }
        }
    }
    void display()
    {
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        for(int i=0;i<=n;i++)
        {
            for (int j=0;j<=m;j++)
            {
                System.out.print(" "+v[i][j]);
            }
            System.out.println();
    }
        System.out.println("optimal solution="+v[n][m]);
    }
    public static void main(String args[])
    {
        Program6 ob = new Program6();
        ob.getdata();
        ob.optimal();
        ob.display();
    }
}
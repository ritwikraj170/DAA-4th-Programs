import java.lang.*; 
import java.util.*;
public class Program7 //Dijkstra Algorithm
{
    int n; 
    int source;
    int d[][]=new int[10][10]; 
    int path[]=new int [10]; 
    int visited[]=new int [10];
    void getdata() 
    {
        Scanner read=new Scanner(System.in); 
        System.out.println("enter the number of nodes"); 
        n=read.nextInt();
        System.out.println("enter the cost matrix");
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++) 
            {
            d[i][j]=read.nextInt();
            } 
        }
        System.out.println("enter the source"); 
        source=read.nextInt();
        for(int i=0;i<n;i++) 
        {
            visited[i]=0; 
        }
    }
    void shortest() 
    {
    int i,j,u=0,v=0,min; 
    for(i=0;i<n;i++)
    {
        path[i]=d[source][i];
    }
    visited[source]=1; 
    for(i=1;i<n;i++)
    {
        min=999; 
        for(j=1;j<n;j++)
        {
        if(path[i]<min && visited[j]==0) 
        {
            min=path[j]; 
            u=j;
        } 
        }
        visited[u]=1; 
        for(v=0;v<n;v++) 
        {
        if(path[u]+d[u][v]<path[v]&&visited[v]==0) 
        {
        path[v]=path[u]+d[u][v]; 
        }
        } 
    }
}
    void display() 
    {
        System.out.println("-_-_Shortest path_-_-"); 
        for(int i=0;i<n;i++)
        {
        System.out.println(source+"-"+i+"="+path[i]);
        } 
    }
    public static void main(String[] args) 
    {
        Program7 ob=new Program7(); 
        ob.getdata();
        ob.shortest(); 
        ob.display();
    } 
}
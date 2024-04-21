import java.io.*;
import java.util.*;

public class Main{
    
    static class Edge{
        int src;
        int dest;
        int wt;
        
        Edge(int src, int dest, int wt)
        {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    
    public static void bfsC(ArrayList<Edge> graph[]) //Works only for Connected Graph
    {
        boolean vis[] = new boolean[graph.length];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            int cur = q.remove();
            if(!vis[cur] == true)
            {
              System.out.print(cur+" ");  
              vis[cur] = true;
              for(int i =0 ; i < graph[cur].size();i++)
              {
                  Edge e = graph[cur].get(i);
                  if(!vis[e.dest])
                  q.add(e.dest);
              }
            }
        }
        System.out.println();
    }
    
    public static void bfsD(ArrayList<Edge> graph[],boolean vis[],int start)//Works for both Connected and Disconnected Graph
    {
       
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty())
        {
            int cur = q.remove();
            if(!vis[start] == true)
            {
              System.out.print(cur+" ");  
              vis[start] = true;
              for(int i =0 ; i < graph[start].size();i++)
              {
                  Edge e = graph[start].get(i);
                  if(!vis[e.dest])
                  q.add(e.dest);
              }
            }
        }
        
    }
    
     public static void dfs(ArrayList<Edge> graph[],boolean vis[],int start)//Works for both Connected and Disconnected Graph
    {
            if(vis[start] == true)
            {
                return;
            }
            
            System.out.print(start+" ");  
            vis[start] = true;
            for(int i =0 ; i < graph[start].size();i++)
            {
                Edge e = graph[start].get(i);
                if(vis[e.dest] == false)
                {
                    dfs(graph,vis,e.dest);
                }
            }
              
    }
    
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i =0; i < graph.length; i++)
        {
            graph[i] =  new ArrayList<Edge>();
        }
        
        // graph[0].add(new Edge(0, 1, 1));
        // graph[1].add(new Edge(1, 0, 1));
        // graph[2].add(new Edge(2, 3, 1));
        // graph[3].add(new Edge(3, 2, 1));
        
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(6, 5, 1));
        
    }
    
    public static void main(String args[])
    {
    
    //Connected Graph
         /*
        
        1 ---- 3
       /      |\ 
      0      |  \
      \     |    \
      2 --- 4 --- 5 --- 6
             
    */
    
    int v = 7;
    ArrayList<Edge> graph[] = new ArrayList[v];
    createGraph(graph);
    boolean vis[] = new boolean[v];
    
    bfsC(graph); //0 1 2 3 4 5 6 
    
    for(int i =0; i < v; i++)
    {
      if(vis[i] == false)
      {
        dfs(graph,vis,i); //0 1 3 4 2 5 6  or 0 1 2 3  
      }
    }
    System.out.println();
    
    //Disconnected Graph
    /*
        
        1 ---- 3
       /      |\ 
      0      |  \
      \     |    \
      2 --- 4 --- 5 --- 6
             
    */
    
    /*
    0 --- 1
    2 --- 3
    */
    
    // // int v = 7;
    // int v = 4;
    // ArrayList<Edge> graph[] = new ArrayList[v];
    // createGraph(graph);
    
    // boolean vis[] = new boolean[v];
    
    // for(int i =0; i < v; i++)
    // {
    //   if(vis[i] == false)
    //   {
    //     bfsD(graph,vis,i); //0 1 2 3 
    //   }
    // }
    // System.out.println();
    
    }
}

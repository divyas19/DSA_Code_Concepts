import java.io.*;
import java.util.*;

public class Main
{
    static class Edge(int s, int d, int w)
    {
       int src;
       int dest;
       int wt;
        public Edge(int s, int d, int w)
        {
            this.src = src;
        this.dest = d;
        this.wt = w;
        }
    }
    
    static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i =0 ; i < graph.length; i++)
        graph[i] = new ArrayList<>();
        
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
    
    public static void bfs(ArrayList<Edge> graph[],int val)
    {
        
    }
    
    // public static void dfs(ArrayList<Edge> graph[],int val)
    // {
        
    // }
    
    public static void main(String args[])
    {
        
    /*
        
        1 ---- 3
       /      |\ 
      0      |  \
      \     |    \
      2 --- 4 --- 5 --- 6
             
    */
    
      int V = 7;
      ArrayList<Edge> graph[] = new ArayList[V];
      createGraph(graph,V);
      
      bfs(graph, V);
    //   dfs(graph, V);
    }
}

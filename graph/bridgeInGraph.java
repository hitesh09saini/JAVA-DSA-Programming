package graph;

import java.util.ArrayList;

public class bridgeInGraph {
    static class Edge{
        int src;
        int dest;
        

        public Edge(int s ,int d ){
            this.src = s;
            this.dest = d;
        
        }
    }

    public static void createGraph(ArrayList<Edge> graph[] ,int v){
      for(int i=0;i<v;i++){
        graph[i] = new ArrayList<>();
      }

      graph[0].add(new Edge(0, 1));
      graph[0].add(new Edge(0, 2));
      graph[0].add(new Edge(0, 3));

      graph[1].add(new Edge(1, 0));
      graph[1].add(new Edge(1, 2));

      graph[2].add(new Edge(2, 0)); 
      graph[2].add(new Edge(2, 1));

      graph[3].add(new Edge(3, 0));
      graph[3].add(new Edge(3, 4));
      

      graph[4].add(new Edge(4, 3));
     
    }

    public static void tarjanBridge(ArrayList<Edge> graph[],int v){
        int dt[] = new int[v];
        int low[]= new int[v];
        int time =0;
        boolean vis[] = new boolean[v];

        for(int i=0;i< v ;i++){
            if(!vis[i]){
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }
    }
    private static void dfs(ArrayList<Edge> graph[], int curr,int par ,int dt[],int low[],boolean vis[],int time) {
        vis[curr] = true;
        dt[curr] =low[curr] = ++time;

        for(int i=0;i<graph[curr].size();i++){
          Edge e = graph[curr].get(i);
          int neigh = e.dest;
          if(neigh ==  par){
            continue;
          }else if(!vis[neigh]){
            dfs(graph, neigh, curr, dt, low, vis, time);
            low[curr] = Math.min(low[curr], low[neigh]);
            if(dt[curr] < low[neigh]){
                System.out.println("Bridge : "+curr+" --- "+ neigh);
            }
          }else{
            low[curr]  = Math.min(low[curr], dt[neigh]);
          } 
        }

    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph, v);

        tarjanBridge(graph, v);
    }
}
 
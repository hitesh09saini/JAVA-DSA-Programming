package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstraAlgorithm {
     static class Edge{
         int src;
         int dest;
         int we;
      
        public Edge(int s, int d,int w){
            this.src = s;
            this.dest = d;
            this.we = w;
        }
    }


     static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        
        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,4));

        
        graph[1].add(new Edge(1, 3,7));
        graph[1].add(new Edge(1, 2,1));

        graph[2].add(new Edge(2, 4,3));

        graph[3].add(new Edge(3, 5,1));

        graph[4].add(new Edge(4, 3,2));
        graph[4].add(new Edge(4, 5,5));

    }

    static class pair implements Comparable<pair>{
        int n;
        int path;

        public  pair(int n ,int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(pair p2){
            return this.path - p2.path;
        }

    }

    public static void dijkstra(ArrayList<Edge>[] graph ,int s) {
        int dist[] = new int[graph.length];

        for(int i=0;i<graph.length;i++){
             if(i!=s){
                dist[i] = Integer.MAX_VALUE;
             }
        }

        PriorityQueue<pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];
        pq.add(new pair(s, 0));

        while(!pq.isEmpty()){
            pair cur = pq.remove();

            if(!vis[cur.n]){
              vis[cur.n] =true;

               for(int i=0;i<graph[cur.n].size();i++){
                Edge e = graph[cur.n].get(i);
                int u = e.src;
                int v = e.dest;
                int w = e.we;

                if(dist[u]+w < dist[v]){
                     dist[v] = dist[u]+w ;
                     pq.add(new pair(v, dist[v]));
            
                }
               }

            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }

    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src =0;

       dijkstra(graph, src);
        
    }
}

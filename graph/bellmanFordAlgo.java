package graph;

import java.util.ArrayList;

public class bellmanFordAlgo {
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
     
        graph[1].add(new Edge(1, 2,-4));

        graph[2].add(new Edge(2, 3,2));

        graph[3].add(new Edge(3, 4,4));

        graph[4].add(new Edge(4, 1,-1));
    
    }


    public static void bellmanFord(ArrayList<Edge> graph[] ,int src){
        int dist[] = new int[graph.length];
        for(int i=0;i<dist.length;i++){
             if( i != src){
                dist[i] = Integer.MAX_VALUE;     
             }
        }

        int v = graph.length;
        // O(V)
        for(int i=0;i<v-1;i++){
            // edge
            for(int j=0;j<graph.length;j++){ //O(E)
                for(int k =0; k < graph[j].size();k++){
                    Edge e = graph[j].get(k);

                    if(dist[e.src] != Integer.MAX_VALUE && dist[e.src]+e.we < dist[e.dest]){
                        dist[e.dest] = dist[e.src]+e.we;
                    }
                }
            }
        }


        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
         int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        bellmanFord(graph, 0);
    }
}

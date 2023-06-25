package graph;

import java.util.ArrayList;

public class cycleDetectionDFS {
     static class Edge{
         int src;
         int dest;
      
         public Edge(int s, int d){
            this.src = s;
            this.dest = d;
           


         }
    }


     static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(2, 1));


        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4,3));
        

    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        
    }
}

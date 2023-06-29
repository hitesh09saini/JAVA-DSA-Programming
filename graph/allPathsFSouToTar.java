package graph;

import java.util.ArrayList;

public class allPathsFSouToTar {
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
        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5, 2));
        
        

    }


    // O(v^v) exponential 
    private static void findAllPaths(ArrayList<Edge>[] graph, int s, int d,String path) {
        
        if(s == d){
            System.out.println(path+d);
            return;
        }

        for(int i=0;i<graph[s].size();i++){
            Edge e=  graph[s].get(i);
            findAllPaths(graph, e.dest, d, path+s);
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int s =5,d =1;
        findAllPaths(graph , s, d,"");
    }
}

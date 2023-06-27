package graph;

import java.util.ArrayList;

public class dfsGraph {
     static class Edge {
        int s;
        int d;
        int w;

        public Edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

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

        graph[6].add(new Edge(6, 5, 1));
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean b[]) {
        
        System.out.print(curr+" ");

        b[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!b[e.d]){
                dfs(graph, e.d, b);
            }
        }


    }
    public static void main(String[] args) {
         int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        dfs(graph, 0, new boolean[v]);
    }
}

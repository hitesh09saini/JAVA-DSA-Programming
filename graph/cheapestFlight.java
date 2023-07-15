package graph;

// cheapest Flights wthin k stop

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class cheapestFlight {
    static class Flight {
        int from;
        int to;
        int price;

        public Flight(int f, int t, int p) {
            this.from = f;
            this.to = t;
            this.price = p;
        }

    }

    public static void create(ArrayList<Flight>[] Flights) {

        for (int i = 0; i < Flights.length; i++) {
            Flights[i] = new ArrayList<>();
        }

        Flights[0].add(new Flight(0, 1, 1));
        Flights[0].add(new Flight(0, 1, 5));

        Flights[1].add(new Flight(1, 2, 1));
        Flights[2].add(new Flight(2, 3, 1));
       
    }

    static class Info {
        int to;
        int cost;
        int stop;

        public Info(int v, int p, int s) {
            this.to = v;
            this.cost = p;
            this.stop = s;

        }
    }

    public static int cheapstFlight(int n, int src, int dest, int k, ArrayList<Flight>[] Flights) {
        int dist[] = new int[n];

         
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }


        Queue<Info> q= new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stop >k)break;

            for(int i=0; i<Flights[curr.to].size();i++){
                Flight f = Flights[curr.to].get(i);
                int u  = f.from;
                int v =  f.to;
                int wt = f.price;

                if(curr.cost + wt < dist[v] && curr.stop <=k){
                    dist[v] = dist[u]+wt;
                    q.add(new Info(v, dist[v], curr.stop+1));
                }
            }
        }


        if(dist[dest] == Integer.MAX_VALUE)return -1;
        else return dist[dest];

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Flight>[] Flights = new ArrayList[V];
        create(Flights);

        int k = 1;
        int s = 0, d = 3;
       System.out.println(cheapstFlight(V, s, d, k, Flights));
    }

}

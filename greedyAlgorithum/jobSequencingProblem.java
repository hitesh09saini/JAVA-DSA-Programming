package greedyAlgorithum;

import java.util.ArrayList;
import java.util.Collections;


public class jobSequencingProblem {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;

        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        Job job[] = new Job[arr.length];

        for (int i = 0; i < arr.length; i++) {
            jobs.add(new Job(i, arr[i][0], arr[i][1]));
        }

        // lamda function
        Collections.sort(jobs, (a, b) -> b.profit - a.profit); // descending order

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {

            Job curr = jobs.get(i);

            if (curr.deadline > time) {
               seq.add(curr.id);
               time++;
            }
        }

        System.out.println("max jobs = "+seq.size());
        for(int i=0;i<seq.size();i++){

            System.out.println(seq.get(i)+" ");
        }System.out.println();

    }

}

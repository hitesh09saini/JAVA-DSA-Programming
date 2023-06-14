package heaps;

import java.util.PriorityQueue;

public class priorityQue {

    static class Student implements Comparable<Student>{  // overriding
        String name;
        int rank;

        public Student(String name,int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank -s2.rank;
        } 
 
    }
    public static void main(String[] args) {
        PriorityQueue<Student> nu = new PriorityQueue<>();
        Student s1 = new Student("Hitesh", 1);
        Student s2 = new Student("Hitesh", 10);
        Student s3 = new Student("Hitesh", 18);
        Student s4 = new Student("Hitesh", 4); 
        
        nu.add(s1);
        nu.add(s2);
        nu.add(s3);
        nu.add(s4);

        while(!nu.isEmpty()){
            System.out.println(nu.peek().name+" -> "+nu.peek().rank);
            nu.remove();
        }
    }
}

package hashing;

import java.util.HashSet;

public class countDistrinctElements {
    public static void main(String[] args) {
        int n[]={4,3,2,5,6,7,3,4,2,1};

        HashSet<Integer>s = new HashSet<>();

        for(int i: n)s.add(i);
    
        System.out.println("Array length : "+n.length +"   count :"+s.size());
    }
}

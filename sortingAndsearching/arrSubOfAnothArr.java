import java.util.HashMap;

public class arrSubOfAnothArr {
    public static void main(String[] args) {
        long a1[] ={11, 7, 1, 13, 21,7, 3, 3};
        long a2[] = {11, 3, 7, 1, 7};

       System.out.println(check(a1,a2));
    }

    private static boolean check(long[] a1, long[] a2) {
        HashMap<Long, Integer> m = new HashMap<>();
        
        for(long l :a2){
            if(m.containsKey(l)){
                int v = m.get(l);
                v++;
                m.put(l, v);
            }
             else{
                m.put(l, 1);
            }
        }

        for(long l : a1){
            if(m.containsKey(l)){
                int v = m.get(l);
                v--;
                m.put(l, v);
            }
           
        }

        for(long l : a2)
        if(m.containsKey(l))if(m.get(l) > 0)return false;
     
        return true;
    }
}

package greedyAlgorithum;

import java.util.Arrays;

import java.util.Collections;

public class chocolaProblem {
    public static void main(String[] args) {
        int n=4,m=6;
        Integer ver[]={4,3,2,1,1};
        Integer hor[]={4,2,1};
        Arrays.sort(hor, Collections.reverseOrder());
        Arrays.sort(ver, Collections.reverseOrder());
        int h=0,v=0;
        int hp =0,vp =0;
        int cost =0;
        while(h < hor.length && v< ver.length){

            // vertica cost <  hor cost
            if(ver[v]<= hor[h]){

                cost+=(hor[h]*vp);
                hp++;
                h++;
            }else{
                // vertical cut
                cost +=(ver[v]*hp);
                vp++;
                v++;
            }
        }

        while(h < hor.length){
            cost+=(hor[h]*vp);
             hp++;h++;

        }

        while(v < ver.length){
            cost+=(ver[h]*hp);
             vp++;v++;
             
        }
       
        System.out.println("min  cost of cut "+cost);
    }

}

public class towerOfHanoi {
  public static void main(String[] args) {
    int n =3;
     TowerOfHanoi(n, "S", "H", "D");
  }  

  public static void TowerOfHanoi(int n,String src,String hel,String des ) {
    // base case
     if(n==1){
       
    System.out.println(" transfer disk "+n+" from "+src+" to "+des);
        return ;
     }


     // n-1 disk transfer source to helper
     
    TowerOfHanoi(n-1, src, des, hel);
    System.out.println(" transfer disk "+n+" from "+src+" to "+des);

    // n-1 disk transfer  helper to destination
    TowerOfHanoi(n-1, hel, src, des);
    

  }
}

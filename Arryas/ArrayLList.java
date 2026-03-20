

import java.util.ArrayList;


public class ArrayLList {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(90);
        arr.add(89);
        arr.add(78);
        arr.add(67);
        arr.add(56);
        for (int i = 0;i<5;i++){
            System.out.print(" "+arr.get(i));
        }
        arr.set(1,50);
        System.out.println(" "+arr.get(1));
        System.out.println(arr);
      for(int x : arr){
          System.out.print(x+" ");
      }
      arr.add(1,100);
        System.out.println(arr);
  arr.remove(arr.size()-1);
        System.out.println(arr);
       // Collections.reverse(arr);

        int i = 0; int j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
           arr.set(i,arr.get(i)) ;
            arr.set(j,temp);
            i++;
            j--;

        }
        System.out.println(arr);
    }
}

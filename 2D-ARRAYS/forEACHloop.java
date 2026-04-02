public class forEACHloop {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{7,4,6,8},{3,8,1,9},{9,8,7,6},{5,4,3,2}};
        for(int [] a : arr ){
            for (int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
//        for(int i = 0;i< arr.length;i++){
//            for(int ele : arr[i]){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
    }
}

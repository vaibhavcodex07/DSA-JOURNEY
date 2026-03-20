public class mergetwosortedArrays {
    public static void main(String[] args) {
        int [] a = {1 ,2,3,4,5,6};
        int [] b = {7,8,9,10,11,12,14};
        int [] c = new int[a.length+b.length];
        for (int x:c){
            System.out.print(" "+x);
        }
        System.out.println();
        merge(c,a,b);
        for (int x:c){
            System.out.print(" "+x);
        }
        System.out.println();
    }
    public static void merge(int[] c,int[]b,int[]a){
            int i = 0; int j = 0; int k = 0;
            while(i< a.length && j<b.length){
                if(a[i]<b[j]){
                    c[k++] = a[i++];
                }
                else{
                    c[k++] = b[j++];
                }
            }
            if (i == a.length){
                while(j<b.length){
                    c[k++] = b[j++];
          }
       }
        if (j == b.length){
            while(i<a.length){
                c[k++] = a[i++];
            }
        }
    }
}


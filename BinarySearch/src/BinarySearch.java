

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        int[] whiteList = In.readInts(args[0]);
    }
    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (key<a[mid]){
                hi = mid-1;
            }else if (key>a[mid]){
                lo = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static int rantT(int key,int[] a){
        int hi = a.length-1;
        int lo = 0;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (key>a[mid]){
                lo = mid+1;
            }else if (key<a[mid]){
                hi = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

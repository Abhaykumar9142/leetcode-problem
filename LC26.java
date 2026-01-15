import java.util.ArrayList;

public class LC26 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 7, 9};
        int k=1;
        for(int i=1;i<arr.length;i++) {
                if (arr[i] != arr[i -1]) {
                    arr[k] = arr[i];
                    k++;
                }
        }
        System.out.println(k);

for(int j=0;j<k;j++){
    System.out.print(arr[j]+" ");
}
       }

    }



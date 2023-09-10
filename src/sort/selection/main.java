package sort.selection;

import java.util.Arrays;

public class main {
    // 매 반복 마다 최소값을 찾아서 해당 위치로 교체해준다.
    public static void main(String[] args) {
        int[] arr = {13,4,2,5,19};

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                int target = i;
                if(arr[j] < arr[i]){
                    target = j;
                }
                //swap
                int temp = arr[target];
                arr[target] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

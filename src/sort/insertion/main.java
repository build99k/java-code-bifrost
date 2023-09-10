package sort.insertion;

import java.util.Arrays;

public class main {

    // 순회하면서 해당 인덱스 뒤에있는 친구들을 계속 정렬해주면서 전진함
    public static void main(String[] args) {
        int[] arr = {13,4,2,5,19};

        for(int i=1;i<arr.length;i++){
            int pointer = arr[i];
            int j;
            for (j= i-1;j>=0;j--){
                if(arr[j] > pointer){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
                System.out.println(Arrays.toString(arr));
            }
            arr[j+1] = pointer;
        }

        System.out.println(Arrays.toString(arr));
    }
}

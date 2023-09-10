package sort.bubble;

import java.util.Arrays;

public class main {

    // 한번의 순회에서 맨 뒤 숫자를 지정함.
    public static void main(String[] args) {
        int[] arr = {13,4,2,5,19};
        int cnt = 0;
        // i는 턴의 횟수, 몇번 돌릴거냐 매 루프마다 마지막 번호가 지정되므로 5개 배열이면 4번만 돌면됨
        // ex)
        // 1차시도 : x,x,x,x,완료
        // 2차시도 : x,x,x,완료,완료
        // 3차시도 : x,x,완료,완료,완료
        // 4차시도 : x,완료,완료,완료,완료
        // 4차시도까지 돌면 맨 첫번째도 자동 완료처리됨.
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                cnt++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(cnt);
    }
}

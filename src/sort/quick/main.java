package sort.quick;

import java.util.Arrays;

public class main {

    //퀵소트 순서
    // 1. 배열의 중간값을 찾는다
    // 2. 양쪽 끝부터 시작하여 중간값과 비교를 진행한다.
    // 2-1. 왼쪽은 중앙값보다 큰값을 찾고, 오른쪽은 중앙값보다 작은 값을 찾는다.
    // 재귀호출로 배열하나가 남을때까지 반복 수행한다.
    public static int partition(int[] arr, int start, int end){
        int pivot = (start + end) / 2;
        //양 끝에서 시작하여 중앙값과 비교한다.
        while(start<=end){
            //좌측
            while(arr[start] < arr[pivot]) start++;
            while(arr[pivot] < arr[end]) end--;
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return start;
    }
    public static void quickSort(int[] arr, int start, int end){
        int point = partition(arr, start, end);
        if(start < point-1)
            quickSort(arr,start,point-1);
        if(point < end)
            quickSort(arr, point, end);
    }

    public static void main(String[] args) {
        int[] arr = {13,4,2,5,19};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

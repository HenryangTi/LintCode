package sortColors;

public class solution {
    public void quick(int start, int end, int[] arr){
        int pivot = arr[(start + end) / 2];
        if(start >= end){
            return;
        }
        int left = start;
        int right = end;
        while(left <= right){
            while(left <= right && arr[left] < pivot){
                left++;
            }
            while(left <= right && arr[right] > pivot){
                right--;
            }
            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            quick(start,right,arr);
            quick(left,end,arr);

        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 2};
        solution s = new solution();
        s.quick(0, arr.length - 1, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

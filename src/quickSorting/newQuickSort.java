package quickSorting;

public class newQuickSort {

    public void quickSort(int[] arr, int start, int end){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println(start+"->"+end);
        if(start >= end){
            System.out.println("return");
            return;
        }
        int pivot = arr[ (start + end) / 2 ];
        int left = start;
        int right = end;
        System.out.println(pivot);
        while(left <= right) {
            /**
             * 不能用if
             * 原因是应该找到两个不符合的再交换
             * 如果把while改成if的话
             * 会导致两个正确的数字交换
             */
            while (left <= right && arr[left] < pivot) {
                left++;
            }
            /**
             *
             *
             */
            while (left <= right && arr[right] >= pivot) {
                right--;
            }
            /**
             * 不能取<,因为会在[3]卡住
             */
            if(left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        quickSort(arr, start, right);
        System.out.println("heiehie");
        System.out.println("left:"+left+"right:"+end);
        quickSort(arr, left, end);
        System.out.println("haha");
    }






    public static void main(String[] args){
        int[] arr = {5, 3, 4, 2, 1};
        int[] brr = new int[3];
        if(arr == null || arr.length == 0){
            System.out.println("错误");
        }
        else{
            newQuickSort newq = new newQuickSort();
            newq.quickSort(arr, 0, arr.length - 1);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}

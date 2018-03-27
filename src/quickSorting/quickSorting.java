package quickSorting;

public class quickSorting {
    public static void main(String[] args){
        int arr[] = {2, 8, 7, 1, 3, 5, 6, 4};
        quickSorting quick = new quickSorting();
        quick.quickSort(arr,0, arr.length - 1);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }
    public void quickSort(int arr[], int p, int r){
        quickSorting quick1 = new quickSorting();
        if(p < r){

            int index = quick1.Partition(arr, p, r);
            System.out.println(p+"值"+r+"指数"+index);
            quickSort(arr, p, index - 1);
            quickSort(arr,index + 1, r);
        }
        else{
            return;
        }
    }
    public int Partition(int arr[], int p, int r){
        int pivot = arr[(p + r) / 2];
        int smallIndex = p - 1;
        for(int unSortNum = p; unSortNum < r; unSortNum++){
            if(arr[unSortNum] <= pivot){
                smallIndex += 1;
                int temp = arr[smallIndex];
                arr[smallIndex] = arr[unSortNum];
                arr[unSortNum] = temp;
            }
        }
        //手动设置哪个位置的元素与pivot交换
        //不能用temp = pivot,达不到交换数组元素的结果
        int temp = arr[r];
        arr[r] = arr[smallIndex + 1];
        arr[smallIndex + 1] = temp;
        return smallIndex + 1;
    }
}

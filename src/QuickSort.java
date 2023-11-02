import java.util.Random;

public class QuickSort {
    private final Random rand = new Random();

    public void quickSort(int[] aList, int left, int right){
        if (left < right){
            int finalPivotPos = randomPartition(aList, left, right);
            quickSort(aList, left, finalPivotPos - 1);
            quickSort(aList, finalPivotPos + 1, right);
        }
    }

    public int[] sort(int[] aList){
        quickSort(aList, 0, aList.length - 1);
        return aList;
    }
    public int randomPartition(int[] aList, int left, int right){
        int random = pickRandom(left, right);
        int temp = aList[random];
        aList[random] = aList[right];
        aList[right] = temp;
        return partition(aList, left, right);
    }

    public int partition(int[] aList, int left, int right){
        int pivot = aList[right];
        int lastFilled = left - 1;
        for (int i = left; i < right; i++){
            if (aList[i] <= pivot){
                lastFilled++;
                // swapping
                int temp = aList[lastFilled];
                aList[lastFilled] = aList[i];
                aList[i] = temp;
            }
        }
        lastFilled++;
        int temp = aList[lastFilled];
        aList[lastFilled] = aList[right];
        aList[right] = temp;
        return lastFilled;
    }
    public int pickRandom(int min, int max){
        return this.rand.nextInt(max - min + 1) + min;
    }
}

public class Profile {
    public int[] profileAndReturnSortedUsingCBIS(int[] arr){
        CBIS cbis = new CBIS();
        long beforeTime = System.currentTimeMillis();
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        int[] resultCBIS = cbis.sort(arr);
        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long afterTime = System.currentTimeMillis();

        long deltaMemory = afterMemory - beforeMemory;
        long deltaTime = afterTime - beforeTime;

        System.out.println("Elapsed time: " + deltaTime + " ms");
        System.out.println("Used memory: " + deltaMemory + " bytes");

        return resultCBIS;
    }

    public int[] profileAndReturnSortedUsingQuickSort(int[] arr){
        QuickSort quickSort = new QuickSort();
        long beforeTime = System.currentTimeMillis();
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        int[] resultQuickSort = quickSort.sort(arr);
        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long afterTime = System.currentTimeMillis();

        long deltaMemory = afterMemory - beforeMemory;
        long deltaTime = afterTime - beforeTime;

        System.out.println("Elapsed time: " + deltaTime + " ms");
        System.out.println("Used memory: " + deltaMemory + " bytes");

        return resultQuickSort;
    }
}

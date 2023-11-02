import java.util.Arrays;
import java.util.Random;

public class ListGenerator {
    private final Random rand = new Random();
    private final int seed;
    private final ArrayToFile arrayToFile = new ArrayToFile("", "txt");

    public ListGenerator(int seed) {
        this.seed = seed;
        this.rand.setSeed(seed);
    }

    public int[] generateRandom(int n, int upperBound, boolean write) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = this.rand.nextInt(upperBound);
        }
        if (write) {
            String filename = "random_" + arr.length + "_seed" + seed;
            this.arrayToFile.writeToFile(arr, filename);
        }
        return arr;
    }

    public int[] generateSorted(int n, int upperBound, boolean write) {
        int[] arr = generateRandom(n, upperBound, false);
        Arrays.sort(arr);
        if (write) {
            String filename = "sorted_" + arr.length + "_seed" + seed;
            this.arrayToFile.writeToFile(arr, filename);
        }
        return arr;
    }

    public int[] generateReversed(int n, int upperBound, boolean write) {
        int[] arr = generateSorted(n, upperBound, false);
        int[] reversedArr = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            reversedArr[j - 1] = arr[i];
            j--;
        }
        if (write) {
            String filename = "reversed_" + reversedArr.length + "_seed" + seed;
            this.arrayToFile.writeToFile(reversedArr, filename);
        }
        return reversedArr;
    }
}

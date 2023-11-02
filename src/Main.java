public class Main {

    public static void main(String[] args) {
        Profile profile = new Profile();
        ArrayToFile arrayToFile = new ArrayToFile("", "txt");

        ListGenerator listGenerator = new ListGenerator(12);
        Detail detail = new Detail(profile, arrayToFile);

        System.out.println("Perbandingan Algoritma Sorting");
        System.out.println("Clustered Binary Insertion Sort vs Randomized Quicksort");
        System.out.println("Jaycent Gunawan Ongris - 2106750231 - DAA C");

        System.out.println("=======================================================");

        int[] sm_random = listGenerator.generateReversed(200, 50000000, true);
        int[] md_random = listGenerator.generateRandom(2000, 5000, true);
        int[] lg_random = listGenerator.generateRandom(20000, 50000, true);

        int[] sm_sorted = listGenerator.generateSorted(200, 500, true);
        int[] md_sorted = listGenerator.generateSorted(2000, 5000, true);
        int[] lg_sorted = listGenerator.generateSorted(20000, 50000, true);

        int[] sm_reversed = listGenerator.generateReversed(200, 500, true);
        int[] md_reversed = listGenerator.generateReversed(2000, 5000, true);
        int[] lg_reversed = listGenerator.generateReversed(20000, 50000, true);

        detail.showDetailCBIS(sm_random, "random", true);
        detail.showDetailCBIS(md_random, "random", true);
        detail.showDetailCBIS(lg_random, "random", true);

        detail.showDetailCBIS(sm_sorted, "sorted", true);
        detail.showDetailCBIS(md_sorted, "sorted", true);
        detail.showDetailCBIS(lg_sorted, "sorted", true);

        detail.showDetailCBIS(sm_reversed, "reversed", true);
        detail.showDetailCBIS(md_reversed, "reversed", true);
        detail.showDetailCBIS(lg_reversed, "reversed", true);

        detail.showDetailQuickSort(sm_random, "random", true);
        detail.showDetailQuickSort(md_random, "random", true);
        detail.showDetailQuickSort(lg_random, "random", true);

        detail.showDetailQuickSort(sm_sorted, "sorted", true);
        detail.showDetailQuickSort(md_sorted, "sorted", true);
        detail.showDetailQuickSort(lg_sorted, "sorted", true);

        detail.showDetailQuickSort(sm_reversed, "reversed", true);
        detail.showDetailQuickSort(md_reversed, "reversed", true);
        detail.showDetailQuickSort(lg_reversed, "reversed", true);
    }
}
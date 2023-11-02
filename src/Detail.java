public class Detail {
    Profile profile;
    ArrayToFile arrayToFile;

    public Detail(Profile profile, ArrayToFile arrayToFile){
        this.profile = profile;
        this.arrayToFile = arrayToFile;
    }
    public void showDetailCBIS(int[] arr, String type, boolean save){
        int n = arr.length;
        System.out.println("CBIS, n: " + n + ", type: " + type);
        int[] result = this.profile.profileAndReturnSortedUsingCBIS(arr);
        if (save) {
            String filename = "result_CBIS_" + n + "_" + type;
            this.arrayToFile.writeToFile(result, filename);
        }
        System.out.println();
    }

    public void showDetailQuickSort(int[] arr, String type, boolean save){
        int n = arr.length;
        System.out.println("Quicksort, n: " + n + ", type: " + type);
        int[] result = this.profile.profileAndReturnSortedUsingQuickSort(arr);
        if (save) {
            String filename = "result_quicksort_" + n + "_" + type;
            this.arrayToFile.writeToFile(result, filename);
        }
        System.out.println();
    }
}

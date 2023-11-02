public class CBIS {
    public int[] sort(int[] aList){
        int POP = 0;
        for (int i = 1; i < aList.length; i++) {
            int COP = i;
            int key = aList[COP];
            int place;
            if (key >= aList[POP]) {
                place = binaryLocFinder(aList, POP + 1, COP - 1, key);
            } else {
                place = binaryLocFinder(aList, 0, POP - 1, key);
            }
            POP = place;
            aList = placeInserter(aList, place, COP);
        }
        return aList;
    }

    public int binaryLocFinder(int[] aList,
                               int start, int end, int key){
        if (start == end) {
            if (aList[start] > key) {
                return start;
            } else {
                return start + 1;
            }
        }
        if (start > end) {
            return start;
        } else {
            int mid = (start + end) / 2;
            if (aList[mid] < key) {
                return binaryLocFinder(aList, mid + 1, end, key);
            } else if (aList[mid] > key) {
                return binaryLocFinder(aList, start, mid - 1, key);
            } else {
                return mid;
            }
        }
    }

    public int[] placeInserter(int[] aList,
                                       int start, int end){
        int temp = aList[end];
        for (int k = end; k > start; k--) {
            aList[k] = aList[k - 1];
        }
        aList[start] = temp;
        return aList;
    }
}

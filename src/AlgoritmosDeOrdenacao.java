public class AlgoritmosDeOrdenacao {
    private static int numSwapsInsertionSort;
    private static int numComparisonsInsertionSort;
    private static int numSwapsSelectionSort;
    private static int numComparisonsSelectionSort;
    private static int numSwapsBubbleSort;
    private static int numComparisonsBubbleSort;

    public static void insertionSort(int[] arr) {
        numSwapsInsertionSort = 0;
        numComparisonsInsertionSort = 0;

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                numSwapsInsertionSort++;
                numComparisonsInsertionSort++;
            }
            arr[j + 1] = key;
            numComparisonsInsertionSort++;
        }
    }

    public static int getNumSwapsInsertionSort() {
        return numSwapsInsertionSort;
    }

    public static int getNumComparisonsInsertionSort() {
        return numComparisonsInsertionSort;
    }

    public static void selectionSort(int[] arr) {
        numSwapsSelectionSort = 0;
        numComparisonsSelectionSort = 0;

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                numComparisonsSelectionSort++;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            numSwapsSelectionSort++;
        }
    }

    public static int getNumSwapsSelectionSort() {
        return numSwapsSelectionSort;
    }

    public static int getNumComparisonsSelectionSort() {
        return numComparisonsSelectionSort;
    }

    public static void bubbleSort(int[] arr) {
        numSwapsBubbleSort = 0;
        numComparisonsBubbleSort = 0;

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    numSwapsBubbleSort++;
                }
                numComparisonsBubbleSort++;
            }
        }
    }

    public static int getNumSwapsBubbleSort() {
        return numSwapsBubbleSort;
    }

    public static int getNumComparisonsBubbleSort() {
        return numComparisonsBubbleSort;
    }
}

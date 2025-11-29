


public class App {

    public static void main(String[] args) throws Exception {
        App.runBinarySearchExample();
    }


    private static void runBinarySearchExample() {
        search.BinarySearch binarySearch = new search.BinarySearch();

        int foundIndex = binarySearch.searchInList(2);
        System.out.println("Item found at index: " + foundIndex);

        // Suppose you have a sorted list of 128 names, and you’re searching 
        // through it using binary search. What’s the maximum number of 
        // steps it would take? = 7 steps (2^7 = 128)
    }

}



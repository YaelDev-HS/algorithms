package search;




public class BinarySearch {

    private int[] list = {};


    public int searchInList(int item){
        int low = 0;
        int high = list.length - 1;

        int mid = (low + high) / 2;
        Integer guess = list[mid];

        if(guess < item){
            low = mid + 1;
        }

        return 0;
    }

}

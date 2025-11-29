package search;




public class BinarySearch {

    // maximo 5 iteraciones
    private int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


    public int searchInList(int item){
        int low = 0;
        int high = list.length - 1;
        int iterationsCount = 0;

        while (low <= high) {
            iterationsCount ++;
            int mid = (low + high) / 2;
            int guess = list[mid];

            if(guess == item){
                System.out.println("Iterations count: " + iterationsCount);
                return mid;
            }else if(guess < item){     
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return -1;
    }


}

import org.junit.*;
public class Task2_Tests extends Assert {

    @Test
    public void bubbleSort_CreateMyBubbleSort_TryToSort (){
        BubbleSort<Integer> sorter = new BubbleSort<>();

        MyComparator comparator = new MyComparator() {
            @Override
            public int compare(Object first, Object second) {
                return 0;
            }
        };

        Integer[] myArray = {1,2,3};
        sorter.sort(myArray, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    class SomeComparator implements MyComparator<Integer>{
        @Override
        public int compare(Integer first, Integer second) {
            return first - second;
        }
    }

    @Test
    public void bubbleSort_CreateMyBubbleSort_TryToSortDifferentNumbers(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2, 1, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    @Test
    public void bubbleSort_CreateMyBubbleSort_TryToSortLongerArrayWithDifferentNumbers(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2, 1, 3, 5, 7};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 7}, myArray);
    }

    @Test
    public void bubbleSort_CreateMyBubbleSort_TryToCompareTheSameArrays(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2, 2, 2, 2};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{2, 2, 2, 2}, myArray);
    }

    @Test
    public void bubbleSort_CreateMyBubbleSort_TryToCompareSmallArrays(){
        BubbleSort<Integer> sorter = new BubbleSort<>();
        Integer[] myArray = {2};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{2}, myArray);
    }

    @Test
    public void insertionSort_CreateMyInsertionSort_TryToCompareTheSameArrays(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    @Test
    public void insertionSort_CreateMyInsertionSort_TryToCompareSmallArrays(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1}, myArray);
    }

    @Test
    public void insertionSort_CreateMyInsertionSort_TryToSortDifferentNumbers(){
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] myArray = {1, 5, 2, 6};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 5, 6}, myArray);
    }

    @Test
    public void selectionSort_CreateMySelectionSort_TryToCompareTheSameArrays(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 2, 3};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    @Test
    public void selectionSort_CreateMySelectionSort_TryToCompareSmallArrays(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1}, myArray);
    }

    @Test
    public void selectionSort_CreateMySelectionSort_TryToSortArray(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 3, 2};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3}, myArray);
    }

    @Test
    public void selectionSort_CreateMySelectionSort_TryToSortLargeArray(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 3, 2, 10, 5, 7, 4};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 7, 10}, myArray);
    }

    @Test
    public void selectionSort_CreateMySelectionSort_TryToCompareLargeArrays(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {1, 2, 3, 4, 5, 7, 10};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 7, 10}, myArray);
    }

    @Test
    public void selectionSort_CreateMySelectionSort_TryToSortTwoItemsArray(){
        SelectionSort<Integer> sorter = new SelectionSort<>();
        Integer[] myArray = {3, 1};
        sorter.sort(myArray, new SomeComparator());
        assertArrayEquals(new Integer[]{1, 3}, myArray);
    }
    
}
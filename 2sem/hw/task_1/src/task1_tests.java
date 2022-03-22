//package task_1_tests;
import org.junit.*;

public class task1_tests extends Assert{

    @Test
    public void createDoubleLinkedList_CreateEmptyDoubleLinkedList_EmptyTrue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void createDoubleLinkedList_CreateEmptyDoubleLinkedList_EmptyFalse(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void getSize_getSizeFromEmptyDoubleLinkedList_sizeCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }

    @Test
    public void pushFront_PushFrontDoubleLinkedList_sizeCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertTrue(1 == list.getSize());
    }
}

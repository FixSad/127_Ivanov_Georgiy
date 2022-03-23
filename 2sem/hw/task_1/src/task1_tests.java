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

    @Test
    public void pushFront_PushFrontEmptyDoubleLinkedList_TryToGetAnotherNumber(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e){
            assertFalse(false);
        }
    }

    @Test
    public  void getHead_PushFrontEmptyDoubleLinkedList_TryToGetHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }

    @Test
    public void getHead_PushBackEmptyDoubleLinkedList_TryToGetHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }

    @Test
    public void getTail_PushFrontEmptyDoubleLinkedList_TryToGetTail(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(2, tail);
    }

    @Test
    public void getTail_PushBackEmptyDoubleLinkedList_TryToGetTail(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(1, tail);
    }

    @Test
    public void get_PushFrontEmptyDoubleLinkedList_CheckFirst(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num);
    }

    @Test
    public void get_PushBackEmptyDoubleLinkedList_CheckFirst(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);

        int num = ((Node<Integer>)list.get(2)).getData();
        assertEquals(1, num);
    }

    @Test
    public void remove_PushFrontEmptyDoubleLinkedList_RemoveElementCheckSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }

    @Test
    public void insertListAfter_CreateTwoListsAndUnite_CheckSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list.insertListAfter(list.get(0), list2);
        assertEquals(6, list.getSize());
    }

    @Test
    public void insertListAfter_CreateTwoListsAndUnite_CheckHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        list1.insertListAfter(list.get(0), list1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }

    @Test
    public void insertListAfter_CreateTwoListsAndUnite_CheckTail(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(5);
        list.pushFront(6);

        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(2);
        list1.pushFront(3);
        list1.pushFront(4);
        list.insertListAfter(list.get(0), list1);

        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>)list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>)list.get(5)).getData();
        assertEquals(5, num1);
    }










    @Test
    public void createArray_SetSizeNewArray_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        assertEquals(5, array.getSize());
    }

    @Test
    public void createArray_CreateEmptyArray_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>();
        assertEquals(1024, array.getSize());
    }

    @Test
    public void resize_CreateArrayAndResizeIt_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.resize(10);
        assertEquals(10, array.getSize());
    }

    @Test
    public void get_TryToGetIndexOutOfBounds_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(7);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void get_TryToGetIndexOutOfBorder_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(5);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void set_TryToSetIndexOutOfBounds_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void set_TryToSetIndexOutOfBorder_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }

    @Test
    public void insert_TryToInsertValueOutOfBounds_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
}

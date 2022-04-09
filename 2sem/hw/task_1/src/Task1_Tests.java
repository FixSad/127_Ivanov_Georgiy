import org.junit.*;
public class Task1_Tests extends Assert{

    private int getIntValue(ListNode<Integer> item) {

        return ((Node<Integer>) item).getData();
    }

    @Test
    public void createDoubleLinkedList_CreateEmptyDoubleLinkedList_EmptyFalse() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertFalse(list.isEmpty());
    }
    @Test
    public void pushFront_PushFrontEmptyDoubleLinkedList_TryToGetAnotherNumber() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertTrue(true);
        }

    }
    @Test
    public void pushElements_ThreeElements_FirstElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(1, getIntValue(list.get(0)));
    }
    @Test
    public void pushFront_PushFrontValuesDoubleLinkedList_CheckValues() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(2, getIntValue(list.get(1)));
    }
    @Test
    public void pushElements_ThreeElements_ThirdElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(3, getIntValue(list.get(2)));
    }
    @Test
    public void getHead_PushFrontEmptyDoubleLinkedList_TryToGetHead() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(1, getIntValue(list.getHead()));
    }
    @Test
    public void pushElements_ThreeElements_TailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        assertEquals(3, getIntValue(list.getTail()));
    }
    @Test
    public void pushElements_BackThreeElements_FirstElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);
        assertEquals(1, getIntValue(list.get(0)));
    }
    @Test
    public void pushElements_BackThreeElements_SecondElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);
        assertEquals(2, getIntValue(list.get(1)));
    }
    @Test
    public void pushElements_BackThreeElements_ThirdElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);
        assertEquals(3, getIntValue(list.get(2)));
    }
    @Test
    public void deleteElement_FirstElement_FirstElementIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, getIntValue(list.get(0)));
    }
    @Test
    public void deleteElements_FirstElement_HeadIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, getIntValue(list.getHead()));
    }
    @Test
    public void deleteElement_FirstElement_TailIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(3, getIntValue(list.getTail()));
    }
    @Test
    public void deleteElement_FirstElement_SizeIsCorrect() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }
    @Test
    public void pasteList_afterFirstElement_SizeIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }
    @Test
    public void pasteList_afterFirstElement_HeadIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(1, getIntValue(list1.getHead()));
    }
    @Test
    public void pasteList_afterFirstElement_TailIsCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(0), list2);
        assertEquals(3, getIntValue(list1.getTail()));
    }
    @Test
    public void pasteList_afterFirstElement_ElementsAreCorrect() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListAfter(list1.get(0), list2);

        assertEquals(1, getIntValue(list1.get(0)));
        assertEquals(4, getIntValue(list1.get(1)));
        assertEquals(5, getIntValue(list1.get(2)));
        assertEquals(6, getIntValue(list1.get(3)));
        assertEquals(2, getIntValue(list1.get(4)));
        assertEquals(3, getIntValue(list1.get(5)));
    }
    @Test
    public void pasteList_afterSecondElement_ElementsAreTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListAfter(list1.get(1), list2);

        assertEquals(1, getIntValue(list1.get(0)));
        assertEquals(2, getIntValue(list1.get(1)));
        assertEquals(4, getIntValue(list1.get(2)));
        assertEquals(5, getIntValue(list1.get(3)));
        assertEquals(6, getIntValue(list1.get(4)));
        assertEquals(3, getIntValue(list1.get(5)));
    }
    @Test
    public void pasteList_afterThirdElement_ElementsAreTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListAfter(list1.get(2), list2);

        assertEquals(1, getIntValue(list1.get(0)));
        assertEquals(2, getIntValue(list1.get(1)));
        assertEquals(3, getIntValue(list1.get(2)));
        assertEquals(4, getIntValue(list1.get(3)));
        assertEquals(5, getIntValue(list1.get(4)));
        assertEquals(6, getIntValue(list1.get(5)));
    }
    @Test
    public void pasteList_afterThirdElement_HeadIsTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(2), list2);
        assertEquals(1, getIntValue(list1.getHead()));
    }
    @Test
    public void pasteList_afterThirdElement_TailIsTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListAfter(list1.get(2), list2);
        assertEquals(6, getIntValue(list1.getTail()));
    }
    @Test
    public void pasteList_beforeFirstElement_SizeIsTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListBefore(list1.get(0), list2);
        assertEquals(6, list1.getSize());
    }
    @Test
    public void pasteList_beforeFirstElement_HeadIsTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListBefore(list1.get(0), list2);
        assertEquals(4, getIntValue(list1.getHead()));
    }
    @Test
    public void pasteList_beforeFirstElement_TailIsTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListBefore(list1.get(0), list2);
        assertEquals(3, getIntValue(list1.getTail()));
    }
    @Test
    public void pasteList_beforeFirstElement_ElementsAreTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListBefore(list1.get(0), list2);

        assertEquals(4, getIntValue(list1.get(0)));
        assertEquals(5, getIntValue(list1.get(1)));
        assertEquals(6, getIntValue(list1.get(2)));
        assertEquals(1, getIntValue(list1.get(3)));
        assertEquals(2, getIntValue(list1.get(4)));
        assertEquals(3, getIntValue(list1.get(5)));
    }
    @Test
    public void pasteList_beforeSecondElement_ElementsAreTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListBefore(list1.get(1), list2);

        assertEquals(1, getIntValue(list1.get(0)));
        assertEquals(4, getIntValue(list1.get(1)));
        assertEquals(5, getIntValue(list1.get(2)));
        assertEquals(6, getIntValue(list1.get(3)));
        assertEquals(2, getIntValue(list1.get(4)));
        assertEquals(3, getIntValue(list1.get(5)));
    }
    @Test
    public void pasteList_beforeThirdElement_ElementsAreTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListBefore(list1.get(2), list2);

        assertEquals(1, getIntValue(list1.get(0)));
        assertEquals(2, getIntValue(list1.get(1)));
        assertEquals(4, getIntValue(list1.get(2)));
        assertEquals(5, getIntValue(list1.get(3)));
        assertEquals(6, getIntValue(list1.get(4)));
        assertEquals(3, getIntValue(list1.get(5)));
    }
    @Test
    public void pasteList_beforeThirdElement_HeadIsTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListBefore(list1.get(2), list2);
        assertEquals(1, getIntValue(list1.getHead()));
    }
    @Test
    public void pasteList_beforeThirdElement_TailIsTrue() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list1.insertListBefore(list1.get(2), list2);
        assertEquals(3, getIntValue(list1.getTail()));
    }
    @Test
    public void generateArray_withoutSize_EqualsDefault() {
        DynamicArray<Integer> array = new DynamicArray<>();

        assertEquals(1024, array.getSize());
    }
    @Test
    public void generateArray_withSize_SizeIsTrue() {
        DynamicArray<Integer> array = new DynamicArray<>(10);

        assertEquals(10, array.getSize());
    }
    @Test
    public void generateArray_receivingValueOutOfRange_IndexOutOfRange() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.get(10);
            fail();
        }
        catch (IndexOutOfBoundsException e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }
    @Test
    public void generateArray_SettingValueOutOfRange_ReceivingIndexOutOfRange() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.set(10, 1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }
    @Test
    public void establishValues_EstablishThreeValues_ValuesAreTrue() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
    }
    @Test
    public void changeSize_ChanceSizeArray_SizeIsTrue() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(10);

            array.resize(20);
            assertEquals(20, array.getSize());

            array.resize(10);
            assertEquals(10, array.getSize());
        } catch (Exception e) {
            fail();
        }
    }
    @Test
    public void paste_PasteMeaningOutOfRange_ReceivingIndexOutOfRange() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        try {
            array.insert(10, 1);
            fail();
        } catch (IndexOutOfBoundsException e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }
    @Test
    public void paste_PasteMeaning_MeaningAreTrue() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(10);
            array.set(0, 1);
            array.set(1, 2);
            array.set(2, 3);
            array.insert(1, 5);

            assertEquals(1, array.get(0).intValue());
            assertEquals(5, array.get(1).intValue());
            assertEquals(2, array.get(2).intValue());
            assertEquals(3, array.get(3).intValue());
        }
        catch (Exception e){
            fail();
        }
    }
    @Test
    public void pushBack_Meaning_MeaningsAreTrue() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.pushBack(5);

        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(5, array.get(10).intValue());
    }
    @Test
    public void leanBack_fromEmptyArray_ReceivingUnsupportedTransactionsExclusion() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(0);
            array.popBack();
            fail();
        } catch (Exception e) {
            assertEquals("Array is empty", e.getMessage());
        }
    }
    @Test
    public void leanBack_ReceivingleanedBackValue_ReceivingExclusion() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(3);
            array.set(0, 1);
            array.set(1, 2);
            array.set(2, 3);
            array.popBack();
            array.get(2);
            fail();
        } catch (Exception e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }
    @Test
    public void delete_IndexOutOfRound_ReceivingIndexOutOfRoundExclusion() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>(3);
            array.set(0, 1);
            array.set(1, 2);
            array.set(2, 3);
            array.remove(3);
            fail();
        } catch (Exception e) {
            assertEquals("Index out of bounds", e.getMessage());
        }
    }
    @Test
    public void delete_OneMeaning_MeaningsAreTrue() {
        DynamicArray<Integer> array = new DynamicArray<>(10);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.remove(1);

        assertEquals(1, array.get(0).intValue());
        assertEquals(3, array.get(1).intValue());

    }
}
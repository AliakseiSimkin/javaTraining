import java.util.*;

public class task2_methodComparison {

    public static void main(String[] args) {
        //ArrayList VS LinkedList
        compareAddElementToEnd_ArrayListVsLinkedList();
        compareAddElementToBegin_ArrayListVsLinkedList();
        compareAddElementToMiddle_ArrayListVsLinkedList();
        compare_FindElementInTheMiddle();
        compare_DeleteElementEndArrayListVsLinkedList();

        //HashSet VS TreeSet
        compareAddElementEndHashSetVsTreeSet();
        compareFindElementMiddleHashSetVsTreeSet();
        compareDeleteElementMiddleHashSetVsTreeSet();

        //HashMapr VS TreeMap
        compareAddElementEndHashMapVsTreeMap();
        compareFindElementMiddleHashMapVsTreeMap();
        compareRemoveElementMiddleHashMapVsTreeMap();
    }



    public static void compareAddElementToEnd_ArrayListVsLinkedList () {
        System.out.println();
        ArrayList<Integer> aList = new ArrayList<Integer>();
        LinkedList<Integer> lList = new LinkedList<Integer>();
        System.out.println("Add elemets in end into ArrayList and LinkedList (size is 2kk): ");
        Date startArrayListAddEnd = new Date();
        for( int i = 0; i < 2000000; i++ ) {
            int x = (int) Math.random();
            aList.add(x);
        }
        Date endArrayListAddEnd = new Date();
        long arrayListAddEndTime = endArrayListAddEnd.getTime() - startArrayListAddEnd.getTime();
        System.out.println("ArrayList: " + arrayListAddEndTime + "ms");

        Date startLinkedListAddEnd = new Date();
        for( int i = 0; i < 2000000; i++ ) {
            int x = (int) Math.random();
            aList.add(x);
        }
        Date endLinkedListAddEnd = new Date();
        long linkedListAddEndTime = endLinkedListAddEnd.getTime() - startLinkedListAddEnd.getTime();
        System.out.println("LinkedList: " + linkedListAddEndTime + "ms");

        if (arrayListAddEndTime < linkedListAddEndTime) {
            System.out.println("ArrayList is faster");
        } else {
            System.out.println("LinkedList is faster");
        }
        System.out.println("\n=============================================\n");
    }

    public static void compareAddElementToBegin_ArrayListVsLinkedList () {
        ArrayList<Integer> a2List = new ArrayList<Integer>();
        LinkedList<Integer> l2List = new LinkedList<Integer>();
        System.out.println("Add elemets in begin (100k): ");
        Date startArrayListAddBegin = new Date();
        for( int i = 0; i < 100000; i++ ) {
            int x = (int) Math.random();
            a2List.add(0, x);
        }
        Date endArrayListAddBegin = new Date();
        long arrayListAddBeginTime = endArrayListAddBegin.getTime() - startArrayListAddBegin.getTime();
        System.out.println("ArrayList: " + arrayListAddBeginTime + "ms");

        Date startLinkedListAddBegin = new Date();
        for( int i = 0; i < 100000; i++ ) {
            int x = (int) Math.random();
            l2List.add(0, x);
        }
        Date endLinkedListAddBegin = new Date();
        long linkedListAddBeginTime = endLinkedListAddBegin.getTime() - startLinkedListAddBegin.getTime();
        System.out.println("LinkedList: " + linkedListAddBeginTime + "ms");

        if (arrayListAddBeginTime < linkedListAddBeginTime) {
            System.out.println("ArrayList is faster");
        } else {
            System.out.println("LinkedList is faster");
        }
        System.out.println("\n=============================================\n");
    }

    public static void compareAddElementToMiddle_ArrayListVsLinkedList () {
        ArrayList<Integer> a3List = new ArrayList<Integer>();
        LinkedList<Integer> l3List = new LinkedList<Integer>();
        System.out.println("Add elemets in middle (2kk): ");
        Date startArrayListAddMiddle = new Date();
        for( int i = 0; i < 2000000; i++ ) {
            int x = (int) Math.random();
            if (i % 2 == 0) {
                a3List.add(i, x);
            } else {
                a3List.add(i - 1, x);
            }
        }

        Date endArrayListAddMiddle = new Date();
        long arrayListAddMiddleTime = endArrayListAddMiddle.getTime() - startArrayListAddMiddle.getTime();
        System.out.println("ArrayList: " + arrayListAddMiddleTime + "ms");

        Date startLinkedListAddMiddle = new Date();
        for( int i = 0; i < 2000000; i++ ) {
            int x = (int) Math.random();
            if (i % 2 == 0) {
                l3List.add(i, x);
            } else {
                l3List.add(i - 1, x);
            }
        }

        Date endLinkedListAddMiddle = new Date();
        long linkedListAddMiddleTime = endLinkedListAddMiddle.getTime() - startLinkedListAddMiddle.getTime();
        System.out.println("LinkedList: " + linkedListAddMiddleTime + "ms");

        if (arrayListAddMiddleTime < linkedListAddMiddleTime) {
            System.out.println("ArrayList is faster");
        } else {
            System.out.println("LinkedList is faster");
        }
        System.out.println("\n=============================================\n");
    }

    private static void compare_FindElementInTheMiddle() {
        ArrayList<Integer> a4List = new ArrayList<Integer>();
        LinkedList<Integer> l4List = new LinkedList<Integer>();
        for( int i = 0; i < 20000; i++ ) {
            int x = (int) Math.random();
            a4List.add(x);
        }
        for( int i = 0; i < 20000; i++ ) {
            int x = (int) Math.random();
            l4List.add(x);
        }

        System.out.println("Get element from middle with 20k ArrayList and LinkedList: ");
        Date startFindElementMiddleArrayListTime = new Date();
        for (int i = 0; i < a4List.size(); i++) {
            a4List.get(i/2);
        }
        Date endFindElementMiddleArrayListTime = new Date();
        long findElementMiddleArrayListTime = endFindElementMiddleArrayListTime.getTime() - startFindElementMiddleArrayListTime.getTime();
        System.out.println("ArrayList: " + findElementMiddleArrayListTime);

        Date startFindElementMiddleLinkedListTime = new Date();
        for (int i = 0; i < l4List.size(); i++) {
            l4List.get(i/2);
        }
        Date endFindElementMiddleLinkedListTime = new Date();
        long findElementMiddleLinkedListTime = endFindElementMiddleLinkedListTime.getTime() - startFindElementMiddleLinkedListTime.getTime();
        System.out.println("LinkedList: " + findElementMiddleLinkedListTime);

        if (findElementMiddleArrayListTime < findElementMiddleLinkedListTime) {
            System.out.println("ArrayList is faster");
        } else {
            System.out.println("LinkedList is faster");
        }
        System.out.println("\n=============================================\n");
    }

    private static void compare_DeleteElementEndArrayListVsLinkedList() {
        ArrayList<Integer> a5List = new ArrayList<Integer>();
        LinkedList<Integer> l5List = new LinkedList<Integer>();
        for( int i = 0; i < 1000000; i++ ) {
            int x = (int) Math.random();
            a5List.add(x);
        }
        for( int i = 0; i < 1000000; i++ ) {
            int x = (int) Math.random();
            l5List.add(x);
        }
        System.out.println("Delete element from end with 1kk ArrayList and LinkedList: ");
        Date startDeleteElementEndArrayListTime = new Date();
        for (int i = a5List.size()-1; i >= 0; i--) {
            a5List.remove(i);
        }
        Date endDeleteElementEndArrayListTime = new Date();
        long deleteElementEndArrayListTime = endDeleteElementEndArrayListTime.getTime() - startDeleteElementEndArrayListTime.getTime();
        System.out.println("ArrayList: " + deleteElementEndArrayListTime);

        Date startDeleteElementEndLinkedListTime = new Date();
        for (int i = l5List.size()-1; i >= 0; i--) {
            l5List.remove(i);
        }
        Date endDeleteElementEndLinkedListTime = new Date();
        long deleteElementEndLinkedListTime = endDeleteElementEndLinkedListTime.getTime() - startDeleteElementEndLinkedListTime.getTime();
        System.out.println("LinkedList: " + deleteElementEndLinkedListTime );

        if (deleteElementEndArrayListTime < deleteElementEndLinkedListTime ) {
            System.out.println("ArrayList is faster");
        } else {
            System.out.println("LinkedList is faster");
        }
        System.out.println("\n=============================================\n");
    }

    public static void compareAddElementEndHashSetVsTreeSet() {
        HashSet<Integer> hSet = new HashSet<Integer>();
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        System.out.println("Add element to end with 100k HashSet and TreeSet: ");
        Date startAddElementEndHashSet = new Date();
        for (int i = 0; i < 100000; i++) {
            int x = (int) Math.random();
            hSet.add(x);
        }
        Date endAddElementEndHashSet = new Date();
        long addElementEndHashSetTime = endAddElementEndHashSet.getTime() - startAddElementEndHashSet.getTime();
        System.out.println("HashSet: " + addElementEndHashSetTime + " ms");

        Date startAddElementEndTreeSet = new Date();
        for (int i = 0; i < 100000; i++) {
            int x = (int) Math.random();
            tSet.add(x);
        }
        Date endAddElementEndTreeSet = new Date();
        long addElementEndTreeSetTime = endAddElementEndTreeSet.getTime() - startAddElementEndTreeSet.getTime();
        System.out.println("TreeSet: " + addElementEndTreeSetTime + " ms");

        if (addElementEndHashSetTime < addElementEndTreeSetTime) {
            System.out.println("HashSet is faster");
        } else {
            System.out.println("TreeSet is faster");
        }
        System.out.println("\n=============================================\n");
    }

    public static void compareFindElementMiddleHashSetVsTreeSet() {
        HashSet<Integer> hSet = new HashSet<Integer>();
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        System.out.println("Find element (value is 50000) in middle with 100k HashSet and TreeSet collections: ");
        for (int i = 0; i < 100000; i++) {
            hSet.add(i);
        }
        for (int i = 0; i < 100000; i++) {
            tSet.add(i);
        }

        Date startFindElementHashSet = new Date();
        for (int i = 0; i < hSet.size(); i++){
            hSet.contains(50000);
        }
        Date endFindElementHashSet = new Date();
        long findElementHashSetTime = endFindElementHashSet.getTime() - startFindElementHashSet.getTime();
        System.out.println("HashSet: " + findElementHashSetTime + " ms");

        Date startFindElementTreeSet = new Date();
        for (int i = 0; i < tSet.size(); i++) {
            tSet.contains(50000);
        }
        Date endFindElementTreeSet = new Date();
        long findElementTreeSetTime = endFindElementTreeSet.getTime() - startFindElementTreeSet.getTime();
        System.out.println("TreeSet: " + findElementTreeSetTime + " ms");

        if (findElementHashSetTime < findElementTreeSetTime) {
            System.out.println("HashSet is faster");
        } else {
            System.out.println("TreeSet is faster");
        }
        System.out.println("\n=============================================\n");
    }

    public static void compareDeleteElementMiddleHashSetVsTreeSet() {
        HashSet<Integer> hSet = new HashSet<Integer>();
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        System.out.println("Delete element from middle (value is 50000) with 100k HashSet and TreeSet collections: ");
        for (int i = 0; i < 100000; i++) {
            hSet.add(i);
        }
        for (int i = 0; i < 100000; i++) {
            tSet.add(i);
        }

        Date startDeleteElementHashSet = new Date();
        for (int i = 0; i < hSet.size(); i++){
            hSet.remove(50000);
        }
        Date endDeleteElementHashSet = new Date();
        long deleteElementHashSetTime = endDeleteElementHashSet.getTime() - startDeleteElementHashSet.getTime();
        System.out.println("HashSet: " + deleteElementHashSetTime + " ms");

        Date startDeleteElementTreeSet = new Date();
        for (int i = 0; i < tSet.size(); i++) {
            tSet.remove(50000);
        }
        Date endDeleteElementTreeSet = new Date();
        long deleteElementTreeSetTime = endDeleteElementTreeSet.getTime() - startDeleteElementTreeSet.getTime();
        System.out.println("TreeSet: " + deleteElementTreeSetTime + " ms");

        if (deleteElementHashSetTime < deleteElementTreeSetTime) {
            System.out.println("HashSet is faster");
        } else {
            System.out.println("TreeSet is faster");
        }
        System.out.println("\n=============================================\n");
    }

    private static void compareAddElementEndHashMapVsTreeMap() {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        TreeMap<Integer, Integer> tMap = new TreeMap<Integer, Integer>();

        System.out.println("Add elements in end into HashMap and TreeMap collections (1kk): ");
        Date startHashMapAddEnd = new Date();
        for( int i = 0; i < 1000000; i++ ) {
            hMap.put(i, i);
        }
        Date endHashMapAddEnd = new Date();
        long hashMapAddEndTime = endHashMapAddEnd.getTime() - startHashMapAddEnd.getTime();
        System.out.println("HashMap: " + hashMapAddEndTime + "ms");

        Date startTreeMapAddEnd = new Date();
        for( int i = 0; i < 1000000; i++ ) {
            tMap.put(i, i);
        }
        Date endTreeMapAddEnd = new Date();
        long treeMapAddEndTime = endTreeMapAddEnd.getTime() - startTreeMapAddEnd.getTime();
        System.out.println("TreeMap: " + treeMapAddEndTime + "ms");

        if (hashMapAddEndTime < treeMapAddEndTime) {
            System.out.println("HashMap is faster");
        } else {
            System.out.println("TreeMap is faster");
        }
        System.out.println("\n=============================================\n");
    }

    private static void compareFindElementMiddleHashMapVsTreeMap() {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        TreeMap<Integer, Integer> tMap = new TreeMap<Integer, Integer>();

        System.out.println("Find element in middle of HashMap and TreeMap collections (1kk): ");
        for( int i = 0; i < 1000000; i++ ) {
            hMap.put(i, i);
        }

        for( int i = 0; i < 1000000; i++ ) {
            tMap.put(i, i);
        }

        Date startHashMapFindMiddle = new Date();
        for( int i = 0; i < 1000000; i++ ) {
            hMap.containsKey(50000);
        }
        Date endHashMapFindMiddle = new Date();
        long hashMapFindMiddleTime = endHashMapFindMiddle.getTime() - startHashMapFindMiddle.getTime();
        System.out.println("HashMap: " + hashMapFindMiddleTime + "ms");

        Date startTreeMapFindMiddle = new Date();
        for( int i = 0; i < 1000000; i++ ) {
            tMap.containsKey(50000);
        }
        Date endTreeMapFindMiddle = new Date();
        long treeMapFindMiddleTime = endTreeMapFindMiddle.getTime() - startTreeMapFindMiddle.getTime();
        System.out.println("TreeMap: " + treeMapFindMiddleTime + "ms");



        if (hashMapFindMiddleTime < treeMapFindMiddleTime) {
            System.out.println("HashMap is faster");
        } else {
            System.out.println("TreeMap is faster");
        }
        System.out.println("\n=============================================\n");
    }

    private static void compareRemoveElementMiddleHashMapVsTreeMap() {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        TreeMap<Integer, Integer> tMap = new TreeMap<Integer, Integer>();

        System.out.println("Remove element from middle of HashMap and TreeMap collections (1kk): ");
        for( int i = 0; i < 1000000; i++ ) {
            hMap.put(i, i);
        }

        for( int i = 0; i < 1000000; i++ ) {
            tMap.put(i, i);
        }

        Date startHashMapRemoveMiddle = new Date();
        for( int i = 0; i < 1000000; i++ ) {
            hMap.remove(50000);
        }
        Date endHashMapRemoveMiddle = new Date();
        long hashMapRemoveMiddleTime = endHashMapRemoveMiddle.getTime() - startHashMapRemoveMiddle.getTime();
        System.out.println("HashMap: " + hashMapRemoveMiddleTime + "ms");

        Date startTreeMapRemoveMiddle = new Date();
        for( int i = 0; i < 1000000; i++ ) {
            tMap.remove(50000);
        }
        Date endTreeMapRemoveMiddle = new Date();
        long treeMapRemoveMiddleTime = endTreeMapRemoveMiddle.getTime() - startTreeMapRemoveMiddle.getTime();
        System.out.println("TreeMap: " + treeMapRemoveMiddleTime + "ms");



        if (hashMapRemoveMiddleTime < treeMapRemoveMiddleTime) {
            System.out.println("HashMap is faster");
        } else {
            System.out.println("TreeMap is faster");
        }
        System.out.println("\n=============================================\n");
    }



}

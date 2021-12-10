import java.util.ArrayList;

public class OrderedArrayList {
    private ArrayList<Integer> _list;

    public OrderedArrayList(){
        _list = new ArrayList<Integer>();
    }

    //Same toString as ArrayList
    public String toString(){
        return _list.toString();
    }

    //add element to OrderedArrayList
    //Iterates through array. If inserted value < than any value already in array, 
    //move everything to the right and place value at index. Otherwise, place value at end.
    public boolean add(Integer newVal){
        for (int i = 0; i < _list.size(); i ++){
            if (newVal.compareTo(_list.get(i)) < 0){
                _list.add(i, newVal);
                return true;
            }
        }
        _list.add(newVal);
        return true;
    }

    // Remove element from OrderedArrayList
    // Calls remove method from ArrayList class as it already maintains invariant.
    public Integer remove(int index){
        Integer temp = _list.get(index);
        _list.remove(index);
        return temp;
    }

    // Size of OrderedArrayList
    // return size of ArrayList as both will be the same size
    public int size(){
        return _list.size();
    }

    public static void main(String[] args){
        OrderedArrayList mark = new OrderedArrayList();
        System.out.println("Printing empty OrderedArrayList mark...");
        System.out.println(mark);
        //populate OrderedArrayList backwards to test if invariance is held.
        for (int i = 23; i > 0; i --){
            mark.add(i);
        }
        System.out.println("Printing populated OrderedArrayList mark...");
        System.out.println(mark);
    }
}
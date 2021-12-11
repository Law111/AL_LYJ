import java.util.ArrayList;

public class OrderedArrayList {
    private ArrayList<Integer> _list;

    public OrderedArrayList(){
        _list = new ArrayList<Integer>();
    }

    //call ArrayList toString()
    public String toString(){
        return _list.toString();
    }

    //get element at index
    //returns element at index of ArrayList
    public Integer get(int index){
        return _list.get(index);
    }

    //add element to OrderedArrayList
    /**
    Iterates through array. If new value is less than any value already in array, 
    move everything from original value to the right and place new value at index. 
    Otherwise, place value at end.
    **/

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
    // Calls remove method from ArrayList class as it already maintains invariance.
    public Integer remove(int index){
        return _list.remove(index);
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
        //populate OrderedArrayList with random ints to test if invariance is held.
        for (int i = 0; i < 10; i ++){
            mark.add((int) (Math.random() * 10));
        }
        System.out.println("Printing populated OrderedArrayList mark...");
        System.out.println(mark);

        System.out.println("Printing removed element...");
        System.out.println(mark.remove(8));
        System.out.println("Printing OrderedArrayList mark after removal...");
        System.out.println(mark);

    }
}

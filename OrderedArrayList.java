import java.util.ArrayList;

//Creates ArrayList with Integer type and referenced by _list
public class OrderedArrayList {
    private ArrayList<Integer> _list;

    public OrderedArrayList(){
        _list = new ArrayList<Integer>();
    }

    //call ArrayList toString()
    //actually prints out array & not bunch of hashcodes

    public String toString(){
        return _list.toString();
    }

    //get element at index
    //returns element at index of ArrayList
    public Integer get(int index){
        return _list.get(index);
    }

    //add element to OrderedArrayList using linear search
    //iterating through each individual element and using compareTo to check 
    public boolean addLinear(Integer newVal){
        for (int i = 0; i < _list.size(); i ++){
            if (newVal.compareTo(_list.get(i)) < 0){
                _list.add(i, newVal);
                return true;
            }
        }
        _list.add(newVal);
        return true;
    }

    //add element to OrderedArrayList using binary search
    //Binary search work by checking value against the median value which is constantly updated by taking average of high and low index
    public boolean addBinary(Integer newVal){
        int low = 0;
        int med = 0;
        int high = _list.size() - 1;

        while (low <= high){
            med = (low + high) / 2;
            int bounds = newVal.compareTo(_list.get(med));
            if (bounds == 0) {
                _list.add(med, newVal);
                return true;
            } else if (bounds < 0){
                high = med - 1;
            } else {
                low = med + 1;
            }
        }
        _list.add(low, newVal);
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
        //Test linear search population.
        for (int i = 0; i < 10; i ++){
            mark.addLinear((int) (Math.random() * 10));
        }
        System.out.println("Printing populated OrderedArrayList mark...");
        System.out.println(mark);

        mark = new OrderedArrayList();
        //Test binary search population.
        for (int i = 0; i < 10; i ++){
            mark.addBinary((int) (Math.random() * 10));
        }        
        System.out.println("Printing populated OrderedArrayList mark...");
        System.out.println(mark);
    }
}

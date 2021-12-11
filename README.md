# <p align="center"> LYJ: Lawrence Joa, Yat Long Chan, Joshua Gao </p>

## ALTester
Iterates through an ArrayList, if any of its elements are larger than the element after it, the ArrayList is not sorted and will return false. If the iteration finishes without returning false, this means the ArrayList is sorted and the method will return true.

## OrderedArrayList

* **Integer get(int index)**\
Returns element at specified index by calling get() method from ArrayList class/

* **boolean add(Integer newVal)**\
Uses linear search. If new value is less than any value already in array, move everything from original value to the right and place new value at index. Otherwise, place new value at end.

* **Integer remove(int index)**\
Remove element at index by calling remove() from the ArrayList class as invariance is already maintained. Returns removed value.

* **int size()**\
Returns size of the OrderedArrayList by calling size() method from ArrayList class.


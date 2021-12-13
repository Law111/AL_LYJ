# <p align="center"> LYJ: Lawrence Joa, Yat Long Chan, Joshua Gao </p>

## ALTester
Iterates through an ArrayList, if any of its elements are larger than the element after it, the ArrayList is not sorted and will return false. If the iteration finishes without returning false, this means the ArrayList is sorted and the method will return true.

## OrderedArrayList

* **Integer get(int index)**
  * Returns element at specified index by calling get() method from ArrayList class.

* **boolean addLinear(Integer newVal)**
  * Uses linear search. 
  * Iterate through the array. If the new value is less than the specified elemenent already in array, move everything from original value to the right. Keep going through the array until it is greater than an element and place new value at that index.
  *  Otherwise, place new value at end since it is an absolute maximum and does not fall within the open interval domain. 

* **boolean addBinary(Integer newVal)**
  * Uses binary search. 
  * Check if newVal is equal to value at median of the list. 
  * If yes, add newVal at median index. 
  * If newVal is less than median value, confine search to only the lower half of the list. 
  * If newVal is greater, confine to only upper half. 
  * Repeat until median value is equal to newVal or until the lower index value is greater than upper index. 
  * If the latter is the case, add newVal at lower index. 
  * Binary searching is continuously halfing the # of necessary test-cases and is therefore much more efficient than linear search. However, that means we have to constant re-instantiate the value of our median. 
  * Our index values remain the same as the OG even when we bound our newValue in the lower or upper half. For example, an element at index 5 of a 7-element array will still have index 5 in a 3-element upper bound array.

* **Integer remove(int index)**
  * Remove element at index by calling remove() from the ArrayList class as invariance is already maintained. Returns removed value.

* **int size()**
  * Returns size of the OrderedArrayList by calling size() method from ArrayList class.


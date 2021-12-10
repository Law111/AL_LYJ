import java.util.ArrayList;

public class ALTester {
  ArrayList <Integer> list;

  void ALtester (ArrayList <Integer> al){
    list = al;
  }

  public boolean test(){
    for (int i = 0; i < list.size() - 1; i ++){
      Integer curNum = list.get(i);
      Integer nextNum = list.get(i + 1);
      if (curNum.compareTo(nextNum) > 0){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){
    ArrayList <Integer> l = new ArrayList();
    for (int i = 0; i < 23; i ++){
      l.add(i);
    }
  }
}

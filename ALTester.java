import java.util.ArrayList;

public class ALTester {

  public boolean test(ArrayList <Integer> list){
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
    ALTester at = new ALTester();
    ArrayList <Integer> l = new ArrayList<Integer>();
    for (int i = 0; i < 23; i ++){
      l.add(i);
    }
    System.out.println(at.test(l));
  }
}

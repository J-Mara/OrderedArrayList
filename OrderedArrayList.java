import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  private int findSpot(T element){
    for(int i = 0; i < size(); i++){
      if(element.compareTo(get(i)) < 0){
        return i;
      }
    }
    return size();
  }
}

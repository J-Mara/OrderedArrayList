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
  public boolean add(T e){
    if(e == null){
      throw new IllegalArgumentException("value is null");
    }
    super.add(findSpot(e), e);
    return true;
  }
  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("value is null");
    }
    super.add(findSpot(element), element);
  }
  public T set(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("value is null");
    }
    T holder = super.get(index);
    super.remove(index);
    add(element);
    return holder;
  }
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int initialCapacity){
    super();
  }
}

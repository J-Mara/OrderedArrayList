import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public boolean add(T e){
    if(e == null){
      throw new IllegalArgumentException("value is null");
    }
    if(e != null){
      super.add(e);
      return true;
    }
    return false;
  }
  public void add(int index, T element){
    if(element == null){
      throw new IllegalArgumentException("value is null");
    }
    else{
      super.add(index, element);
    }
  }
  public NoNullArrayList(){
    super();
  }
}

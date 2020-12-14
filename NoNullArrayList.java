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
}

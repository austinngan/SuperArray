public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    size=0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    data[size]=element;
    return true;
  }
}

public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data=new String[10];
    size=0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    data[size]=element;
    return true;
  }
  public String get(int index){
    if ((size<index)||(index<0)){
      return "No element in this index";
    }
    else{
      return data[index];
    }
  }
}

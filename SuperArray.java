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
    if (size>=data.length){
      resize();
    }
    data[size]=element;
    size=size+1;
    return true;
  }
  public String get(int index){
    return data[index];
  }
  public String set(int index, String element){
    String old=data[index];
    data[index]=element;
    return old;
  }
  private void resize(){
    String[] larger=new String[data.length+1];
    for (int i=0;i<data.length;i++){
      larger[i]=data[i];
    }
    data=larger;
  }

}

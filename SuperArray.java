public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data=new String[10];
    size=0;
  }
  public SuperArray(int initialCapacity){
    size=0;
    data=new String[initialCapacity];
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
  public void add(int index, String element){
    if (size>=data.length){
      resize();
    }
    String[] newer=new String[data.length];
    for (int i=0;i<index;i++){
      newer[i]=data[i];
    }
    size=size+1;
    for (int y=index;y<size+1;y++){
      newer[y+1]=data[y];
    }
    newer[index]=element;
    data=newer;
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
    String[] larger=new String[data.length*2];
    for (int i=0;i<data.length;i++){
      larger[i]=data[i];
    }
    data=larger;
  }
  public boolean isEmpty(){
    for (int i=0;i<data.length;i++){
      if (data[i]!=""){
        return false;
      }
    }
    return true;
  }
  public void clear(){
    String[] newer=new String[10];
    size=0;
    data=newer;
  }
  public String toString(){
    String str="[";
    for (int i=0;i<size;i++){
      if (data[i]!=""){
        if (i==size-1){
          str=str+data[i]+"]";
        }
        else{
          str=str+data[i]+", ";
        }
      }
      else{
        str=str;
      }
    }
    return str;
  }
  public boolean contains(String s){
    if (isEmpty()==true){
      return false;
    }
    else{
      for (int i=0;i<data.length;i++){
        if (data[i].equals(s)==true);
          return true;
        }
      return false;
    }
  }
  public String remove(int index){
    String removed=data[index];
    if (index<0||index>data.length){
      return "No element at this index";
    }
    else{
      data[index]="";
      for (int i=index;i<size+1;i++){
        data[i]=data[i+1];
      }
    }
    return removed;
  }
}

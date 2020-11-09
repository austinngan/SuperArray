public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data=new String[10];
    size=0;
  }
  public SuperArray(int initialCapacity){
    if (initialCapacity<0){
      throw new IllegalArgumentException("Initial Capacity is "+initialCapacity+" and cannot be a negative value.");
    }
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
    if (data.length==size()){
      resize();
    }
    if (index<0||index>=size()){
      throw new IndexOutOfBoundsException("Index out of range");
    }
    for (int i=size();i>0;i--){
      if (i>index){
        data[i]=data[i-1];
      }
    }
    data[index]=element;
    size++;
  }
  public String get(int index){
    if (index<0||index>size()){
      throw new IndexOutOfBoundsException("Index out of range");
    }
    else{
    return data[index];
    }
  }
  public String set(int index, String element){
    if (index<0||index>=size()){
      throw new IndexOutOfBoundsException("Index out of range");
    }
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
      if (data[i]!=null){
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
    if (size==0){
      return "[]";
    }
    for (int i=0;i<size;i++){
      if (data[i]!=null&&data[i]!=""){
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
    for (int i=0;i<data.length;i++){
      if (s==null){
        if (data[i]==null){
          return false;
        }
      }
      else{
        if (s!=null&&data[i]!=null){
          if (data[i].equals(s)){
            return true;
          }
        }
      }
    }
    return false;
  }
  public String remove(int index){
    String removed="";
    if (index<0||index>=size()){
      throw new IndexOutOfBoundsException("Index out of range");
    }
    else{
      removed=data[index];
      for (int i=index;i<size();i++){
        data[i]=data[i+1];
      }
      size=size-1;
      return removed;
    }
  }
  public int indexOf(String s){
    if (isEmpty()){
      return -1;
    }
    for (int i=0;i<data.length;i++){
      if (s==null){
        if (data[i]==null){
          return -1;
        }
      }
      if (s!=null&&s.equals(data[i])){
          return i;
        }
      }
      return -1;
    }
  public String[] toArray(){
    String[] newArray=new String[size];
    int indexCount=0;
    for (int i=0;i<data.length;i++){
      if (data[i]!=null&&data[i]!=""){
        newArray[indexCount]=data[i];
        indexCount+=1;
      }
    }
    return newArray;
  }
  public int lastIndexOf(String value){
    for (int i=size();i>=0;i--){
      if (get(i)!=null&&get(i).equals(value)){
        return i;
      }
    }
    return -1;
  }
  public boolean equals(SuperArray other){
    String[] original=toArray();
    String[] newArray=other.toArray();
    if (original.length!=newArray.length){
      return false;
    }
    for (int i=0;i<original.length;i++){
      if (original[i].equals(newArray[i])==false){
        return false;
      }
    }
    return true;
  }
}

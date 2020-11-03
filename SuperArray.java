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
    if ((index>=size)||(index<0)){
      return "No element in this index";
    }
    else{
      return data[index];
    }
  }
  public String set(int index, String element){
    if (index<size){
      data[index]=element;
    }
    else{
      return "No element in this index";
    }
  }
  private void resize(){
    String[] larger=new String[data.length+1];
    for (int i=0;i<data.length;i++){
      larger[i]=data[i];
    }
    String[] data=new String[larger.length];
    for int(y=0;y<larger.length;y++){
      data[y]=larger[y]
    }
  }

}

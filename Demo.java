public class Demo{
  public static void removeDuplicates(SuperArray s){
    String temp="";
    for (int i=s.size();i>=0;i--){
      temp=s.get(i);
      if (s.indexOf(temp)!=i){
        s.remove(i);
      }
    }
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }
}

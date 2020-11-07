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
    SuperArray a=new SuperArray();
    SuperArray b=new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    a.add("9"); a.add("1"); a.add("2"); a.add("2"); a.add("3"); a.add("4");
    b.add("0"); b.add("4"); b.add("2"); b.add("2"); b.add("9");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(findOverlap(a, b));
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray c=new SuperArray();
    String[] a2=a.toArray();
    String[] b2=b.toArray();
    for (int i=0;i<a2.length;i++){
      for (int z=0;z<b2.length;z++){
        if (a2[i].equals(b2[z])){
          c.add(a2[i]);
        }
      }
    }
    removeDuplicates(c);
    return c;
  }
}

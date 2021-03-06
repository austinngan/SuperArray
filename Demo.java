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
  public static SuperArray zip(SuperArray a, SuperArray b){
    int smaller=Math.min(a.size(),b.size());
    int larger=Math.max(a.size(),b.size());
    SuperArray merged=new SuperArray();
    for (int i=0;i<smaller;i++){
      merged.add(a.get(i));
      merged.add(b.get(i));
    }
    if (a.size()==b.size()){
      return merged;
    }
    if (a.size()>b.size()){
      for (int y=smaller;y<larger;y++){
        merged.add(a.get(y));
      }
    }
    else{
      for (int z=smaller;z<larger;z++){
        merged.add(b.get(z));
      }
    }
    return merged;
  }
}

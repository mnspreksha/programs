import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int[] arr=new int[t];
for(int i=0;i<t;i++)
{
   arr[i]=sc.nextInt();
}
Arrays.sort(arr);
TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
for(int i=0;i<arr.length;i++)
{
   if(map.containsKey(arr[i]))
   {
       map.put(arr[i],map.get(arr[i])+1);
   }
   else{
       map.put(arr[i],1);
   }
}
for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" aparece "+m.getValue()+" vez(es)");    
   }  
}
}

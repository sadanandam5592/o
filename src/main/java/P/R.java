package P;

import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

@Slf4j
public class R extends U{
   static final List<String> s=new ArrayList<>();

   public List<String> m(){
        s.add("a");
        s.add("b");
        s.add("c");
        return s;
        }
        public List<String> k(){
       s.add("g");
       return s;
        }
        public static void main(String[] args) {
           R e=new R();
           List<String>d= e.m();
           List<Integer>f=new ArrayList<>();
           f.add(1);
           f.add(2);
           f.add(3);
            List<Integer>f1=new ArrayList<>();
            f1.add(4);
            f1.add(5);
            f1.add(6);
      /* d.forEach(t-> {
          if(t.equals("a")) System.out.println(t);
          else System.out.println("");
      });*/
            ConcurrentHashMap<String, Collection<Integer>> o = new ConcurrentHashMap<String, Collection<Integer>>();

            List<Integer> h=new ArrayList<>(){{f1.stream().forEach(t->add(t));}};
            System.out.println("h is"+h);
            o.put(null,f);
            o.put("b",f1);
            List<Integer>f2=o.values().stream().flatMap(Collection::stream).collect(Collectors.toList());

            System.out.println(f2);

   }
}


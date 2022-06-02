package P;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class U {
    Logger l= LoggerFactory.getLogger(U.class);
        public static void main(String[] args){
            String a = "201";
            String b = "200";

            if(!a.equals(b)){
                System.out.println("Equal variables:");
                System.out.println(a.hashCode() + "\n" + b.hashCode());
            }

            String c = "10";
            String d = "50";

            if(!c.equals(d)){
                System.out.println("\nUn-equal variables:");
                System.out.println(c.hashCode() + "\n" + d.hashCode());
            }
        }
    }


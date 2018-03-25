import java.util.*;

public class Numbers {
    public static void main (String args[]) {
         int count =0;    
         int itr = 1, m=0;
         ArrayList<Integer> nums = new ArrayList<Integer>(); 

        while(count<100) {
             for (int i = (int)(Math.pow(10, itr)); i < (int)Math.pow(10, itr + 1); i++) {
                 for (int j = i; j < (int)Math.pow(10, itr + 1); j++) {
                    if(i%10==0 && j%10==0) continue;

                     int pro = i * j;
                     String k = Integer.toString(i) + Integer.toString(j);
                     String l = Integer.toString(pro);
                     char[] a = k.toCharArray();
                     char[] b = l.toCharArray();
                     Arrays.sort(a);
                     Arrays.sort(b);
                     if (Arrays.equals(a, b)) {
                        if(!nums.contains(pro)) {
                            nums.add(pro);
                            count++;
                        }
                    }
                }
            }
            itr++;
        }
        
        Collections.sort(nums); 
        System.out.println(count);
        for(int i=0;i<100;i++) System.out.println(nums.get(i));
    }

}
package algorithms;

import java.util.Scanner;

public class StringRepeat {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
     
        long n = in.nextLong();
      int count=0;
  String   repeated = new String(new char[(int) n]).replace("\0", s);
           char[] chararray=repeated.toCharArray();
           
           for(int i=0;i<n;i++)
           { 
        	   if(chararray[i]=='a')
        	   {
        		   count++;
        	   }
        	   
           }
           System.out.println(count);
    }
}

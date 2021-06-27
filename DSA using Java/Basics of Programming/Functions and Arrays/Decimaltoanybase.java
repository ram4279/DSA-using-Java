import java.util.*;
  
  public class Decimaltoanybase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
      scn.close();
   }
  
   public static int getValueInBase(int n, int b){
       int power = 1;
       int res = 0;
       while(n!=0){
           int rem = n % b;
           res+= (rem*power);
           n/=b;
           power*=10;
       }
       return res;
   }
  }
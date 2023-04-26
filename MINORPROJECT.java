
import java.util.*;
import java.lang.*;
import java.math.*;

public class MINORPROJECT{
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	    System.out.println("enter your massage");
	    String input=sc.nextLine();
	    System.out.println("enter key");
       int x = sc.nextInt();
       int y = sc.nextInt();
       
       String enc = encrypt(input,x,y);
       System.err.println("encrypted: " + enc);
       System.out.println("enter key");
       int a=sc.nextInt(),b=sc.nextInt();
       String dec = decrypt(enc,a,b);
       System.err.println("Decrypted: " + dec);
   }
   
   public static String encrypt(String input,int FK,int SK) {
       String str = "";input=input.toUpperCase();
       for (int in = 0; in < input.length(); in++) {
           char get = input.charAt(in);
           if (Character.isLetter(get)) {
               // ax + b % 26
               get = (char) ((FK * (int)(get + 'A') + SK) % 26 + 'A');
           }
           str +=get;//DANISH
       }
       return str;
   }
   
   public static String decrypt(String input,int FK,int SK) {
       String str = "";
       int x = 0;
       int inverse = 0;
       
       // find 1 by using modular inverse
       // 17 * IN mod 26 == 1
       // IN is 0 - infinity
       // if total == 1, then IN is the inverse modular
       while(true){
         inverse = FK * x % 26;
            if(inverse == 1)
               break;
         x++;
       }
       
       for (int in = 0; in < input.length(); in++) {
           char get = input.charAt(in);
           if (Character.isLetter(get)) {
               // IN *(x-b) mod 26
               get = (char)(x * ((get + 'A') - SK) % 26 + 'A');
           }
           str +=get;
       }str=str.toLowerCase();
       return str;
   }}
// OUTPUT
/*enter your massage
hello
enter key
7
2
encrypted: ZEBBW
enter key
7

Decrypted: hello*/

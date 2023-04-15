import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Affinebyme {
public static String encrypt(String pt ,int a,int b) {String encrypted ="";
for(int i=0;i<pt.length();i++) {
	char dig=pt.charAt(i);
	int digcon=(char)dig-97;
	int con=(a*digcon+b)%26;
	char conted=(char)(con+97);
	encrypted+=conted;
}
	return encrypted;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    System.out.println("enter text");
    String text=sc.nextLine();
    System.out.println("enter pin");
    int a=sc.nextInt(),b=sc.nextInt();
    int f=(inverse(a));
String encrypted=encrypt(text,a,b);
System.out.println(encrypted);
System.out.println("enter pin");
int c=sc.nextInt(),d=sc.nextInt();
String decrypted=decrypt(encrypted,c,d,f);
System.out.println(decrypted);
	}
public static String decrypt(String ct,int a,int b,int c) {
	String decrypted ="";
	for (int i=0;i<ct.length();i++) {
		char digi=ct.charAt(i);
		
		int digcon=(char)digi-97;System.out.println(digcon+"char-97");
		int con=(c*(digcon-b))%26;System.out.println("xxxx"+con);
		char converted=(char)(con+97);
		decrypted+=converted;
	}
	return decrypted;
}
static int  inverse(int a) {
	a=a%26;
	for(int i=1;i<26;i++) 
		if((a*i)%26==1)
			return i;
	return 1;
}	
		
		
		
}

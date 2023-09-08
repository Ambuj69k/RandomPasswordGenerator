package RandomPasswordGenerator;

import java.util.Random;

public class Password {
	public static void main(String[] args) {
		String UpperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String LowerCase="abcdefghijklmnopqrstuvwxyz";
		String num="1234567890";
		String specialChar="!<>,[]{}@#$%&*()";
		String Combination=UpperCase+LowerCase+num+specialChar;
		int length=8;
		char[] password= new char[length];
		Random obj=new Random();
		for(int i=0;i<length;i++) {
			password[i]=Combination.charAt(obj.nextInt(Combination.length()));
		}
		System.out.println("your password is:"+ new String(password));
	}

}

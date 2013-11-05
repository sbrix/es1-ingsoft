package it.unipr.sbrix.esercizio1;
import java.io.UnsupportedEncodingException;
import java.security.*;



public final class PasswordService {
	public static String encrypt(String str) throws Exception{
		MessageDigest md = null;
		Base64Service base64 = new Base64Service();
		try{
			md =MessageDigest.getInstance("SHA");
		}
		catch (NoSuchAlgorithmException e) {
			throw new Exception(e.getMessage());
		}
		
		try {
			md.update(str.getBytes("UTF-8"));
		}
		catch ( UnsupportedEncodingException e){
			throw new Exception(e.getMessage());
		}
		
		
		String hash = null;
		return hash;
		
	}

}



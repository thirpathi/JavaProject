package com.learing;

import org.apache.commons.codec.binary.Base64;

public class EncodeDecodeTest {
	
	public static void main(String[] args) 
	{
		String s = "thirupathi";
		
		//Encode the String value
	    byte[] encode = Base64.encodeBase64(s.getBytes());
		String s1 = new String(encode);
		System.out.println("encoded value is " + s1);
		
		/*// Decode the value
		byte[] decode = Base64.decodeBase64(encode);
		String s2 = new String(decode);
		System.out.println("decoded value is " + s2);
		*/	
	}

}


/*o/p:-
	encoded value is dGhpcnVwYXRoaQ==
	decoded value is thirupathi
*/
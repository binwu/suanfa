package suanfa;

import java.io.UnsupportedEncodingException;


public class suanfa {
	public static void main(String[] args){
		byte[] b="、".getBytes();
		System.out.println(b);
//			System.out.println(bytesToHexString(b));
			try {
				String s=new String(b,"gb2312");
				System.out.println(s);
//				String ss=new String(s,"utf-8");
				System.out.println(bytesToHexString(s.getBytes()));
				
				System.out.println("wwwww"+new String(b,"utf-8"));
				String aa = "、、、、、";
		        byte[] byteArry = new byte[0];
		        byteArry = aa.getBytes();
		        String bb = "";
		        for (int i = 0; i < byteArry.length; i++) {
		            bb += byteArry[i];
		            bb += ", ";
		        }
		        try {
		            bb += new String(byteArry, "utf-8");
		        }catch (Exception e) {
		            e.printStackTrace();
		        };
		        System.out.println(bb);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}
	
	public static String bytesToHexString(byte[] src){  
		System.out.println("byte lenth "+src.length);
	    StringBuilder stringBuilder = new StringBuilder("");  
	    if (src == null || src.length <= 0) {  
	        return null;  
	    }  
	    for (int i = 0; i < src.length; i++) {  
	        int v = src[i] & 0xFF;  
	        String hv = Integer.toHexString(v);  
	        if (hv.length() < 2) {  
	            stringBuilder.append(0);  
	        }  
	        stringBuilder.append(hv);  
	    }  
	    return stringBuilder.toString();  
	} 
}
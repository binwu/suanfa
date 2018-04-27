package suanfa;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestMd5 {
	public String getMd5Pre6(String str) throws NoSuchAlgorithmException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(str.getBytes());
		byte[] m = md5.digest();
		System.out.println("md5:" + getString(m));
		String pd = getString(m).substring(0, 6);
		return pd;
	}

	private static String getString(byte[] bytes) {
		StringBuilder builder = new StringBuilder(bytes.length * 2);
		for (byte b : bytes) {
			/**
			 * 0xFF默认是整形，一个byte跟0xFF相与会先将那个byte转化成整形运算
			 */
			if ((b & 0xFF) < 0x10) { // 如果为1位 前面补个0
				builder.append("0");
			}

			builder.append(Integer.toHexString(b & 0xFF));
		}

		return builder.toString();
	}

}

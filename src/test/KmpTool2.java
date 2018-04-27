package test;

public class KmpTool2 {
	private static int pointer1 = 0;
	private static int pointer2 = 0;

	public static void listComparePosition(String s1, String s2) {
		int nextp[] = 
		for (; pointer1 < (s1.length() - s2.length());) {

		}
	}

	public static boolean isCompare(String s1, String s2) {
		int minLength = s1.length() < s2.length() ? s1.length() : s2.length();
		if (s1.substring(0, minLength).equals(s2.substring(0, minLength))) {
			System.out.println("String " + s1 + " first part is compare " + s2);
			return true;
		}
		System.out.println("String " + s1 + " first part is NOT compare " + s2);
		return false;
	}

	public static int[] getNext(String s) {
		int r[] = new int[s.length()];
		for (int i = 1; i <= s.length(); i++) {
			String tmps = s.substring(0, i);
			int tmpsLength = tmps.length();
			for (int j = tmps.length() - 1; j > 0; j--) {
				String tmps1 = tmps.substring(0, j);
				String tmps2 = tmps.substring(tmpsLength - j, tmpsLength);
				if (tmps1.equals(tmps2)) {
					r[i - 1] = j;
					break;
				} else {

				}
			}
		}
		System.out.println("this is string " + s + " next array: ");
		for (int i : r) {
			System.out.print("" + i);
		}
		return r;
	}

}

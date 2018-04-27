package test;

public class KmpTool {

	private static String str1 = "";
	private static String str2 = "";
	private static StringBuilder list = new StringBuilder();

	public KmpTool(String s1, String s2) {
		this.str1 = s1;
		this.str2 = s2;
		list = findList(s2);
	}

	public static void findPosition(String str1,String str2) {
		int position = 0;
		for (; position <= (str1.length() - str2.length());) {
			int ss = compare(str1.substring(position), str2);
			if (str2.length() == ss) {
				System.out.println("positon " + position + " compare " + ss);
				position = position + str2.length();
			} else {
				position = position + ss
						- Integer.valueOf(("" + list).split(",")[ss].trim()) + 1;
				System.out.println("now positon " + position);
			}
		}
	}

	public static  int compare(String s1, String s2) {
		int pairlength = 0;
		int length = s2.length();
		for (; pairlength < length;) {
			if (s1.charAt(pairlength) == s2.charAt(pairlength)) {
				pairlength++;
			} else {
				break;
			}

		}
		return pairlength;
	}

	public StringBuilder findList(String s) {
		for (int i = 1; i <= s.length(); i++) {
			String tmpS = s.substring(0, i);
			int max = 1;
			int position = 0;
			for (max = 1; max < i; max++) {
				if (tmpS.substring(0, max).equals(
						tmpS.substring(tmpS.length() - max, tmpS.length()))) {
					position = max;
				}
			}
			list.append("" + position + ",");
		}
		System.out.println(list);
		return list;
	}

}

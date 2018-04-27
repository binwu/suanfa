package test;

public class TestKmp {
	public static void main(String srgs[]) {
		 String s1 = "abcabcd";
		 String s2 = "abce";
		// KmpTool kmp = new KmpTool(s1, s2);
		// System.out.println(kmp.findList("aaaaaa"));
		// KmpTool.findPosition(s1,s2);
		// System.out.println(s1.charAt(1));

		KmpTool2 kmp = new KmpTool2();
//		kmp.getNext("abcdabcabcabcabcd");
//		kmp.getNext("abcdabcassfbcabcabcd");
		kmp.isCompare(s1, s2);
	}
}

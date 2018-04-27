package test;

public class TestKmp {
	public static void main(String srgs[]) {
		String s1 = "这时你需要它";
		String s2 = "市场市场";
		KmpTool kmp = new KmpTool(s1, s2);
		// System.out.println(kmp.findList("aaaaaa"));
		kmp.findPosition();
//		System.out.println(s1.charAt(1));
	}
}


public class LicenceKeyFormatting {

	public static String licenseKeyFormatting(String s, int k) {
		s = s.replace("-", "");
		StringBuilder licence = new StringBuilder(s);
		StringBuilder solution = new StringBuilder();
		if (licence.length() > 0) {
			char[] finalData = licence.toString().toCharArray();
			int index = 1;
			for (int i = finalData.length - 1; i >= 0; i--) {
				solution.append(finalData[i]);
				if (index % k == 0 && i > 0) {
					solution.append("-");
				}
				index++;
			}
			solution = solution.reverse();
		}
		return solution.toString().toUpperCase();
    }
	
	public static void main (String[] args) {
		String str = "2-4A0r7-4k";
		int k = 4;
		System.out.println(licenseKeyFormatting(str, k));
	}

}

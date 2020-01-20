package strtokenizer;

import java.util.StringTokenizer;

public class StrTokenizer {

	public static void main(String[] args) {
		String str = "Monday Tuesday Wednesday Thursday Friday Saturnday Sunday";
		String strReverse;
		
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreTokens()) {
			sb.insert(0, st.nextToken());
			if (st.hasMoreTokens()) {
				sb.insert(0, " ");	
			}
		}
		strReverse = sb.toString();
		System.out.println(strReverse);
	}

}

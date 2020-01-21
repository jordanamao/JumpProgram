package lambdas;

import java.util.ArrayList;
import java.util.List;

public class IterateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> pointList = new ArrayList<String>();
		pointList.add("1");
		pointList.add("2");
		pointList.forEach( p ->  { System.out.println(p + "00");} );
		

		System.out.println(pointList);
	}
}

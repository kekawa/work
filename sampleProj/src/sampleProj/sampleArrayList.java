package sampleProj;
import java.util.ArrayList;
import java.util.List;


public class sampleArrayList {
	public static void main (String[] args) {
	  // Stringの要素を格納するためのリストを用意
	  List<String> strList1 = new ArrayList<String>();

	  strList1.add("北海道");
	  strList1.add("東京");
	  strList1.add("沖縄");

	  // 追加した順にリストに入る
	  System.out.println(strList1);
	}

}

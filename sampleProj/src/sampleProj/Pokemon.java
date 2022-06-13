package sampleProj;

import java.util.ArrayList;

public class Pokemon {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("サトシ"); 
        names.add("シゲル"); 
        names.add("タケシ"); 
        System.out.println(names.get(0));
        names.set(0, "カスミ");  //namesの0の要素を"カスミ"に上書きする。
        System.out.println(names.get(0));
        System.out.println(names.size());  // 要素数を出力
        names.remove(1);  // 指定位置の要素を削除
        System.out.println(names.get(1));
    }
}

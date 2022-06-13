package sampleProj;

//インターフェースの宣言
interface Calc1{
	//メンバ変数(定数)
	public String STR = "足し算";
	public int A = 3;
	public int B = 6;
	
	 //メソッド(型のみ宣言)
	void method1();
	void method2(String str);
	void method3();
}

//インターフェースの実装
class Add implements Calc1{
  // メソッドの実装 
	public void method1() {
		System.out.println(STR + "をします");
	}
	public void method2(String str) {
		System.out.println(str + "をします");
	}
	public void method3() {
		System.out.println("計算結果: " + (A + B));
	}
}

//実行Mainクラス
public class Implements {

	public static void main(String[] args) {
		Add add = new Add();
		add.method1(); //”足し算をします"の表示
		add.method3(); //定数の足し算の結果表示
		add.method2("処理の終了"); //定数の足し算の結果表示
	}

}
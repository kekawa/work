package sampleProj;

public class ConstructorClass {
	
	public static void main(String[] args ){
		SubClass instanceA = new SubClass();
		SubClass instanceB = new SubClass("引数あり");
		instanceA.SubClass2();
		instanceB.SubClass2();
	}

}

class SubClass {
	  //デフォルトコンストラクタ
	  public SubClass(){
	    System.out.println("デフォルトコンストラクタです。");
	    this.SubClass2();
	  }
	  //引数ありコンストラクタ
	  public SubClass(String str){
	    System.out.println("引数ありコンストラクタです。引数「" + str + "」が渡されました。");
	  }
	  
	  void SubClass2() {
		  System.out.println("普通のメソッド");
	  }
	  
}
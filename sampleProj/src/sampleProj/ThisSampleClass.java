package sampleProj;

public class ThisSampleClass {
    public static void main(String args[]) {
            //引数を６個全て与えて初期化
            Person3 p3 = new Person3("Rainbow","Planet","Men",30,173.5,60.3);
    }
}
class Person3 {
    String firstname;
    String lastname;
    String gender;
    int age;
    double height;
    double weight;

    //②自クラスの別のコンストラクターを呼び出す
    Person3(String fnm, String lnm) {
            firstname = fnm;
            lastname = lnm;
            System.out.println("引数２個のコンストラクタを通過");
    }
    Person3(String fnm, String lnm, String gen, int a, double he, double we){
            //①自クラス内の引数が２つ(いずれもString型)を呼び出す、ここで呼び出さないと「null」のまま
            this(fnm, lnm);
            //③上記コンストラクタで初期化しきれなかった残りの変数を初期化
            gender = gen;
            age = a;
            height = he;
            weight = we;
            System.out.println("引数６個のコンストラクタを通過");
            AdditionalInfo adinfo = new AdditionalInfo(this, "Kanagawa");
    }
}
class AdditionalInfo {
    String prefecture = "";
    AdditionalInfo(Person3 p3, String pref){
            prefecture = pref;
            System.out.println(p3.firstname+" "+p3.lastname+"さんの都道府県("+pref+")の登録が完了しました");
            System.out.println("年齢："+p3.age+" 身長："+p3.height+" 体重："+p3.weight);
    }
}

//具体的には別のクラスのコンストラクタに自分自身の参照情報を代入しています。
//受け取った側はこの情報をクラス内の変数に格納するなどして利用します。
//この記述により、オブジェクト間に関連性を持たせる事ができます。

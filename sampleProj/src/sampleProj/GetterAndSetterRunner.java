package sampleProj;

/**実行用クラス。このクラスを実行*/
public class GetterAndSetterRunner{
    public static void main( String[] args ){
        // GetterAndSetterクラスの参照型変数とインスタンスを作ります。
       GetterAndSetter ref = new GetterAndSetter();

        // Setterを使って数値を入れます。
       ref.setData( 100 );

        // Getterを使って数値を取り出します。
       int i = ref.getData();
        System.out.println( i );
        // 出力結果：100
    }
}

class GetterAndSetter{
    // int型変数のフィールドです。privateです。
    private int data;
    /**フィールドの値を取得します。*/
    public int getData(){
        return data;
    }
    /**フィールドに値を入れます。*/
    public void setData( int param ){
        data = param;
    }
}
package sampleProj;
import java.util.ArrayList;

public class ClassList {
    public static void main(String[] args) {

        //var drinklist = new ArrayList<ClassListSub>();
    	ArrayList<ClassListSub> drinklist = new ArrayList<ClassListSub>();

        // Drinkクラスを格納するArrayListに飲み物を追加
        ClassListSub coffee = new ClassListSub("コーヒー", 1, 130);
        drinklist.add(coffee);

        ClassListSub water = new ClassListSub("水", 2, 100);
        drinklist.add(water);


        // 今回問題となったメソッドの呼び出し
        displayProduct(drinklist);

        }

        // メソッドを定義
        // ArrayListからDrinkクラスのフィールドを順に取り出す
    public static void displayProduct(ArrayList<ClassListSub> drinklist) {
        for(ClassListSub drink : drinklist) {
        System.out.println(drink.getNumber() + "." + drink.getName()
            + drink.getPrice() + "円");
        }
    }
}
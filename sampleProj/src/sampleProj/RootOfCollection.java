package sampleProj;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class RootOfCollection {
	public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();//[1]
        List<String> arrayList = new ArrayList<String>();//[2]
        Queue<String> priorityQueue = new PriorityQueue<String>();//[3]
        Deque<String> arrayDeque = new ArrayDeque<String>();//[4]
        add(hashSet);//[5]
        add(arrayList);//[6]
        add(priorityQueue);//[7]
        add(arrayDeque);//[8]
        for (String string : hashSet) {//[9]
            System.out.println("[10]" + (String) string);
        }
        for (String string : arrayList) {//[11]
            System.out.println("[12]" + (String) string);
        }
        for (String string : priorityQueue) {//[13]
            System.out.println("[14]" + (String) string);
        }
        for (String string : arrayDeque) {//[15]
            System.out.println("[16]" + (String) string);
        }
    }
    private static void add(Collection collectionWord) {//[20]
    	collectionWord.add("ABC");//[21]
        System.out.println("値を格納");
    }
}

//Set：重複した要素を含むことができないコレクションだ。数学的な集合の概念モデルを作ったり、
//     生徒の時間割を作るためのコースや機械で動くプロセスの集合を表現したりする。
//List：順序付けられたコレクションである。重複した要素を含むことができる。
//      ユーザーは要素を挿入する場所やインデックスによって要素にアクセスすることを正確に制御できる。
//Queue：追加の挿入、抽出、および検査が追加されたコレクション。
//       処理する前の複数の要素を保持するために使われる。
//       基本的なCollectionオペレーションに加えて，追加の挿入や抽出や検査のオペレーションを供給する。
//Deque：Queueと同じ機能を持つ。加えて，FIFO（先入先出）やLIFO（後入先出）の両方のために使われる。
//Map：キーと値を紐付け（マップ）したオブジェクトである。
//      重複したキーを含まない。各々のキーは多くてもひとつの値に紐付けられている。

//[1] Setを実装したHashSetクラスのオブジェクトhashSetを作る。
//[2] Listを実装したArrayListクラスのオブジェクトarrayListを作る。
//[3] Queueを実装したPriorityQueueクラスのオブジェクトpriorityQueueを作る。
//[4] Dequeを実装したArrayDequeクラスのオブジェクトarrayDequeを作る。
//[5] hashSetを引数としてaddメソッドを呼び出す。
//[6] arrayListを引数としてaddメソッドを呼び出す。
//[7] priorityQueueを引数としてaddメソッドを呼び出す。
//[8] hashSetを引数としてaddメソッドを呼び出す。
//[9]-[10] hashSetの要素をすべて表示する。
//[11]-[12] arrayListの要素をすべて表示する。
//[13]-[14] priorityQueueの要素をすべて表示する。
//[15]-[16] arrayDequeの要素をすべて表示する。
//[20] addメソッドを定義する。
//[21] Collectionインターフェースを介して要素「ABC」を追加する。
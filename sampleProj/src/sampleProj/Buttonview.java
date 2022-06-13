//【説明】
//クリックイベントを実現するには ActionListener を implements したクラスにする必要があります。
//ActionListener を implements すると、actionPerformed メソッドを実装する必要があります。
//このメソッドにイベントの処理内容を記述します。
//また、addActionListener メソッドでボタンからのイベントが受け取れるようにアクションリスナーの追加を行います。

package sampleProj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Buttonview extends JFrame implements ActionListener {
	
	/** イベント表示テキスト */
	JTextField text = null;

	public static void main(String[] args) {
		Buttonview frame = new Buttonview();
		
		// 閉じるボタンをクリックされた場合の動作を設定
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ウインドウのタイトルを設定
		frame.setTitle("JButton サンプル08");
		
		// フレームの X座標、Y座標、幅、高さを設定
		frame.setBounds(100, 200, 500, 100);
		
		// フレームを表示(これをしないと透明のフレームが立ち上がってしまう)
		frame.setVisible(true);
	}
	
	/**
	 * コンストラクタ
	 */
	public Buttonview() {
		// パネルを作成
		JPanel panelBase = new JPanel();
		
		// ボタンを作成
		JButton button1 = new JButton("AAAAA");
		
		// アクションリスナー追加
		button1.addActionListener(this);
		
		// テキストを作成
		text = new JTextField(20);
		
		// ボタン・テキストを追加
		panelBase.add(button1);
		panelBase.add(text);
		
		// パネルを追加
		getContentPane().add(panelBase);
	}
	
	/**
	 * アクション
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("AAAAA")) {
			text.setText("AAAAA がクリックされた！");
		}
	}
}


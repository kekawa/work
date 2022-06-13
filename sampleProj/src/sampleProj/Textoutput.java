
package sampleProj;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Textoutput implements ActionListener {

	private JPanel panel;
	private JButton loadButton, saveButton;
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane sp;

	/** コンストラクタ */
	public Textoutput() {
	
		// 画面構成
		panel = new JPanel();
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		textField = new JTextField(10);
		panel.add(loadButton);
		panel.add(saveButton);
		panel.add(textField);

		textArea = new JTextArea("", 10, 40);	//10行*40桁
		sp = new JScrollPane(textArea);

		//イベント通知の登録
		loadButton.addActionListener(this);
		saveButton.addActionListener(this);
	}


	/** ボタンが押された時の処理 */
	public void actionPerformed(ActionEvent evt) {

		String str = evt.getActionCommand();

		if(str.equals("Load")) {

			load(textField.getText());
		}
		else if(str.equals("Save")) {
			save(textField.getText());
		}
	}

	/** 指定ファイルをロードする */
	public void load(String file) {

		try {
			String line;

			//文字列としてファイルから読み込み
			BufferedReader read = new BufferedReader(new FileReader(file));

			//JTextAreaをクリアしてから表示
			textArea.setText(null);

			//読み込んだデータをJTextAreaへ表示
			while((line = read.readLine()) != null) {
				textArea.append(line + "\n");
			}
			read.close();
		}
		catch (IOException ex) {
			System.err.println(ex);
		}
	}

	/** 指定ファイルへセーブする */
	public void save(String file) {

		try {
			//文字列としてファイルへ書き込み
			BufferedWriter write = new BufferedWriter(new FileWriter(file));

			write.write(textArea.getText());
			write.close();
		}
		catch(IOException ex) {
                        System.err.println(ex);
                }
        }

	
        /** main() */
        public static void main(String[] args) {

                Textoutput test = new Textoutput();
                JFrame frame = new JFrame("FileText");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(test.panel, "Center");      //パネルを配置
                frame.getContentPane().add(test.sp, "South");
                frame.pack();
                frame.setVisible(true);
        }
}
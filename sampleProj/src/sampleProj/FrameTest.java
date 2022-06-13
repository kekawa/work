package sampleProj;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class FrameTest extends Frame {

	Label label1;
	TextField field1;
	Button button1;
	
    public static void main(String [] args) {
        new FrameTest();
    }
    FrameTest() {
        this.setLayout(null);
        this.setSize(200,140);
        label1 = new Label("こんにちは！");
        field1 = new TextField();
        button1 = new Button("Click");
        label1.setBounds(20,40,160,20);
        field1.setBounds(20,70,160,20);
        button1.setBounds(50,100,100,20);
        this.add(label1);
        this.add(field1);
        this.add(button1);
        this.setVisible(true);
    }
}

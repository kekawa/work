package sampleProj;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Buttonview2 extends Frame {
	Button b1;
	
	public Buttonview2() {

		this.setSize(300,200);
		Button b1 = new Button("Click");
		MyButtonActionAdapter ba = new MyButtonActionAdapter();
		ba.Buttonview2 = this;
		
		b1.addActionListener(ba);
		this.add(b1);
		addWindowListener(new MyWindowAdapter());
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Buttonview2();
	}
}

class MyButtonActionAdapter implements ActionListener {
	Buttonview2 Buttonview2;
	public void actionPerformed(ActionEvent ev) {
		System.out.println("you clicked");
	}
}

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
       System.exit(0);
    }
}
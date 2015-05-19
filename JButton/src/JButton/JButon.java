package JButton;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButon extends JFrame{
	private JFrame jf=new JFrame();
	private JButton ab=new JButton();
	
	public JButon(){
		ab= new JButton("1");
		jf.add(ab);
		jf.setSize(400, 400);
		jf.setLocation(200, 300);
		jf.setVisible(true);
	}
	
	public static void main (String[] args){
		JFrame jFrame=new JFrame();
		
	}

}

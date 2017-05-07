import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GridBagLayoutTest {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new GridLayout());
		JPanel p = new JPanel();
		p.setLayout(new GridLayout());
		p.setBackground(Color.green);
		p.add(new MyPanel7());
		
		f.add(p);
		f.setSize(316, 339);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

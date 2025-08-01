import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class 정리_4 extends JFrame implements ActionListener{

	JButton b1, b2, b3, b4, b5;
	public 정리_4(){
		
		//초기화  => 생성자
		b1 = new JButton("1");
		b2 = new JButton("2"); 
		b3 = new JButton("3"); 
		b4 = new JButton("4"); 
		b5 = new JButton("5"); 
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);p.add(b3);p.add(b4);p.add(b5);
		
		add("North", p);
		
		setSize(450, 300);
		setVisible(true);
		
		//버튼 클릭시 처리 
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new 정리_4();
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			JOptionPane.showMessageDialog(this, "맛집 버튼 클릭");
		}
		else if(e.getSource() == b2) {
			JOptionPane.showMessageDialog(this, "레시피 버튼 클릭");
		}
		else if(e.getSource() == b3) {
			JOptionPane.showMessageDialog(this, "위치 버튼 클릭");
		}
		else if(e.getSource() == b4) {
			JOptionPane.showMessageDialog(this, "리뷰 버튼 클릭");
		}
		else if(e.getSource() == b5) {
			JOptionPane.showMessageDialog(this, "자리 버튼 클릭");
		}
		
	}

}

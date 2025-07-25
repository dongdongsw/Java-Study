import javax.swing.*; //윈도우 경량 컴포넌트
import java.awt.*; //이미지 임포트
import java.awt.event.*;

public class MainFrame extends JFrame implements KeyListener{

	GameView gv = new GameView();
	
	public MainFrame()
	{
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(this);
	}
	public static void main(String[] args) {
		new MainFrame();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		new MainFrame();
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		//윈도우에서 키보드 처리
		if(e.getSource()==this)
		{
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			gv.x  -= 5;
			if(gv.x<0)
				gv.x=800;
			gv.repaint();
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			gv.x += 5;
			if(gv.x<0)
				gv.x=800;
			gv.repaint();
		}
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			gv.y -= 5;
			if(gv.y<0)
				gv.y=800;
			gv.repaint();
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			gv.y += 5;
			if(gv.y<0)
				gv.y=800;
			gv.repaint();
		}
	}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}

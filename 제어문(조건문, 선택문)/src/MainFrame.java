import javax.swing.*; //윈도우 경량 컴포넌트
import java.awt.*; //이미지 임포트
import java.awt.event.*;

public class MainFrame extends JFrame{

	GameView gv = new GameView();
	public MainFrame()
	{
		add("Center",gv);
		setSize(800,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		
	}
	

}

import javax.swing.*; //윈도우 경량 컴포넌트
import java.awt.*; //이미지 임포트

public class GameView extends JPanel{

	Image back, air;
	// 초기화
	public GameView() {
		//생성자 => 변수에 대한 초기화
		back = Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\background.jpg");
		
		
	}
	
	public void paint(Graphics g) {
		
		g.drawImage(back, 0, 0, getWidth(), getWidth(), this);
	}

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;

import javax.swing.table.*;

public class 데이터관리 extends JFrame implements ActionListener{
	JTextField tf;
	JButton btn;
	JTable table; //모양
	DefaultTableModel model; //데이터 입출력
	JComboBox box = new JComboBox();
	//데이터 읽기
	String[] mnos = new String[1938];
	String[] titles = new String[1938];
	String[] posters = new String[1938];
	String[] actor = new String[1938];
	String[] generes = new String[1938];
	String[] grades = new String[1938];
	TableColumn column;
	//초기화
	public 데이터관리() {
		
		//값을 채운다
		try {
			String movie = "";
			 File file = new File("C:\\javaDev\\movie.txt");
			 int i = 0; // 파일 읽어서 저장하는 변수
			 //한글자 읽기 => 정수로 읽는다 'A' => 65
			 FileReader fr = new FileReader(file);
			 StringBuffer sb = new StringBuffer();
			 while((i = fr.read()) != -1) {
//				 movie += (char)i;
				 sb.append((char)i); // + 보다 더 효율이 좋음
			 }
			 fr.close();

			 movie = sb.toString();
			
			 
			 i = 0;
			 
			 String[] movies = movie.split("\n");
			 for(String m : movies) {
				 
				 String[] info = m.split("\\|");
				 //정규식 => | => | 출력 ==> \\
				 mnos[i] = info[0];
				 titles[i] = info[1];
				 generes[i] = info[2];
				 posters[i] = info[3];
				 actor[i] = info[4];
				 grades[i] = info[6];
				 i++;
			 }
		}catch(Exception ex){
			
		}
		box.addItem("제목");
		box.addItem("출연");
		box.addItem("장르");
		box.setBounds(10, 15, 130, 35);
		add(box);
		
		tf = new JTextField();
		btn = new JButton("검색");
		setLayout(null);
		tf.setBounds(145,15,250,45);
		btn.setBounds(400,15,100,45);
		//윈도우에 추가
		add(tf); add(btn);
		
		//테이블
		String[] col = { "번호", "영화명", "출연진", "장르", "등급"};
		String[][] row = new String[0][5];
		model = new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) { //더블클릭해도 편집이 안되게
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		table = new JTable(model);
		table.getTableHeader().setReorderingAllowed(false); //컬럼이 이동 못하게 막는 것
		JScrollPane js = new JScrollPane(table);
		js.setBounds(10,60,760,500);
		add(js);
		
		for(int i = 0; i< col.length; i++) {
			column = table.getColumnModel().getColumn(i);
			if(i == 0) {// 번호 속성
				column.setPreferredWidth(30);
			}
			else if(i == 1) {// 영화명 속성
				column.setPreferredWidth(150);
			}
			else if(i == 2) {// 출연진 속성
				column.setPreferredWidth(200);
			}
			else if(i == 3) {// 장르 속성
				column.setPreferredWidth(150);
			}
			else if(i == 4) {// 등급 속성
				column.setPreferredWidth(40);
			}
			}
		
		for(int i = 0; i<titles.length; i++) {
			String[] datas = {mnos[i], titles[i], actor[i], generes[i], grades[i]};
			model.addRow(datas);
		}
		setSize(800,600);
		setVisible(true);
		btn.addActionListener(this);
		tf.addActionListener(this); //엔터 치면 검색 됨
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
			
		}catch(Exception ex){
			
		}
		new 데이터관리();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn || e.getSource() == tf) { //btn 버튼클릭시, 엔터 버튼 클릭시 검색
			String cate = (String)box.getSelectedItem();
//			System.out.println(cate);
			
			//입력값 읽기
			String fd = tf.getText();
			if(fd.length() < 1) { //입력이 없는 경우
				JOptionPane.showMessageDialog(this,  "검색어 입력");
				tf.requestFocus(); // 검색어 입력할 떄 값이 비워져 있으면 메시지 창
				return;
			}
			
			//검색
			for(int i = model.getRowCount()-1; i>=0; i--) {
				model.removeRow(i); //검색한 내용을 출력하기전에 내용물 안보이게 지움
			}
			if(cate.equals("제목")) {
				for(int i = 0; i<titles.length; i++) {
					if(titles[i].contains(fd)) {
					String[] datas = {mnos[i], titles[i], actor[i], generes[i], grades[i]};
					model.addRow(datas);
				}
					}
			}
			else if(cate.equals("출연")) {
				for(int i = 0; i<actor.length; i++) {
					if(actor[i].contains(fd)) {
					String[] datas = {mnos[i], titles[i], actor[i], generes[i], grades[i]};
					model.addRow(datas);
				}
					}
				
			}
			else if(cate.equals("장르")) {
				for(int i = 0; i<generes.length; i++) {
					if(generes[i].contains(fd)) {
					String[] datas = {mnos[i], titles[i], actor[i], generes[i], grades[i]};
					model.addRow(datas);
				}
					}
			}
			
		}
	}

}

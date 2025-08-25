package com.sist.map;
import java.util.*;

public class Map_2 {

	public static void main(String[] args) {

		Map map = new HashMap();
		
		//SQL 문장 => MyBatis => XML
		map.put("boardListData", "SELECT * FROM board");
		map.put("boardDetailData", "SELECT * FROM board WHERE ");
		map.put("boardInsertData", "INSERT INTO board VALUES(1,'', '', '' ,'')");
		map.put("boardListData", "UPDATE board SET name=''");
		map.put("boardListData", "DELETE FROM board WHERE no = 1");
		
		Set set =  map.keySet();
		for (Object obj : set) {
			String sql = (String)obj;
			System.out.println(obj + ":" + map.get(obj));
		}
		
	}

}

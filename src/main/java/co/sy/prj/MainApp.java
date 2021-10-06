package co.sy.prj;

import java.util.HashMap;
import java.util.Map;

import co.sy.prj.vo.DevVO;

//import java.util.ArrayList;
//import java.util.List;
//import co.sy.prj.vo.DevVO;

public class MainApp {
//	private static DevVO vo;	// Define VO's Object Instance 
	private static MapTest mapTest;
	
	public static void main(String[] args) {
//		List<DevVO> list = new ArrayList<DevVO>();
//		vo = new DevVO();
//		vo.setId(1);
//		vo.setName("홍길동");
//		vo.setAddress("대구광역시 중구");
//		vo.setAge(23);
//		list.add(vo);
//		
//		vo = new DevVO();
//		vo.setId(2);
//		vo.setName("홍길순");
//		vo.setAddress("대구광역시 서구");
//		vo.setAge(23);
//		list.add(vo);
//		
//		System.out.println(list.get(0).getId());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getAddress());
//		System.out.println(list.get(0).getAge());
//		System.out.println("================================================================");
//		
//		list.get(0).toString();
//		list.get(1).toString();
//		System.out.println("================================================================");
//		
//		for (int i = 0; i < list.size(); i++) {
//			list.get(i).toString();
//		}
//		System.out.println("================================================================");
//		
//		for(DevVO vo : list) {
//			vo.toString();
//		}
		
//		mapTest = new MapTest();
//		mapTest.setMap("micol", "1234");
//		mapTest.setMap("park", "2345");
//		mapTest.setMap("lee", "3456");
//		mapTest.setMap("kim", "9876");
//		
//		String pw = mapTest.getMap("lee");
//		System.out.println(pw);
//		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("age", 23);
//		map.put("id", 6);
//		
//		int age = map.get("age");
//		System.out.println(age);
//		System.out.println(map.get("id"));
		
		Map<String, DevVO> mapVo = new HashMap<String, DevVO>();
		DevVO vo = new DevVO();
		vo.setId(1);
		vo.setName("홍길동");
		vo.setAddress("서울");
		vo.setAge(20);
		mapVo.put("홍길동", vo);
		DevVO vo1 = mapVo.get("홍길동");
		vo1.toString();
		
		vo = new DevVO();
		vo.setId(2);
		vo.setName("박수동");
		vo.setAddress("대구");
		vo.setAge(23);
		mapVo.put("박수동", vo);
		DevVO vo2 = mapVo.get("박수동");
		vo2.toString();
	}
}

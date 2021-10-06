package co.sy.prj;

import java.util.HashMap;
import java.util.Map;

import co.sy.prj.vo.Bicycle;
import co.sy.prj.vo.Car;
import co.sy.prj.vo.Command;

public class MainApp2 {
	private static Map<String, Command> map = new HashMap<String, Command>();
	
	public static void main(String[] args) {
		map.put("car", new Car());
		map.put("bicycle", new Bicycle());
		
		Command command = map.get("car");
		command.run();
		command = map.get("bicycle");
		command.run();
	}
}

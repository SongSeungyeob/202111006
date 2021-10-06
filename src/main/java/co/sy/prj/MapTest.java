package co.sy.prj;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	private Map<String, String> map = new HashMap<String, String>();
	
	public void setMap(String id, String password) {
		map.put(id, password);
	}
	
	public String getMap(String id) {
		return map.get(id);
	}
}

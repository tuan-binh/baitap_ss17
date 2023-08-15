package rikkei.academy.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService {
	private Map<String,String> dic = new HashMap<>();
	
	public DictionaryService() {
		dic.put("hello","Xin Chào");
		dic.put("fuck","Chết tiệt");
		dic.put("no","Không");
		dic.put("yes","Có");
	}
	
	public String getValue(String key) {
		return dic.get(key.toLowerCase());
	}
	
}

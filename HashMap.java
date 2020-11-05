public class HashMap {
	
	public static void main(String[] args) {
		
		java.util.HashMap<String,Integer> hMap = new java.util.HashMap<>();
		
		hMap.put("Anil", 100);
		hMap.put("Sunil", 200);
		hMap.put(null, 204);
		hMap.put("Anil", 500);
		hMap.put(null, 208);
		hMap.put("Ram", 0);
		hMap.get("Sunil"); 
		
		System.out.println(hMap.hashCode());
		
		
		System.out.println(hMap);
	}

}

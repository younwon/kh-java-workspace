package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.kh.chap04.model.vo.Perfume;

public class Run {

	public static void main(String[] args) {
		// Map => 저장소
		// Key + Value 세트로 저장
		// HashMap
		
		// Key => 식별자 => 향수이름
		// Value => 향수
		
		Map<String, Perfume> perfumes = new HashMap<String, Perfume>();
		
		// 요소를 추가
		perfumes.put("잉글리시 페어 앤 프리지아 코롱", new Perfume("180", "프루티"));
		perfumes.put("샤넬 N5", new Perfume("480", "알데히딕 플로럴"));
		perfumes.put("디올 소바쥬", new Perfume("360", "아로마틱 푸제르"));
		
		//순서보장X
		System.out.println(perfumes);
		
		// get
		// 인자로 전달된 key에 해당하는 value를 반환
		System.out.println(perfumes.get("샤넬 N5"));
		System.out.println(perfumes.get("디올 소바쥬"));
		System.out.println(perfumes.get("없는거"));
		
		System.out.println(perfumes.size());
		System.out.println(perfumes.isEmpty());
		
		// replace() k로 찾아서 v를 치환해줌
		perfumes.replace("잉글리시 페어 앤 프리지아 코롱", new Perfume("280", "프루티"));
		// 기존에 존재하지 않는 키값을 인자로 전달하면 아무일도 일어나지 않음 -> put과의 차이점
		System.out.println(perfumes);

		// remove() k로 k + v 세트로 삭제
		perfumes.remove("잉글리시 페어 앤 프리지아 코롱");
		System.out.println(perfumes);
		
		System.out.println("-------------------------------------------------");
		
		//map 반복 돌리기
		//forEach()와 람다식으로 돌리기
		perfumes.forEach((key, value) -> {
			System.out.println(key + " : " + value);
			});
		
		System.out.println("------------------------------------------------");
		
		//Set에 key값만 넣게 set만들기
		Set<String> keySet = perfumes.keySet();
		Iterator<String> itKey = keySet.iterator();
		
		while (itKey.hasNext()) {
			String keyString = itKey.next();
			System.out.println(keyString + " : " + perfumes.get(keyString));
		}
	}

}

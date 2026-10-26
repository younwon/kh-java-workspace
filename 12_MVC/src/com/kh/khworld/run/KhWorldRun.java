package com.kh.khworld.run;

import com.kh.khworld.view.GiftShopView;
import com.kh.khworld.view.KhWorldView;
import com.kh.khworld.view.RestaurantView;

public class KhWorldRun {

	public static void main(String[] args) {
		
		//new KhWorldView().mainMenu();
		//new GiftShopView().mainMenu();
		new RestaurantView().mainMenu();

	}
	// MVC
	// Model : 데이터담당
	// View : 사용자 인터페이스 담당 =>모델에서 만들어진 데이터를 시각적으로 표현
	// COntroller : Model하고 View의 중간다리 => View에서 입력된 값을 Model에 전달 처리 결과를 다시 View로 반환
	
	//놀이공원 어트랙션 CRUD 구현
	// Create(생성) : View에서 어트랙션의 정보를 입력받아서 어트랙션 모양으로 만들어서 저장
	// Read(조회)   : 저장된 어트랙션 정보들을 조회해서 출력 / 특정 조건을 통해 어트랙션 출력
	// Update(수정) : 저장된 어트랙션의 정보(값)를 갱신
	// Delete(삭제) : 저장된 어트랙션의 정보를 삭제

}

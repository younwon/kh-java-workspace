package com.kh.subs.model.service;

import java.util.ArrayList;
import java.util.List;

import com.kh.subs.exception.DuplicateNameException;
import com.kh.subs.exception.InvalidCategory;
import com.kh.subs.exception.InvalidMonthlyFeeException;
import com.kh.subs.exception.InvalidPaymentDayException;
import com.kh.subs.exception.SubscriptionNotFoundException;
import com.kh.subs.model.dto.Subscription;

public class SubsService {
	List<Subscription> subscriptions = new ArrayList<Subscription>();
	
	{
		subscriptions.add(new Subscription("넷플릭스", 13000, 1, "OTT"));
		subscriptions.add(new Subscription("유튜브 프리미엄", 14900, 12, "OTT"));
		subscriptions.add(new Subscription("멜론", 9900, 20, "음악"));
	}
	
	public List<Subscription> readSubscriptions() {
	    // 새로운 ArrayList 객체를 만들고, 내부의 Subscription 객체는 공유함 (얕은 복사)
	    // 반환된 List를 clear()해도 기존 subscriptions 리스트의 요소는 유지됨
		// 하지만 얕은 복사이기 때문에 리스트 내부 객체의 필드를 수정하면 기존 리스트에도 영향이 있음
		return new ArrayList<Subscription>(subscriptions);
	}
	
	public void addSubscriptions(Subscription subscription) {
		
		subscriptions.add(subscription);
	}
	
	public void remove(String name) {
		for (int i = 0; i < subscriptions.size(); i++) {
			if (name.equals(subscriptions.get(i).getName())) {
				subscriptions.remove(i);
				return;
			}
		}
		throw new SubscriptionNotFoundException("해당 서비스명의 구독이 없습니다");
	}
	
	public List<Subscription> find(String category) {
		return subscriptions.stream().filter(s -> s.getCategory().equals(category)).toList();
	}
	
	public void update(String name, int newFee) {
		for (Subscription subscription : subscriptions) {
			if (name.equals(subscription.getName())) {
				subscription.setMonthlyFee(newFee);
				return;
			}
		}
		throw new SubscriptionNotFoundException(name + "은 없습니다");
	}
	
	
	public int totalFee() {
		return subscriptions.stream().mapToInt(s -> s.getMonthlyFee()).sum();
	}
	
	
	public void checkName(String name) {
		boolean exists = subscriptions.stream().anyMatch(s -> s.getName().equals(name));
		if (exists) {
			throw new DuplicateNameException("이미 구독 중인 서비스입니다");
		}
	}
	
	public void checkFee(int fee) {
		if (fee <= 0) {
			throw new InvalidMonthlyFeeException("0보다 커야됨");
		}
	}
	
	public void checkDay(int day) {
		if (!(1 <= day && day <= 31)) {
			throw new InvalidPaymentDayException("결제일은 1 이상 31 이하여야 한다");
		}
	}
	
	public void checkCategory(String category) {
		if (!(category.equals("OTT") || category.equals("음악") || category.equals("쇼핑") || category.equals("기타"))) {
			throw new InvalidCategory("존재하지 않는 옵션입니다");
		}
	}

}

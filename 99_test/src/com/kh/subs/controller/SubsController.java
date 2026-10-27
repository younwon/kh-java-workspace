package com.kh.subs.controller;

import java.util.List;

import com.kh.subs.exception.DuplicateNameException;
import com.kh.subs.exception.InvalidMonthlyFeeException;
import com.kh.subs.exception.InvalidPaymentDayException;
import com.kh.subs.model.dto.Subscription;
import com.kh.subs.model.service.SubsService;

public class SubsController {
	SubsService ss = new SubsService();
	
	public List<Subscription> readSubscriptions() {
		return ss.readSubscriptions();
	}
	
	public void addSubscriptions(String name, int monthlyFee, int paymentDay, String category) {
		Subscription subscription = new Subscription(name, monthlyFee, paymentDay, category);
		ss.addSubscriptions(subscription);
	}
	
	public void remove(String name) {
		ss.remove(name);
	}
	
	public List<Subscription> find(String category) {
		return ss.find(category);
	}
	
	public void update(String name, int newFee) {
		ss.update(name, newFee);
	}
	
	public int totalFee() {
		return ss.totalFee();
	}
	
	
	public void checkName(String name) {
		ss.checkName(name);
	}
	
	public void checkFee(int fee) {
		ss.checkFee(fee);
	}
	
	public void checkDay(int day) {
		ss.checkDay(day);
	}
	
	public void checkCategory(String category) {
		ss.checkCategory(category);
	}
	

}

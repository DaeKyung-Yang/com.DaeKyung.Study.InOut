package com.daekyung.study.inoutsystem.manager;

import com.daekyung.study.inoutsystem.data.Worker;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Date;

public class Manager {

	HashMap<Integer, ArrayList<Date>> timeData = new HashMap<Integer, ArrayList<Date>>();

	private ArrayList<Integer> currentMember = new ArrayList<>();

	public synchronized void in(Worker worker) {
		Integer id = worker.getEmployeeNumber();

		// check already in
		if (currentMember.contains(id)) {
			return;
		}
		else {
			currentMember.add(id);
		}
		
		//HaspMap의 key에 존재하는지 check
		if (timeData.containsKey(id)) {
			ArrayList<Date> timeHistory = timeData.get(id);
			timeHistory.add(new Date());
		} else {
			ArrayList<Date> timeHistory = new ArrayList<>();
			timeHistory.add(new Date());
			timeData.put(id, timeHistory);
		}
	}
	public synchronized void out(Worker worker) {
		Integer id = worker.getEmployeeNumber();
		
		if(!currentMember.contains(id)) {
			return;
		}
		else {
			currentMember.remove(id);
		}
	}

	public void getCurrentMemberList() {
		System.out.println("휴게실에 머물고 있는 사람 수는 : " + currentMember.size() + "명 입니다.");
		System.out.println(currentMember);		
	}

	public void RestListPrint(int employeeNumber) {
		if (timeData.containsKey(employeeNumber)) {
			System.out.println(timeData.get(employeeNumber));
		} else {
			System.out.println("휴게실에 머문 기록이 없는 사원번호입니다.");

		}
	}
}
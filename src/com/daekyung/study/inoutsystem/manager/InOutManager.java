package com.daekyung.study.inoutsystem.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.daekyung.study.inoutsystem.data.Ceo;
import com.daekyung.study.inoutsystem.data.Worker;

public class InOutManager {

	private CeoInListener listener;

	private HashMap<Integer, ArrayList<Date>> timeData = new HashMap<Integer, ArrayList<Date>>();

	private ArrayList<Integer> currentMember = new ArrayList<>();

	public void setCeoListener(CeoInListener l) {
		this.listener = l;
	}

	private void notifyCeoIn() {
		listener.ceoIn();
	}

	public synchronized void in(Worker worker) {
		Integer id = worker.getEmployeeNumber();
		String name = worker.getName();
		// check already in
		if (currentMember.contains(id)) {
			System.out.println(name + "은 이미 휴게실에 입장해 있기 때문에 입장처리 할 수 없습니다.");
			return;
		} else {
			currentMember.add(id);
		}

		if (worker instanceof Ceo) {
			notifyCeoIn();
		}

		// HaspMap의 key에 존재하는지 check
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
		String name = worker.getName();
		if (!currentMember.contains(id)) {
			System.out.println(name + "은 휴게실에 존재하지 않기 때문에 퇴장처리 할 수 없습니다.");
			return;
		} else {
			currentMember.remove(id);
		}
	}

	public synchronized void getCurrentMemberList() {
		System.out.println("휴게실에 머물고 있는 사람 수는 : " + currentMember.size() + "명 입니다.");
		System.out.println(currentMember);
	}

	public synchronized void restListPrint(int employeeNumber) {
		if (timeData.containsKey(employeeNumber)) {
			System.out.println(employeeNumber + "의 입장기록 : " + timeData.get(employeeNumber));
		} else {
			System.out.println(employeeNumber + "은 휴게실에 머문 기록이 없는 사원번호입니다.");

		}
	}
}
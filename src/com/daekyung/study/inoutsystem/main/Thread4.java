package com.daekyung.study.inoutsystem.main;

import com.daekyung.study.inoutsystem.data.Ceo;
import com.daekyung.study.inoutsystem.data.Director;
import com.daekyung.study.inoutsystem.data.Worker;
import com.daekyung.study.inoutsystem.manager.InOutManager;

public class Thread4 implements Runnable{
	
	private String name;
	private InOutManager restRoom;
	public Thread4(String name, InOutManager restRoom)
	{
		this.name = name;
		this.restRoom = restRoom;
	}
	
	public void run() {
		Worker A = new Worker("A", 11, "2021.10.01");
		Director B = new Director("B",21, "2021.11.01", 101);
		Ceo C = new Ceo("C", 31, "2021.12.01", 201, "15더 2234");
		Worker D = new Worker("D", 12, "2021.10.02");
		Worker E = new Worker("E", 13, "2021.10.03");
		
		restRoom.in(A);
		restRoom.out(A);
		System.out.println("쓰레드4종료");
	}

}
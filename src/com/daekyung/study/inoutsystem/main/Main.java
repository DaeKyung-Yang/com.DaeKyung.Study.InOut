package com.daekyung.study.inoutsystem.main;
import com.daekyung.study.inoutsystem.manager.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Worker A = new Worker("A", 11, "2021.10.01");
//		Director B = new Director("B",21, "2021.11.01", 101);
//		Ceo C = new Ceo("C", 31, "2021.12.01", 201, "15더 2234");
//		Worker D = new Worker("D", 12, "2021.10.02");
//		Worker E = new Worker("E", 13, "2021.10.03");
		InOutManager restRoom = new InOutManager();
		
		Thread t1 = new Thread(new Thread1("Thread1", restRoom));
		Thread t2 = new Thread(new Thread2("Thread2", restRoom));
		Thread t3 = new Thread(new Thread3("Thread3", restRoom));
		Thread t4 = new Thread(new Thread4("Thread4", restRoom));
		Thread t5 = new Thread(new Thread5("Thread5", restRoom));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}

package com.daekyung.study.inoutsystem.main;
import com.daekyung.study.inoutsystem.data.*;
import com.daekyung.study.inoutsystem.manager.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker A = new Worker("A", 11, "2021.10.01");
		Director B = new Director("B",21, "2021.11.01", 101);
		Ceo C = new Ceo("C", 31, "2021.12.01", 201, "15더 2234");
		Worker D = new Worker("D", 12, "2021.10.02");
		Worker E = new Worker("E", 13, "2021.10.03");
		
		Manager restRoom = new Manager();
		restRoom.in(A);
		restRoom.in(B);
		restRoom.out(A);
		restRoom.in(C);
		restRoom.in(E);
		restRoom.RestListPrint(11);
		restRoom.RestListPrint(21);
		restRoom.getCurrentMemberList();
	}

}

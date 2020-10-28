package com.statics.examples;


public class TestCalss {

	public static void main(String[] args) {
		
		// Example 1
		System.out.println("****************** Example 1 ******************");
		WebSite krishna = new WebSite();
		System.out.println(krishna.counter);
		WebSite vineela = new WebSite();
		System.out.println(vineela.counter);
		WebSite anu = new WebSite();
		System.out.println(anu.counter);
		WebSite soumya = new WebSite();
		System.out.println(soumya.counter);
		WebSite madhavi = new WebSite();
		System.out.println(madhavi.counter);
		
		
		// Example 2
		System.out.println("****************** Example 2 ******************");
		Airplane a1 = new Airplane();
		a1.takeOff();
		Airplane a2 = new Airplane();
		a2.takeOff();
		a2.touchDown();
		Airplane a3 = new Airplane();
		a3.takeOff();
		a3.touchDown();
		Airplane a4 = new Airplane();
		a4.takeOff();
		Airplane a5 = new Airplane();
		a5.takeOff();
		
		
		System.out.println("Total airplanes took off --> " + Airport.totalTakeOffs);
		System.out.println("Total airplanes returned --> " + Airport.totalTouchDowns);
		
		System.out.print("Total planes in Air --> ");
		System.out.println(Airport.totalTakeOffs - Airport.totalTouchDowns);
	}

}

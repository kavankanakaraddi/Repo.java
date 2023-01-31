package com.xworkz.things;
import com.xworkz.boot.Fan;
public class FanRunner {

	public static void main(String[] args) {
		Fan ref=new Fan();
		System.out.println(ref.colour);
		System.out.println(ref.fanPrice);
		System.out.println(ref.fanSeries);

		ref.colour="creamish";
		ref.fanName="Heavells";
		ref.fanSeries='b';
		
		System.out.println("---------");
		System.out.println("The Fan Colour is = "+ ref.colour);
		System.out.println("The fan Price is = "+ref.fanPrice);
		System.out.println(ref.fanSeries);
		System.out.println("---------");
	}

}

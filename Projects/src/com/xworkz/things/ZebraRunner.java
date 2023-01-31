package com.xworkz.things;
import com.xworkz.boot.Zebra;
public class ZebraRunner {

	public static void main(String[] args) {
	Zebra ref=new Zebra();
	System.out.println(ref.zebraname);
	System.out.println(ref.alive);
	System.out.println(ref.span);
	
	ref.zebraname="Mountain Zebra";
	ref.span=20.0f;
	ref.alive=true;
	
	System.out.println("======");

	System.out.println("Type of Zebra::"+ref.zebraname);
	System.out.println("The Zebra is alive::"+ref.alive);
	System.out.println("The span of Zebra is "+ref.span);
	
	System.out.println("=======");
	}

}

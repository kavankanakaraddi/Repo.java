package com.xowrkz.objects.boot;

import com.xowrkz.objects.things.Pipe;

public class PipeRunner {

	public static void main(String[] args) {
		Pipe pipe = new Pipe();
		pipe.setBrand("Jain Pipes");
		pipe.setDiameter(55);
		pipe.setPrice(550);
		pipe.setColour("White");
		System.out.println(pipe);
		
		Pipe pipe2 = new Pipe();
		pipe2.setBrand("Jain Pipes");
		pipe2.setDiameter(55);
		pipe2.setPrice(550);
		pipe2.setColour("White");
		System.out.println(pipe2);
		
		System.out.println("HashCode is :: "+pipe.hashCode()+"  Original HashCode ::"+System.identityHashCode(pipe));
	
		System.out.println(pipe.equals(pipe));

		System.out.println(pipe.equals(pipe2));
	}

}

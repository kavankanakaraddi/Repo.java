package com.xworkz.things;

import com.xworkz.boot.Frame;
public class FrameRunner {

	public static void main(String[] args) {
		Frame frame = new Frame ("Bigger", 50, 20.50d, 'N', 5000,false,"Navarang Circle"); 
		frame.display();
	}
}
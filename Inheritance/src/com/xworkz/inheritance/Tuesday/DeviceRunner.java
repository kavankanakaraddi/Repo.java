package com.xworkz.inheritance.Tuesday;

import com.xworkz.inheritance.monday.Camera;
import com.xworkz.inheritance.monday.Device;

public class DeviceRunner {

	public static void main(String[] args) {
		Camera camera = new Camera();
		camera.capture();
		camera.operate();
		camera.getBrand();
		
		
		System.out.println("**************************");
		Device device = new Camera ();
		device.operate();
		device.getBrand();
		
		System.out.println("**************************");

		Camera cam = (Camera)device;
		cam.capture();
		
	}

}

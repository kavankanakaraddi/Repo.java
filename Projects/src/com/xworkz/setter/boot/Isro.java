package com.xworkz.setter.boot;

public class Isro {

	public String[] loacations;
	public int[] satelliteNos;
	public Scientists[] scientists;

	public void setScientists(Scientists[] scientists) {
		this.scientists = scientists;
	}

	public void setloacations(String[] loacations) {
		this.loacations = loacations;
	}

	public void setsatelliteNos(int[] satelliteNos) {
		this.satelliteNos = satelliteNos;
	}

	public void display() {
		if (loacations != null) {
			for (int seq = 0; seq < this.loacations.length; seq++) {
				String ref = this.loacations[seq];
				System.out.println("Locations::" + ref);
			}
		} else {
			System.err.println("Isro is not pointed to any address");
		}

		if (satelliteNos != null) {
			for (int num = 0; num < this.satelliteNos.length; num++) {
				int ref = this.satelliteNos[num];
				System.out.println("satelliteNos::" + ref + num);
			}
		} else {
			System.err.println("Isro is not pointed to any satelliteNos address");
		}

		if (scientists != null) {
			for (int seq = 0; seq < this.scientists.length; seq++) {
				Scientists details = this.scientists[seq];
				details.display();

				System.out.println("scientists::" + seq);
			}
		} else {
			System.err.println("Isro is not pointed to any scientists address");
		}

	}
}

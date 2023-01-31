package com.xworkz.things;
import com.xworkz.boot.Film;
public class FilmRunner {

	public static void main(String[] args) {
	Film ref=new Film();
	System.out.println(ref.filmname);
	System.out.println(ref.price);
	System.out.println(ref.seats);
	System.out.println(ref.songs);
	System.out.println(ref.budget);
	
	ref.filmname="Kirik Party";
	ref.budget=2.0f;
	ref.songs=6;
	ref.price=150;
	ref.seats=300;
	Film.Director="Prashant Neel";
	
	System.out.println("==========");
	System.out.println(ref.filmname);
	System.out.println(ref.budget+"Cr");
	System.out.println(ref.songs);
	System.out.println(ref.price);
	System.out.println(ref.seats);
	System.out.println(Film.Director);
	System.out.println("==========");
	}

}

package com.xworkz.exception.boot;

import com.xworkz.exception.things.Film;

public class FilmRunner {

	public static void main(String[] args) {
		
		Film film = new Film("KGF2");
		System.out.println(film);
		String ref=film.toString();
		System.out.println(ref.charAt(1));
		System.out.println(ref.codePointAt(1));
		System.out.println(ref.codePointBefore(1));
		System.out.println(ref.codePointCount(0, 1));
		System.out.println(ref.compareTo(ref));
		System.out.println(ref.compareToIgnoreCase(ref));




	}

}

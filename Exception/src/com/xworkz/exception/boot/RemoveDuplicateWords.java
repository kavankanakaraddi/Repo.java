package com.xworkz.exception.boot;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String sentence = "This is a Sentence with duplicate word is a";
		String[] words = sentence.split(" ");
		Set<String> uniqueWords = new HashSet<>();
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			if (!uniqueWords.contains(word)) {
				uniqueWords.add(word);
				result.append(word).append(" ");
			}
		}
		String output = result.toString().trim();
		
		System.out.println("Original sentence : "+sentence);
		System.out.println("Sentence without duplicate :"+output);
	}

}

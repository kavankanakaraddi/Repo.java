package com.xworkz.exception.boot;

public class ReverseWordInSentences {

	public static void main(String[] args) {
		String sentence = "This is Java class";
		String WordToReverse = "Java";
		String[] words = sentence.split(" ");
		StringBuilder reversedWord = new StringBuilder();
		for (String word : words) {
			if (word.equals(WordToReverse)) {
				reversedWord.append(new StringBuilder(word).reverse());
			} else {
				reversedWord.append(" ");
			}

		}
		System.out.println(sentence);
		System.out.println(reversedWord.toString().trim());
	}

}

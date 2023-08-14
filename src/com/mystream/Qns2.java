package com.mystream;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.IntStream;


public class Qns2 {

	public static void main(String[] args) {
		Stream<String> stringStream = Stream.<String>builder().add("BaudeRate").add("Ohm").add("Kilowatt").add("Bits").add("Analog").add("Digital").build();
		 stringStream.forEach(System.out::println);

		 Stream.iterate(new Integer[] {0,1}, s -> new Integer[]{s[1], s[0] + s[1]}).limit(20).map(s -> s[0]).forEach(System.out::println);
		 
		 IntStream.iterate(2, n -> n + 1).filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0)).limit(20).forEach(System.out::println);
	    }

}


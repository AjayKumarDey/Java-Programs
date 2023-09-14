package session;

import java.util.stream.IntStream;

public class PrintoneToHundred {
//without using any loops
	
	public static void main(String[] args) {
	 // using lamda Intstream
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
	}
}

package in.javadev.advancestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Shakespear {

	public static void main(String[] args) throws IOException {

		Set<String> shakespearWords = 
				Files.lines(Paths.get("files/words.shakespeare.txt"))
				.map(word -> word.toLowerCase())
				.collect(Collectors.toSet());
		
		Set<String> scrabbleWOrds = 
				Files.lines(Paths.get("files/ospd.txt"))
				.map(word -> word.toLowerCase())
				.collect(Collectors.toSet());
		
		System.out.println("# words of Shakespear : "+shakespearWords.size());
		System.out.println("# words of Scribble : "+scrabbleWOrds.size());
		
		final int[] scrabbleENScore = {
				
			// a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z
			   1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10  
		};
		
		Function<String, Integer> score = 
				word -> word.chars()
							.map(letter -> scrabbleENScore[letter - 'a']).sum();
		
				
		ToIntFunction<String> intScore = 
				word -> word.chars()
							.map(l -> scrabbleENScore[l - 'a']).sum();
				
		System.out.println("Score of hello : " + intScore.applyAsInt("hello"));
		
		String bestWord = shakespearWords.stream()
					   .filter(word -> scrabbleWOrds.contains(word))
					   .max(Comparator.comparing(score))
					   .get();
		System.out.println("The Best Word is : " + bestWord);
		
	}

}

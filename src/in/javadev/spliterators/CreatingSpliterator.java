package in.javadev.spliterators;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CreatingSpliterator {
	// Create your Own Spliterator
	public static void main(String[] args) {
		
		Path path = Paths.get("C:\\Users\\devpatna\\Desktop\\People.txt");
		
		try {
			Stream<String> lines = Files.lines(path);
			
			Spliterator<String> lineSpliterator = lines.spliterator();
			Spliterator<People> peopleSpliterator = new PeopleSpliterator(lineSpliterator);
			
			Stream<People> people = StreamSupport.stream(peopleSpliterator, false);
			people.forEach(System.out::println );
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

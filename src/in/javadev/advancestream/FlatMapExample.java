package in.javadev.advancestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) throws IOException {
		
		Stream<String> stream1 = Files.lines(Paths.get("files/Text_01.txt"));
		Stream<String> stream2 = Files.lines(Paths.get("files/Text_02.txt"));
		Stream<String> stream3 = Files.lines(Paths.get("files/Text_03.txt"));
		
		//System.out.println("Stream 1 : " + stream1.count());
		//System.out.println("Stream 2 : " + stream2.count());
		//System.out.println("Stream 3 : " + stream3.count());
		
		// now introduce FlatMap here
		Stream<Stream<String>> streamOfStream =  Stream.of(stream1, stream2, stream3);
		
		//System.out.println("# Streams : "+ streamOfStream.count());
		
		//Stream<String> streamOfLines = streamOfStream.flatMap(stream -> stream);
		Stream<String> streamOfLines = streamOfStream.flatMap(Function.identity());
		//System.out.println("Stream Of lines : "+ streamOfLines.count());
		
		// How many words present in the file
		Function<String, Stream<String>> lineSplit = line -> Pattern.compile(" ").splitAsStream(line);
		
		Stream<String> streamOfWords = streamOfLines.flatMap(lineSplit);
		
		System.out.println("# Total Words : " + streamOfWords.count());
		
		
		
		

	}

}

package in.javadev.spliterators;

import java.util.Spliterator;
import java.util.function.Consumer;

public class PeopleSpliterator implements Spliterator<People> {
	
	private final Spliterator<String> lineSpliterator;
	private String name;
	private int age;
	private String city;

	public PeopleSpliterator(Spliterator<String> lineSpliterator) {
		this.lineSpliterator = lineSpliterator;
	}

	@Override
	public int characteristics() {
		return lineSpliterator.characteristics();
	}

	@Override
	public long estimateSize() {
		return lineSpliterator.estimateSize() / 3;
	}

	@Override
	public boolean tryAdvance(Consumer<? super People> action) {
		if(this.lineSpliterator.tryAdvance(line -> this.name = line) &&
		this.lineSpliterator.tryAdvance(line -> this.age = Integer.parseInt(line)) &&
		this.lineSpliterator.tryAdvance(line -> this.city = line)) {
		
		People p = new People(name, age, city);
		action.accept(p);
		return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Spliterator<People> trySplit() {
		return null;
	}

}

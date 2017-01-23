package chapter.fifteen.exercise08;

import java.util.Iterator;
import java.util.Random;

import chapter.fifteen.exercise07.Generator;

public class StoryGenerator implements Generator<AnimeCharacter>, Iterable<AnimeCharacter> {
	private static Random rand = new Random(47);
	private Class[] c = { Fate.class, Hisa.class, Homura.class, Marisa.class, Rin.class };
	private int size = 0;
	public StoryGenerator (int size) {
		this.size = size;
	}
	public AnimeCharacter next() {
		try {
			return (AnimeCharacter) c[rand.nextInt(c.length)].newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	public Iterator<AnimeCharacter> iterator() {
		return new Iterator<AnimeCharacter>() {
			public AnimeCharacter next() {
				size--;
				return StoryGenerator.this.next();
			}
			public boolean hasNext() {
				return size > 0;
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (AnimeCharacter ac : new StoryGenerator(10)) {
			ac.selfConfession();
		}
	}

}

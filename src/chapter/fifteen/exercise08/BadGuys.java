package chapter.fifteen.exercise08;

public abstract class BadGuys extends AnimeCharacter {
	void selfConfession() {
		doBadThings();
		System.out.println("I'm a badguy");
	}
	abstract void doBadThings();
}

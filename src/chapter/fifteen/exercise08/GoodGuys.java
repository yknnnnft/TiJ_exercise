package chapter.fifteen.exercise08;

public abstract class GoodGuys extends AnimeCharacter{
	void selfConfession() {
		doGoodThings();
		System.out.println("I'm a good guy");
	}
	abstract void doGoodThings();
}

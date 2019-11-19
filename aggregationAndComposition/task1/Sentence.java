package task1;

public class Sentence {
private String sentence;


@Override
public String toString() {
	return sentence;
}

public Sentence(String sentence) {
	super();
	this.sentence = sentence;
}

public String getSentence() {
	return sentence;
}

public void setSentence(String sentence) {
	this.sentence = sentence;
}

}

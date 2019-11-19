package task1;

import java.util.ArrayList;

public class Main2 {
	// 1. Создать объект класса Текст, используя классы Предложение, Слово.
	// Методы: дополнить текст, вывести на консоль текст, заголовок текста.
	
	public static void main(String[] args) {
		Text text = new Text("Winnie-The-Pooh", new ArrayList<Sentence>());
		text.addText(
				" IF you happen to have read another book about Christopher Robin, you may remember that he once had a swan (or the swan had Christopher Robin, I don't know which) and that he used to call this swan Pooh. "
						+ "That was a long time ago, and when we said good-bye, we took the name with us, as we didn't think the swan would want it any more."
						+ " Well, when Edward Bear said that he would like an exciting name all to himself, Christopher Robin said at once, without stopping to think, that he was Winnie-the-Pooh. "
						+ "And he was. So, as I have explained the Pooh part, I will now explain the rest of it.");

		text.showText();
	}

}

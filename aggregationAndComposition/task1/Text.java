package task1;

import java.util.List;

public class Text {
private String title;
private List <Sentence> body;

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public List<Sentence> getBody() {
	return body;
}
public void setBody(List<Sentence> body) {
	this.body = body;
}
public Text(String title, List<Sentence> body) {
	super();
	this.title = title;
	this.body = body;
}
public void addText(String sentence){
	String array[]=sentence.split("[!.?]");
	for (int i = 0; i < array.length; i++) {
		body.add(new Sentence(array[i]));
	}
}
public void showText(){
	for(Sentence sens:body){
		System.out.println(sens);
	}
}


}

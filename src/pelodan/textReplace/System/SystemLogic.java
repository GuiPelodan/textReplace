package pelodan.textReplace.System;

public class SystemLogic {

	private String text = "Insira aqui seu texto.";
	private String word = "Palavra";
	private String replace = "Substituto";
	
	public SystemLogic(){}
	//Getters & Setters
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getReplace() {
		return replace;
	}
	public void setReplace(String replace) {
		this.replace = replace;
	}
	//Methods
	public void replaceWord() {
		text = text.replace(word, replace);
	}
}

package codespade.personality.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MultipleChoice implements Serializable {
	public MultipleChoice() {
	}

	public MultipleChoice(Integer id, String question, String type,
			String[] choiceArray) {
		this.id = id;
		this.question = question;
		this.type = type;
		Map<String, String> choices = new HashMap<String, String>();
		for (int i = 0; i < choiceArray.length; i++) {
			String[] choice = choiceArray[i].split("::");
			choices.put(choice[0], choice[1]);
		}
		this.choices = choices;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String question;
	private String type;
	private Map<String, String> choices;
	private String answer;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Map<String, String> getChoices() {
		return choices;
	}

	public void setChoices(Map<String, String> choices) {
		this.choices = choices;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}

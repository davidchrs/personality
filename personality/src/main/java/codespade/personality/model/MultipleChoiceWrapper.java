package codespade.personality.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MultipleChoiceWrapper implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3001276397023048418L;
	private List<MultipleChoice> multipleChoices;
	

	public MultipleChoiceWrapper(List<MultipleChoice> multipleChoices) {
		this.multipleChoices = multipleChoices;
	}

	public List<MultipleChoice> getMultipleChoices() {
		return multipleChoices;
	}

	public void setMultipleChoices(List<MultipleChoice> multipleChoices) {
		this.multipleChoices = multipleChoices;
	}
	
	public void add(MultipleChoice multipleChoice){
		this.multipleChoices.add(multipleChoice);
	}
	
	
}

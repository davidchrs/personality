package codespade.personality;

import java.util.List;
import java.util.Map;

import codespade.personality.factory.QuestionFactory;
import codespade.personality.model.MultipleChoice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<MultipleChoice> questions = QuestionFactory.createMBTIQuestions().getMultipleChoices();
        
        for (MultipleChoice q : questions) {
			System.out.println(q.getId()+". "+q.getType()+" "+q.getQuestion());
			for (Map.Entry<String, String> entry : q.getChoices().entrySet())
			{
			    System.out.print(entry.getKey() + ". " + entry.getValue() + "\t\t");
			}
			System.out.println();
		}
    }
}

package m_quizjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import m_quizjava.Question;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mikołaj
 */
@XmlRootElement
public class Questions {
    
    private ArrayList<Question> questionList;

    public Questions() {
    }

    public Questions(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }
    
    public Question getQuestion()
    {
        //get specific question
        //return questionList.get(x);
        return null;
    }
    
    public Question getQuestionByID(int id)
    {
        List<Question> searched= questionList.stream().filter(a->a.getQuestionID()==id).collect(Collectors.toList());
        if(searched.size()==1)
            return searched.get(0);
        else if(searched.size()<1)
            return null;
        else if(searched.size()>1)
            return searched.get(0);
        else
            return null;
    }
    
    public boolean addQuestion(Question question)
    {
        Question twinQuestion = getQuestionByID(question.getQuestionID());
        if(twinQuestion==null)
            questionList.add(question);
        else
        {
            questionList.remove(twinQuestion);
            questionList.add(question);
        }
        return true;
    }

    @XmlElement(name = "question")
    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }
            
    
}

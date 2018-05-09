/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package c_quizjava;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import m_quizjava.Question;
import m_quizjava.Questions;
import m_quizjava.Settings;

/**
 *
 * @author Mikołaj
 */
public class QuestionManager {
    
    
    private Questions questions;
    private final String xmlPath = "data/questionList.xml";
    
    public QuestionManager()
    {
        questions = new Questions(new ArrayList<Question>());
    }
    
    public boolean loadQuestions()
    {
        return this.unmarshallQuestions();
    }
    
    private boolean unmarshallQuestions()
    {
        try
        {
            File file = new File(xmlPath);
            JAXBContext context = JAXBContext.newInstance(Questions.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            questions = (Questions)unmarshaller.unmarshal(file);
        }
        catch(JAXBException jxb)
        {
            System.out.println("Houston, mamy problem: "+jxb.toString());
            return false;
        }
        return true;
    }
    
    public boolean saveQuestions()
    {
        return marshallQuestions();
    }
    
    private boolean marshallQuestions()
    {
        try
        {
            File file = new File(xmlPath);
            JAXBContext context = JAXBContext.newInstance(Questions.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(questions, System.out);
            marshaller.marshal(questions, file);
        }
        catch(JAXBException jxb)
        {
            System.out.println("Houston, mamy problem: "+jxb.toString());
            return false;
        }
        return true;
    }
    
    public Question getRandomQuestion()
    {
        return questions.getQuestion(randomInt(0,questions.getQuestionCount()-1));
    }
    
    private int randomInt(int min, int max)
    {
        Random rand = new Random();
        int  n = rand.nextInt((max+1-min))+min;
        return n;
    }
    
    public Question getQuestionByID(int id)
    {
        return questions.getQuestionByID(id);
    }
    
    public boolean addQuestion(Question question)
    {
        return questions.addQuestion(question);
    }
    
    public ArrayList<Question> getQuestions()
    {
        return questions.getQuestionList();
    }
}

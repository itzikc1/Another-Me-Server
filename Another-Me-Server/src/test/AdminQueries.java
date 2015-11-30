package test;

import java.util.ArrayList;
import java.util.List;

import entities.GPS.Gps;
import entities.Task.PopUp;
import entities.Task.PopUpTemplates;
import entities.Task.Task;
import entities.Task.TasksBank;
import entities.person.Person;
import entities.sms.SMS;

public interface AdminQueries {
	public void addUser(String name,int id,String mail,int age);
	public Person getUser(int id);
	public ArrayList<SMS> getAllSms(int userId);
	public boolean addNewTask();
public 	List<PopUp> getPopUps(); 
//public List<PopUpTemplates>
//	public void setTasksFromCalendar(List<TaskJSON> listOfTasks);
public ArrayList<Task> getTasks(int userId);
public void setGpsLocation(int userId,int x,int y);
public Gps getGpsLocation(int userId);
}

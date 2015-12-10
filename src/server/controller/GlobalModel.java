package server.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import entities.GPS.Gps;
import entities.Task.PopUp;
import entities.Task.PopUpTemplates;
import entities.Task.Task;
import entities.Task.TaskType;
import entities.person.Person;
import entities.sms.SMS;

// facade
public interface GlobalModel {

	// ///////////////////////////set///////////////////////////////////////
	public void addPerson(String name, int personId, String mail, int age);

	public boolean addNewTask(int fromPlatform, Date taskDate,
			Date endTimeDate, TaskType taskType, String taskText, int personId,
			PopUp popUp);

	public void setGpsLocation(int personId, int x, int y);

	// ///////////////////////////////////get////////////////////////
	public Person getPerson(int personId);

	public ArrayList<SMS> getSms(int personId);

	public ArrayList<SMS> getSmsDate(int personId, Date DateTimeFrom,
			Date DateTimeUntil);

	public List<PopUp> getPopUps(int personId, Date DateTimeFrom,
			Date DateTimeUntil);

	public List<PopUpTemplates> getPopUpTemplates(String TemplateName);

	public ArrayList<Task> getTasks(int personId);

	public Gps getGpsLocation(int personId);

	// /////////////////////////////GET ALL/////////////////////////////
	public Person getAllPersons();

	public ArrayList<SMS> getAllSms();

	public List<PopUp> getAllPopUps();

	public List<PopUpTemplates> getAllPopUpTemplates(String TemplateName);

	public ArrayList<Task> getAllTasks();

	public Gps getAllGpsLocation();
	// //////////////////////////////////////////////////

	// public List<PopUpTemplates>
	// public void setTasksFromCalendar(List<TaskJSON> listOfTasks);
}

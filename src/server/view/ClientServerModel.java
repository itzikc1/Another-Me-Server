package server.view;

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
import server.controller.GlobalModel;

public class ClientServerModel implements View {

	@Override
	public void addPerson(String name, int personId, String mail, int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addNewTask(int fromPlatform, Date taskDate,
			Date endTimeDate, TaskType taskType, String taskText, int personId,
			PopUp popUp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setGpsLocation(int personId, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person getPerson(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SMS> getSms(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SMS> getSmsDate(int personId, Date DateTimeFrom,
			Date DateTimeUntil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PopUp> getPopUps(int personId, Date DateTimeFrom,
			Date DateTimeUntil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PopUpTemplates> getPopUpTemplates(String TemplateName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Task> getTasks(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gps getGpsLocation(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SMS> getAllSms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PopUp> getAllPopUps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PopUpTemplates> getAllPopUpTemplates(String TemplateName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gps getAllGpsLocation() {
		// TODO Auto-generated method stub
		return null;
	}

}

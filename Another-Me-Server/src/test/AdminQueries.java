package test;

import java.util.ArrayList;

import entities.GPS.Gps;
import entities.Task.Task;
import entities.Task.TasksBank;
import entities.person.Person;
import entities.sms.SMS;

public interface AdminQueries {
public void addUser(String name,int id,String mail,int age);
public Person getUser(int id);
public ArrayList<SMS> getAllSms(int userId);
public void setTasks(TasksBank listOfTasks);
public ArrayList<Task> getTasks(int userId);
public void setGpsLocation(int userId,int x,int y);
public Gps getGpsLocation(int userId);
}

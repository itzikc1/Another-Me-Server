package entities.person;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import entities.GPS.Gps;
import entities.Task.PopUp;
import entities.Task.TasksBank;

public class Person {
private String fullName;
private BigInteger id;
String mail;
int age;
TasksBank tasks ;
GregorianCalendar calendarTasks;
Gps gps;
ArrayList<PopUp> popUpsList;
//class Survey ?;
	
}

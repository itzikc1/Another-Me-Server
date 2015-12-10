package entities.person;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import entities.GPS.Gps;
import entities.Task.PopUp;
import entities.Task.TasksBank;

public class Person {
	private String fullName;
	private BigInteger personId;
	String mail;
	int age;
	Date DateTimeRegister;
	TasksBank tasks;
	Gps gps;
	DefaultSettings defaultSettings;   
}

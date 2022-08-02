package Programacao_orientada_objetos.enums.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Programacao_orientada_objetos.enums.entities.Department;
import Programacao_orientada_objetos.enums.entities.HourContract;
import Programacao_orientada_objetos.enums.entities.Worker;
import Programacao_orientada_objetos.enums.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String departmentName, workerName, level;
		double baseSalary, valuePerHour;
		int duration, contracts;
		Date date;
		
		System.out.print("Enter department's name: ");
		departmentName = sc.nextLine();

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		workerName = sc.nextLine();
		System.out.print("Level: ");
		level = sc.nextLine();
		level = level.toUpperCase();
		System.out.print("Base salary: ");
		baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker: ");
		contracts = sc.nextInt();
		
		for (int i = 1; i <= contracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			duration = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, duration);
			worker.addContract(contract);
			
		}
		
		sc.nextLine();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.split("/")[0]);
		int year = Integer.parseInt(monthAndYear.split("/")[1]);
		
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
		sc.close();
	}

}

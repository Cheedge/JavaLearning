package com.lqz.team.view;

import java.util.Scanner;

import com.lqz.team.domain.Employee;
import com.lqz.team.service.NameListService;
import com.lqz.team.service.TeamException;
import com.lqz.team.service.TeamService;

public class TeamView {
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	
	public void enterMainMenu() {
		boolean isFlag=true;
		while(isFlag) {
			System.out.println("--------------------------Customer Manager--------------------------");
			System.out.println("\t\t\t1. Add Customer");
			System.out.println("\t\t\t2. Modify Customer");
			System.out.println("\t\t\t3. Delete Customer");
			System.out.println("\t\t\t4. Customers List");
			System.out.println("\t\t\t5. Exit");
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			switch (i) {
			case 0:
				listAllEmployees();
				break;
			case 1:
				getTeam();
				break;
			case 2:
				addMember();
				break;
			case 3:
				deleteMember();
				break;
			case 4:
				System.out.println("Are you sure?[y/n] default y");
				Scanner s = new Scanner(System.in);
				String it = s.next();
				if(it=="y" || it=="yes" || it=="Y") {
					isFlag = false;
					System.out.println("Exit!");
					break;
				}
				
			}
		}
	}
	private void listAllEmployees() {
		System.out.println("ID\t姓名\t年龄\tHP\t职业\t状态\t补给\t策略\t宝物");
		System.out.println(listSvc.getAllEmployees().toString());
	}
	private void getTeam() {
		System.out.println(teamSvc.getTeam().toString());
	}
	private void addMember() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Input id:");
			int id = scan.nextInt();
			System.out.println("Input name:");
			String name = scan.next();
			System.out.println("Input age:");
			int age = scan.nextInt();
			System.out.println("Input hp:");
			double hp = scan.nextDouble();
			teamSvc.addMember(new Employee(id, name, age, hp));
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void deleteMember() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Input deleted id:");
			int removeId = scan.nextInt();
			teamSvc.removeMember(removeId);
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TeamView teamView = new TeamView();
		teamView.enterMainMenu();
	}
}

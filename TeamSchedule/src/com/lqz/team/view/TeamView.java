package com.lqz.team.view;

//import java.util.Scanner;

import com.lqz.team.domain.Employee;
import com.lqz.team.domain.Warrior;
import com.lqz.team.service.NameListService;
import com.lqz.team.service.TeamException;
import com.lqz.team.service.TeamService;

public class TeamView {
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	
	public void enterMainMenu() {
		boolean isFlag=true;
		while(isFlag) {
			System.out.println("--------------------------尽入吾彀中矣--------------------------");
			System.out.println("\t\t\t0. 壮士姓甚名谁");
			System.out.println("\t\t\t1. 进击的squad");
			System.out.println("\t\t\t2. Add Customer");
			System.out.println("\t\t\t3. 卸甲归田Delete");
			System.out.println("\t\t\t4. Exit");
//			Scanner scan = new Scanner(System.in);
//			int i = scan.nextInt();
			int i = TSUtility.readInt();
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
//				Scanner s = new Scanner(System.in);
				Character it = TSUtility.readConfirmSelection();
				if(it=='y' || it=='Y') {
					isFlag = false;
					System.out.println("Exit!");
				}
				break;
			}
		}
	}
	private void listAllEmployees() {
		System.out.println("ID\t姓名\t年龄\tHP\t\t职业\t\t状态\t\t补给\t策略\t宝物");
		Employee[] emps = listSvc.getAllEmployees();
		for (int i=0; i<emps.length; i++) {
			System.out.println(emps[i].toString());
		}
	}
	private void getTeam() {
		System.out.println("MID\t姓名\t年龄\tHP\t\t职业\t\t状态\t\t补给\t策略\t宝物");
		Warrior[] tms = teamSvc.getTeam();
		for (int i=0; i<tms.length; i++) {
			System.out.println(tms[i].getTeamString());
		}
//		System.out.println(teamSvc.getTeam().toString());
	}
	private void addMember() {
		System.out.println("Input id:");
		int id = TSUtility.readInt()-1;
		try {
			Employee emp = listSvc.getEmployee(id);
			teamSvc.addMember(emp);
//			System.out.println(emp.toString());
			System.out.println("承蒙仁兄抬爱, "+emp.getName()+", 自来也!");
		} catch (TeamException e) {
			// TODO: handle exception
			System.out.println("Oh Baby, baby it\'s a wild world： "+e.getMessage());
		}
		
//		try (Scanner scan = new Scanner(System.in)) {
//			System.out.println("Input id:");
//			int id = scan.nextInt();
//			System.out.println("Input name:");
//			String name = scan.next();
//			System.out.println("Input age:");
//			int age = scan.nextInt();
//			System.out.println("Input hp:");
//			double hp = scan.nextDouble();
//			teamSvc.addMember(new Employee(id, name, age, hp));
//		} catch (TeamException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	private void deleteMember() {
		System.out.println("Input delete member Id:");
		int removeId = TSUtility.readInt();
		try {
			teamSvc.removeMember(removeId);
		} catch (TeamException e) {
			// TODO: handle exception
			System.out.println("查无此人： "+e.getMessage());
		}
		
//		try (Scanner scan = new Scanner(System.in)) {
//			System.out.println("Input deleted id:");
//			int removeId = scan.nextInt();
//			teamSvc.removeMember(removeId);
//		} catch (TeamException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public static void main(String[] args) {
		TeamView teamView = new TeamView();
		teamView.enterMainMenu();
	}
}

package com.lqz.team.service;

import com.lqz.team.domain.BOOK;
import com.lqz.team.domain.Commander;
import com.lqz.team.domain.Employee;
import com.lqz.team.domain.Equipment;
import com.lqz.team.domain.MOUNT;
import com.lqz.team.domain.Remedial;
import com.lqz.team.domain.TAO;
import com.lqz.team.domain.WEAPON;
import com.lqz.team.domain.Warrior;

public class NameListService {
	private Employee[] employees;
	public NameListService() {
		employees = new Employee[Data.EMPLOYEES.length];
		for (int i=0; i<Data.EMPLOYEES.length; i++) {
//			System.out.println(Integer.parseInt(Data.EMPLOYEES[i][0]));
			switch (Integer.parseInt(Data.EMPLOYEES[i][0])) {
			case Data.EMPLOYEE:
				employees[i] = new Employee(
					Integer.parseInt(Data.EMPLOYEES[i][1]),
					Data.EMPLOYEES[i][2],
					Integer.parseInt(Data.EMPLOYEES[i][3]),
					Double.parseDouble(Data.EMPLOYEES[i][4]));
				break;
			case Data.WARRIOR:
				employees[i] = new Warrior(
						Integer.parseInt(Data.EMPLOYEES[i][1]),
						Data.EMPLOYEES[i][2],
						Integer.parseInt(Data.EMPLOYEES[i][3]),
						Double.parseDouble(Data.EMPLOYEES[i][4]),
						initEquipment(i));
				break;
			case Data.REMEDIAL:
				employees[i] = new Remedial(
						Integer.parseInt(Data.EMPLOYEES[i][1]),
						Data.EMPLOYEES[i][2],
						Integer.parseInt(Data.EMPLOYEES[i][3]),
						Double.parseDouble(Data.EMPLOYEES[i][4]),
						initEquipment(i),
						Double.parseDouble(Data.EMPLOYEES[i][5])
						);
				break;
			case Data.COMMANDER:
				employees[i] = new Commander(Integer.parseInt(Data.EMPLOYEES[i][1]),
						Data.EMPLOYEES[i][2],
						Integer.parseInt(Data.EMPLOYEES[i][3]),
						Double.parseDouble(Data.EMPLOYEES[i][4]),
						initEquipment(i),
						Double.parseDouble(Data.EMPLOYEES[i][5]),
						Double.parseDouble(Data.EMPLOYEES[i][6]));
				break;
			}
			
			
		}
		
	}
	/**
	 * @Author lqz
	 * @Date Feb 22, 2022 12:33:54 PM
	 * @Description initial equipments for all members
	 * @return Equipment
	 */
	private Equipment initEquipment(int i) {
		Equipment equip = new WEAPON(Data.EQUIPMENTS[0][1], Data.EQUIPMENTS[0][2]);
		for (int j=0; j<Data.EQUIPMENTS.length;j++) {
			String belongId = Data.EQUIPMENTS[j][3];
//			System.out.println(belongId+" and "+Data.EQUIPMENTS[j][1]+" j "+j);
			if(belongId != null) {
				if(Integer.parseInt(belongId)==i) {
					switch (Integer.parseInt(Data.EQUIPMENTS[j][0])) {
					case 20:
						equip = new TAO(Data.EQUIPMENTS[j][1], Data.EQUIPMENTS[j][2]);
						break;
					case 21:
						equip = new BOOK(Data.EQUIPMENTS[j][1], Data.EQUIPMENTS[j][2]);
						break;
					case 22:
						equip = new WEAPON(Data.EQUIPMENTS[j][1], Data.EQUIPMENTS[j][2]);
						break;
					case 23:
						equip = new MOUNT(Data.EQUIPMENTS[j][1], Data.EQUIPMENTS[j][2]);
						break;
						}
					}
				}
			}
			return equip;
		}
	
	public Employee[] getAllEmployees() {
		return employees;
	}
	public Employee getEmployee(int id) throws TeamException{
		return employees[id];
	}
	
}

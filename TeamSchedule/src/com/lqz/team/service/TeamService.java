package com.lqz.team.service;

import com.lqz.team.domain.Commander;
import com.lqz.team.domain.Employee;
import com.lqz.team.domain.Remedial;
import com.lqz.team.domain.Warrior;

/**
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 22, 2022 6:13:03 PM
 * @Description 小队成员管理：展示、添加、删除、统计
 */
public class TeamService {
	private static int counter = 1;
	private final int MAX_MEMBER = 5;
	private Warrior[] team = new Warrior[MAX_MEMBER];
	private int total = 0;
	
	/**
	 * @Author lqz
	 * @Date Feb 22, 2022 7:31:10 PM
	 * @Description 展示小队成员
	 * @return
	 */
	public Warrior[] getTeam() {
		Warrior[] squad = new Warrior[total];
		for (int i=0; i<total; i++) {
			squad[i] = team[i];
		}
		return squad;
	}
	/**
	 * @Author lqz
	 * @Date Feb 22, 2022 7:30:30 PM
	 * @Description 添加小队成员
	 * @param e
	 * @throws TeamException
	 */
	public void addMember(Employee e) throws TeamException{
		//已员满，不添加
		if (total==team.length) {
			throw new TeamException("车如流水马应龙");
		}
		//非壮士，不添加
		if (!(e instanceof Warrior)) {
			throw new TeamException("四十万人齐卸甲，竟无一个Warrior");
		}
		//已入队，休假ing，不添加 老大嫁作贾人妇
//		System.out.println(e.getName());
		Warrior emp = (Warrior)e;
		if (emp.getStatus() == Status.INTEAM) {
			throw new TeamException(emp.getName()+
					": 始欲南去楚，又將西適秦。早知解散後 各自有 際遇作導遊 奇就奇在 接受了 各自有路走");
		}else if (emp.getStatus() == Status.UNAVAILABLE) {
			throw new TeamException(emp.getName()+": 小舟从此逝，江海余生");
		}
		//至多有: Commander: 1，Remedial: 1，Warrier: 4.
		int[] numOf = aggregation();
//		System.out.println(numOf[0]+" "+numOf[1]+" "+numOf[2]);
		if (e instanceof Commander && numOf[2] >= 1) {
			throw new TeamException(emp.getName()+": 一将功成万骨枯");
		}else if(e instanceof Remedial && numOf[1] >= 1) {
			throw new TeamException(emp.getName()+": 治病不蕲三折肱");
		}else if(e instanceof Warrior && numOf[0]>=4) {
			throw new TeamException(emp.getName()+": 桐風驚心壯士苦");
		}


		if (emp.getStatus() == Status.FREE) {
			team[total++] = emp;
			emp.setStatus(Status.INTEAM);
			emp.setMemberId(counter++);
//			counter += 1;
		}else {
			throw new TeamException("世界真奇妙");
		}
	}
	/**
	 * @Author lqz
	 * @Date Feb 22, 2022 8:25:56 PM
	 * @Description 删除小队成员
	 * @param memberId
	 * @throws TeamException
	 */
	public void removeMember(int memberId) throws TeamException{
		int i;
		for (i=0; i<total; i++) {
//			System.out.println("mem:"+memberId+"i:"+i+"teamlen"+team.length);
			if (memberId == team[i].getMemberId()) {
				team[i].setStatus(Status.FREE);
				break;//out of for loop
			}
		}
		if(i==total) {
			throw new TeamException("鸟啼花落人何在，竹死桐枯凤不来");
		}
		for (int j=i; j<total-1; j++) {
			team[j]=team[j+1];
			team[j].setMemberId(team[j+1].getMemberId()-1);
		}
		total -= 1;
		team[total]=null;
		counter -= 1;
//		System.out.println(memberId+"\t"+team[i].getMemberId());

		
	}
	/**
	 * @Author lqz
	 * @Date Feb 22, 2022 9:32:30 PM
	 * @Description 统计小队成员
	 * @return
	 */
	public int[] aggregation() {
		int numOfWarrior=0, numOfRemedial=0, numOfCommander=0;
		for (int i=0; i<total; i++) {
			if(team[i] instanceof Commander) {
				numOfWarrior++;
			}else if (team[i] instanceof Remedial) {
				numOfRemedial++;
			}else if (team[i] instanceof Warrior) {
				numOfCommander++;
			}
		}
		return new int[] {numOfWarrior, numOfRemedial, numOfCommander};
	}
	public int getTotal() {
		return total;
	}
}

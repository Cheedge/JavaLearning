package com.lqz.cim.ui;

import com.lqz.cim.bean.Customer;
import com.lqz.cim.service.CustomerList;
import com.lqz.cim.util.CMUtility;

/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 16, 2022 11:34:07 PM
 * @Description
 */
public class CustomerView {
	private CustomerList customerList = new CustomerList(10);
	/**
	 * 显示主菜单，响应用户输入，
	 * 根据用户操作分别调用其他相应的成员方法（如addNewCustomer），
	 * 以完成客户信息处理。
	 * @Author lqz
	 * @Date Feb 16, 2022 11:35:50 PM
	 * @Description
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("--------------------------Customer Manager--------------------------");
			System.out.println("\t\t\t1. Add Customer");
			System.out.println("\t\t\t2. Modify Customer");
			System.out.println("\t\t\t3. Delete Customer");
			System.out.println("\t\t\t4. Customers List");
			System.out.println("\t\t\t5. Exit");
			char menu = CMUtility.readMenuSelection();
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.println("Confirm Exit: default is Y, [Y]/N");
				char yOrN = CMUtility.readChar('Y');
				if (yOrN=='Y') {
					isFlag = false;
					System.out.println("Exit!");
				}
			}
		}

	}
	/**
	 * 这四个方法分别完成
	 * “添加客户”、“修改客户”、
	 * “删除客户”和“客户列表”等各菜单功能。
	 * 这四个方法仅供enterMainMenu()方法调用。
	 * @Author lqz
	 * @Date Feb 16, 2022 11:38:22 PM
	 * @Description
	 */
	private void addNewCustomer() {
		System.out.println("--------------------------Add Customer--------------------------");
		System.out.println("Name:");
		String name = CMUtility.readString(10);
		System.out.println("Gender:");
		char gender = CMUtility.readChar();
		System.out.println("Age:");
		int age = CMUtility.readInt();
		System.out.println("Phone:");
		String phone = CMUtility.readString(13);
		System.out.println("Email:");
		String email = CMUtility.readString(30);
		
		// 增加一个客户
		Customer cust = new Customer(name, gender, age, phone, email);
		// 加入列表中
		boolean isnotFull = customerList.addCustomer(cust);
		// 客户已满
		if(isnotFull) {
			System.out.println("\nSuccessfully add customer\n");
		}else {
			System.out.println("\nUnsuccessfully add customer, exceed the capacity of list\n");
			System.out.println(customerList.getTotal());
		}
		
	}
	private void modifyCustomer() {
		System.out.println("--------------------------Modify Customer--------------------------");
		System.out.println("Input Modify Customer Number:");
		int num = CMUtility.readInt();
		int total = customerList.getTotal();
		if (num>total) {
			System.out.println("Not in customer list, please input right Customer Number");
		}else {
			Customer modifyCustomer = customerList.getCustomer(num-1);
			System.out.println("'Name' input 1, 'Age' input 2, 'Gender' input 3"
					+ "'Phone' input 4, 'Email' input 5:\n");
			int modifyChoose = CMUtility.readInt();
			System.out.println("Modified: ");
			switch (modifyChoose) {
			case 1:
				String name = CMUtility.readString(30);
				modifyCustomer.setName(name);
				break;
			case 2:
				int age = CMUtility.readInt();
//				System.out.println("Modified: ");
				modifyCustomer.setAge(age);
				break;
			case 3:
				char gender = CMUtility.readChar();
//				System.out.println("Modified: ");
				modifyCustomer.setGender(gender);
				break;
			case 4:
				String phone = CMUtility.readString(30);
//				System.out.println("Modified: ");
				modifyCustomer.setPhone(phone);
				break;
			case 5:
				String email = CMUtility.readString(30);
//				System.out.println("Modified: ");
				modifyCustomer.setEmail(email);
				break;
			}
			System.out.println("Successfully modify customer");
		}
	}
	private void deleteCustomer() {
		System.out.println("--------------------------Delete Customer--------------------------");
		System.out.println("Input Delete Customer Number:");
		int target = CMUtility.readInt()-1;
		int total = customerList.getTotal();
		if(target<total) {
			for (int i=target-2; i<total; i++) {
				customerList.deleteCustomer(i);
			}
			System.out.println("Successfully delete customer");
		}else {
			System.out.println("Not in customer list, please input right Customer Number");
		}
	}
	private void listAllCustomers() {
//		CustomerList custList = new CustomerList();
		
		System.out.println("--------------------------Customer Info--------------------------");
		System.out.println("Number\tName\tAge\tGender\tPhone\t\t4Email");
		int total = customerList.getTotal();
		if(total==0) {
			System.out.println("\nNo customer yet!\n");
		}else {
			Customer[] custs = customerList.getAllCustomers();
			for (int i=0; i<custs.length; i++) {
			System.out.println((i+1)+"\t"+
							custs[i].getName()+"\t"+
							custs[i].getAge()+"\t"+
							custs[i].getGender()+"\t"+
							custs[i].getPhone()+"\t\t"+
							custs[i].getEmail());
			}
			System.out.println("Successfully show all customers!\n");
		}
		
	}
	/**
	 * 创建CustomerView实例，
	 * 并调用 enterMainMenu()方法以执行程序。
	 * @Author lqz
	 * @Date Feb 16, 2022 11:39:20 PM
	 * @Description
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}

}

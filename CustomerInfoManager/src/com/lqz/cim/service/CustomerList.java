package com.lqz.cim.service;

import com.lqz.cim.bean.Customer;

/**
 * 
 * @Author lqz
 * @Email Cheedgelee@gmail.com
 * @Version
 * @Date Feb 16, 2022 10:39:36 PM
 * @Description
 * CustomerList为Customer对象的管理模块，内部使用数组管理一组Customer对象
 */
public class CustomerList {
	private Customer[] customers;//用来保存客户对象的数组
	private int total = 0;		//记录已保存客户对象的数量
	// constructor:__init__
	public CustomerList() {
		
	}
	/**
	 * 构造器，用来初始化customers数组
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer) {
		this.customers = new Customer[totalCustomer];
		this.customers[0] = new Customer("Lily", 'F', 26, "123456", "lily@gmail.com");
		System.out.println("Construct new customer!!!"+customers[0].getName());
//		System.out.println(customers);
	}
	/**
	 * 将参数customer添加到数组中最后一个客户对象记录之后
	 * @Author lqz
	 * @Date Feb 16, 2022 10:51:03 PM
	 * @Description
	 * @param customer指定要添加的客户对象
	 * @return 添加成功返回true；false表示数组已满，无法添加
	 */
	public boolean addCustomer(Customer customer) {
		if(this.total<customers.length) {
			this.customers[total++] = customer;
//			this.total++;
			System.out.println("\nCapacity is "+customers.length+"\nAlready have "+total+" cunstomers.");
			return true;
		}else {
			System.out.println("\nCapacity is "+customers.length+"\nAlready have "+total+" cunstomers.");
			return false;
		}
	}
	/**
	 * 用参数customer替换数组中由index指定的对象
	 * @Author lqz
	 * @Date Feb 16, 2022 10:59:51 PM
	 * @Description
	 * @param index 指定所替换对象在数组中的位置，从0开始
	 * @param cust 指定替换的新客户对象 
	 * @return 替换成功返回true；false表示索引无效，无法替换
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index<0 || index>=this.total) return false;
		this.customers[index] = cust;
		return true;
	}
	/**
	 * 从数组中删除参数index指定索引位置的客户对象记录
	 * @Author lqz
	 * @Date Feb 16, 2022 11:06:34 PM
	 * @Description
	 * @param index 指定所删除对象在数组中的索引位置，从0开始
	 * @return 删除成功返回true；false表示索引无效，无法删除
	 */
	public boolean deleteCustomer(int index) {
		if(index<0 || index>=this.total) return false;
		for(int i=index; i<this.total-1; i++) {
			customers[i] = customers[i+1];
		}
//		customers[this.total-1]=null;
//		this.total--;
		customers[--this.total]=null;
		return true;
	}
	// getter
	/**
	 * 返回数组中记录的所有客户对象
	 * @Author lqz
	 * @Date Feb 16, 2022 11:07:54 PM
	 * @Description 非customers因为customers包含所有空
	 * @return Customer[]数组中包含了当前所有客户对象，
	 * 			该数组长度与对象个数相同。
	 */
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[this.total];
		for (int i=0; i<this.total;i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	/**
	 * 返回参数index指定索引位置的客户对象记录
	 * @Author lqz
	 * @Date Feb 16, 2022 11:09:48 PM
	 * @Description
	 * @param index 指定所要获取的客户在数组中的索引位置，从0开始
	 * @return 封装了客户信息的Customer对象
	 */
	public Customer getCustomer(int index) {
		if(index<0 || index>=this.total) return null;
		Customer cust = customers[index];
		return cust;
	}
	public int getTotal() {
		return this.total;
	}

}

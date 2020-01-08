package edu.krish.java8;

public class Employee {
	  	String name;
	  	String address;
	    int age;
	    double salary;
	    long mobile;
	    
	    
		public Employee(String name, String address, int age, double salary, long mobile) {
			super();
			this.name = name;
			this.address = address;
			this.age = age;
			this.salary = salary;
			this.mobile = mobile;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}
		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}
		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}
		/**
		 * @return the salary
		 */
		public double getSalary() {
			return salary;
		}
		/**
		 * @param salary the salary to set
		 */
		public void setSalary(double salary) {
			this.salary = salary;
		}
		/**
		 * @return the mobile
		 */
		public long getMobile() {
			return mobile;
		}
		/**
		 * @param mobile the mobile to set
		 */
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", address=" + address + ", age=" + age + ", salary=" + salary + ", mobile=" + mobile + "]";
		}
	 
}

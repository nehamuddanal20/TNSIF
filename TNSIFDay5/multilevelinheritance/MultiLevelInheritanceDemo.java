package multilevelinheritance;

import java.util.Date;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Neha",897878676,new Date(2000,12,2));
		System.out.println(p1);
		
		
		p1 = new Employee("Gita", 78653412, new Date(1995,05,07),"Sales",45000);
		System.out.println(p1);
		
		p1= new LevelOneEmployee("Madhu", 897865456, new Date(1988,15,02),"Account",850000,20,"Signing Authority");
		System.out.println(p1);

	}

}
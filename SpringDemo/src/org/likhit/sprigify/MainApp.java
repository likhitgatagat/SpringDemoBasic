package org.likhit.sprigify;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.likhit.entity.Address;
import com.likhit.entity.Employee;
import com.likhit.entity.Shape;
import com.likhit.entity.Student;
import com.likhit.entity.Subject;
import com.likhit.shapes.Triangle;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		//TaskExecutorExample taskExecutor = (TaskExecutorExample)context.getBean("taskExecutorExample");
		//taskExecutor.printMessage();
		//Shape triangle = (Triangle) context.getBean("triangle");
		//triangle.printShape();
		
		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getAddress().toString());
		emp.printSkillSet();
		emp.printProjects();
		emp.printDetailedSkillSet();
		
		Employee emp2 = (Employee) context.getBean("employee");
		emp2.setAddress((Address) context.getBean("address2"));
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
		System.out.println(emp2.getAddress().toString());
		emp2.printSkillSet();
		emp2.printProjects();
		emp2.printDetailedSkillSet();
		
		Student std1 = (Student) context.getBean("student1");
		System.out.println(std1.toString());
		System.out.println(std1.getAddress().toString());
		Set<Subject> subjects = std1.getSubjects();
		Iterator<Subject> itr = subjects.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getName());
		}
		std1.printTeachers();
		context.close();
	}

}

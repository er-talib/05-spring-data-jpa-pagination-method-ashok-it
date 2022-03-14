package com.pagination.method.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.pagination.method.jpa.entityes.Student;
import com.pagination.method.jpa.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository bean = context.getBean(StudentRepository.class);
		/* data add in db
		Student student = new Student(12345,"Muhammad Talib","Hapur","9876543202");
		Student student2 = new Student(12346,"Aleem","Hapur","5678543202");
		Student student3 = new Student(12347,"Atul","Rajasthan","9546543202");
		Student student4 = new Student(12348,"Talib","M P","9846843202");
		Student student5 = new Student(12349,"Zaid","Delhi","74567833322");
		Student student6 = new Student(123410,"Abdul","U P","9512321102");
		Student student7 = new Student(123411,"Muhammad ","Pilakhwa","7865343202");
		Student student8 = new Student(123412,"Kadar","Hapur","9087643202");
		Student student9 = new Student(123413,"Keshav","Haryana","9976443202");
		Student student10 = new Student(123414,"Sobeer","M P","6321243202");
		Student student11 = new Student(123415,"Sumit","U P","77832133322");
		Student student12= new Student(1234116,"Abdul Ahmad","Delhi","9123421102");
		
		List<Student> list = new ArrayList<>();
           list.add(student);
           list.add(student2);
           list.add(student3);
           list.add(student4);
           list.add(student5);
           list.add(student6);
           list.add(student7);
           list.add(student8);
           list.add(student9);
           list.add(student10);
           list.add(student11);
           list.add(student12);
           
           bean.saveAll(list);
           */
        
		//check sequence 
//           Student s = new Student();
//           s.setStuName("abd");
//           s.setPhone("1234223344");
//           s.setStuAddress("Xyz");
//           
//           Student save = bean.save(s);
//           System.out.println(save);

		
		int pageSize = 5 ;
		int pageNo = 0 ;
		
		PageRequest request = PageRequest.of(pageNo, pageSize);
		Page<Student> pageData= bean.findAll(request);
		
		int pages = pageData.getTotalPages();
		System.out.println(pages + " Total pages ");
		
		List<Student> content = pageData.getContent();
		System.out.println(content);
		
		


	}

}

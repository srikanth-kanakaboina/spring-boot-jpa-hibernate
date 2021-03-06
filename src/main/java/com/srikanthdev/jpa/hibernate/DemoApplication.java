package com.srikanthdev.jpa.hibernate;

import com.srikanthdev.jpa.hibernate.model.Course;
import com.srikanthdev.jpa.hibernate.repository.CourseRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	private org.slf4j.Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    public CourseRepository courseRepository;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Course course=courseRepository.findById(10001L);
		logger.info("Course 10001->{}",course);
		courseRepository.save(new Course("Microservices in 100 Steps"));

	}
}

package yashtojava.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import yashtojava.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandlineRunner implements CommandLineRunner {
//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "learn react", "by_muskan"));
		repository.save(new Course(2, "learn python", "by_yash"));
		repository.save(new Course(3, "learn java", "by_ayush"));
		repository.save(new Course(4, "learn cpp", "by_yash"));

		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("by_yash"));


	}

}

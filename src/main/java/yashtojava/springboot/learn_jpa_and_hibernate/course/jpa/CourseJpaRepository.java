package yashtojava.springboot.learn_jpa_and_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import yashtojava.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
@Transactional
public class CourseJpaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course);
	}

	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}

	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		 entityManager.remove(course);
	}

}

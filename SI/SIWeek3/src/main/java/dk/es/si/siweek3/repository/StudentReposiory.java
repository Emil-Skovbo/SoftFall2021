package dk.es.si.siweek3.repository;

import dk.es.si.siweek3.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentReposiory extends JpaRepository<Student,Long> {

}

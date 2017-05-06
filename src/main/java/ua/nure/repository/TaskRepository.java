package ua.nure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.nure.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{
}

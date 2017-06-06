package ua.nure.service;

import org.junit.runner.Result;
import ua.nure.model.Task;
import ua.nure.model.TaskStatistic;
import ua.nure.model.User;

import java.io.InputStream;
import java.util.List;
import java.util.Set;

public interface TaskService {
    void save(Task task, InputStream source, InputStream test, Set<String> labels);
    Task findOne(Long id);
    boolean exists(Long id);
    List<Task> findAll();
    TaskStatistic findOrCreateStatistic(User user, Task task);
    Result verify(String solution, Task task) throws Exception;
    void saveStatistic(TaskStatistic statistic);
}

package main.workgroup.repository;

import main.workgroup.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository <Worker,Long> {
}

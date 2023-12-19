package main.workgroup.repository;

import main.workgroup.dto.WorkerInfo;
import main.workgroup.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkerRepository extends JpaRepository <Worker,Long> {
//   @Query("SELECT new main.workgroup.dto.WorkerInfo(w.id, w.lastName) FROM Worker w")
//    List<WorkerInfo> findAllWorkerInfo();
}

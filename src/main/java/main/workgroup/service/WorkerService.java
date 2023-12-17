package main.workgroup.service;

import lombok.Data;
import main.workgroup.model.Worker;
import main.workgroup.repository.WorkerRepository;
import org.springframework.stereotype.Service;
@Data
@Service
public class WorkerService {
 private final WorkerRepository workerRepository;
    public Worker createWorker(Worker worker) { return workerRepository.save(worker);}
}

package main.workgroup.service;

import main.workgroup.dto.WorkerInfo;
import main.workgroup.mapper.WorkerConvertor;
import main.workgroup.model.Worker;
import main.workgroup.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class WorkerService {
    private final WorkerRepository workerRepository;
    private final WorkerConvertor workerConvertor;


    public WorkerService(WorkerRepository workerRepository, WorkerConvertor workerConvertor) {
        this.workerRepository = workerRepository;
        this.workerConvertor = workerConvertor;
    }

    public Worker createWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    public Optional<Worker> getWorkerById(Long id) {
        return workerRepository.findById(id);
    }

    public List<WorkerInfo> getShortInfoWorker() {
        List<Worker> workers = workerRepository.findAll();
        List<WorkerInfo> workerInfos = new ArrayList<>();

        for (Worker worker : workers) {
            WorkerInfo workerInfo = WorkerConvertor.convertToWorkerInfo(worker);
            workerInfos.add(workerInfo);
        }

        return workerInfos;
    }
}
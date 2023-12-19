package main.workgroup.mapper;

import main.workgroup.dto.WorkerInfo;
import main.workgroup.model.Worker;
import org.springframework.stereotype.Component;

@Component
public class WorkerConvertor {
    public static WorkerInfo convertToWorkerInfo(Worker worker) {
        WorkerInfo dto=new WorkerInfo();
        dto.setId(worker.getId());
        dto.setLastName(worker.getLastName());
        return dto;
    }
}

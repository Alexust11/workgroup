package main.workgroup.controller;

import lombok.Data;
import main.workgroup.model.Worker;
import main.workgroup.service.WorkerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Data
@RestController
@RequestMapping("/worker")
public class WorkerController {
  private final WorkerService workerService;

    @PostMapping("/income")
    public ResponseEntity<String> createWorker(@RequestBody Worker worker) {
        if (worker.getFirstName() == null || worker.getLastName() == null ||  Objects.isNull(worker.getDateOfBirth())) {
            return ResponseEntity.badRequest().body("Missing or invalid parameters");
        }
        if (StringUtils.isBlank(worker.getFirstName()) || StringUtils.isBlank(worker.getLastName())) {
            return ResponseEntity.badRequest().body("Введен пустой параметр для Имени или Фамилии");
        }
        try {
            Worker createdWorker = workerService.createWorker(worker);
            return ResponseEntity.ok(createdWorker.toString());
        }
     catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
    }
    }

}

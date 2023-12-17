package main.workgroup.model;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
@Data
public class Worker {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String firstName;// имя
   private String lastName;//фамилия
   private String patronymic;// отчество
   private LocalDate dateOfBirth;// дата рождения
   private String email;
   private String phone;

}

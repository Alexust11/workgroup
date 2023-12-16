package main.workgroup.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

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

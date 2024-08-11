package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Patient {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   private String name;

   @Column
   private int age;

   @Column
   private String diagnoses;

   @Column(nullable = false)
   @Enumerated(EnumType.STRING)
   private GENDER gender;





   @Override
   public String toString() {
      return "Patient{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", age=" + age +
              ", diagnoses='" + diagnoses + '\'' +
              ", gender=" + gender +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Patient patient = (Patient) o;
      return age == patient.age && Objects.equals(id, patient.id) && Objects.equals(name, patient.name) && Objects.equals(diagnoses, patient.diagnoses) && gender == patient.gender;
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, age, diagnoses, gender);
   }
}

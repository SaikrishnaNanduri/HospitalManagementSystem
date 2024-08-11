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
public class Doctor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column
  private int age;

  @Column(nullable = false)
  private String speciality;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private GENDER gender;

  @Column(nullable = true)
  private Long mobile;

  @ManyToOne
  @JoinColumn(name = "department_id",nullable = false)
  private Department department;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && Objects.equals(id, doctor.id) && Objects.equals(name, doctor.name) && Objects.equals(speciality, doctor.speciality) && gender == doctor.gender && Objects.equals(mobile, doctor.mobile) && Objects.equals(department, doctor.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, speciality, gender, mobile, department);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", speciality='" + speciality + '\'' +
                ", gender=" + gender +
                ", mobile=" + mobile +
                ", department=" + department +
                '}';
    }
}

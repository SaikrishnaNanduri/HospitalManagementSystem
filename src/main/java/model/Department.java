package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;


    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL,orphanRemoval =true)
    private List<Doctor> doctorList;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(doctorList, that.doctorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, doctorList);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doctorList=" + doctorList +
                '}';
    }
}

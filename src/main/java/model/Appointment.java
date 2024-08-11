package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.jdbc.core.metadata.HsqlTableMetaDataProvider;

import java.util.Date;
import java.util.Objects;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduledDate;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date completedDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private STATUS status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(id, that.id) && Objects.equals(patient, that.patient) && Objects.equals(doctor, that.doctor) && Objects.equals(scheduledDate, that.scheduledDate) && Objects.equals(completedDate, that.completedDate) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patient, doctor, scheduledDate, completedDate, status);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", patient=" + patient +
                ", doctor=" + doctor +
                ", scheduledDate=" + scheduledDate +
                ", completedDate=" + completedDate +
                ", status=" + status +
                '}';
    }
}


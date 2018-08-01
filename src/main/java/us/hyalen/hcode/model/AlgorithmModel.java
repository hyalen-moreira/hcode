package us.hyalen.hcode.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ALGORITHM")
@Data
public class AlgorithmModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

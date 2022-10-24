package at.fhtw.swen3.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorDal {
    @Column
    private String errorMessage;

    @Column
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Long id;
}

package at.fhtw.swen3.persistence.entity.old;

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
public class ErrorEntity {
    @Column
    private String errorMessage;

    @Column
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    private Long id;

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorEntity errorEntity = (ErrorEntity) o;
        return errorMessage.equals(errorEntity.errorMessage);
    }*/
}

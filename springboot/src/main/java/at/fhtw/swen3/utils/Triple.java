package at.fhtw.swen3.utils;

import lombok.*;

import javax.persistence.Entity;

//@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Triple<T1, T2, T3> {
    /*public Triple() {}
    public Triple(T1 value1, T2 value2, T3 value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }*/
    private T1 value1;
    private T2 value2;
    private T3 value3;
}

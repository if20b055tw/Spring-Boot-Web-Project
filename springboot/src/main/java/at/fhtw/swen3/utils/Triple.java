package at.fhtw.swen3.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triple<T1, T2, T3> {
    public Triple(T1 value1, T2 value2, T3 value3){
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
    T1 value1;
    T2 value2;
    T3 value3;
}

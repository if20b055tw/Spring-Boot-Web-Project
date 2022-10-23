package at.fhtw.swen3.services.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public abstract class GenericMapperTest<S, T> {
    public abstract GenericMapper<S, T> getMapper();
    public abstract S getSource();
    public abstract T getTarget();

    @Test
    public void testToTarget() {
        T target = getMapper().mapToTarget(getSource());
        assertEquals(getTarget(), target);
    }

    @Test
    public void testToSource() {
        S source = getMapper().mapToSource(getTarget());
        assertEquals(getSource(), source);
    }
}

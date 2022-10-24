package at.fhtw.swen3.services.mapper;

public interface GenericMapper<S, T> {
    T mapToTarget(S object);
    S mapToSource(T object);
}

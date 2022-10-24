package at.fhtw.swen3.services.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMapper<S, T> implements GenericMapper<S,T> {
    public List<T> mapToTarget(Collection<S> collection) {
        List<T> targets = new ArrayList<>();
        collection.forEach(o -> targets.add(mapToTarget(o)));
        return targets;
    }

    public List<S> mapToSource(Collection<T> collection) {
        List<S> sources = new ArrayList<>();
        collection.forEach(o -> sources.add(mapToSource(o)));
        return sources;
    }
}

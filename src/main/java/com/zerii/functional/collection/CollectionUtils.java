package com.zerii.functional.collection;

import com.zerii.functional.Function1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zerii
 */
public final class CollectionUtils {

    private CollectionUtils() {
    }

    public static <A, B> List<B> map(List<A> origin, Function1<A, B> f) {
        List<B> result = new ArrayList<>();
        if (origin == null) {
            return result;
        }
        for (A a : origin) {
            result.add(f.apply(a));
        }
        return result;
    }

    public static <E> List<E> findAll(List<E> origin, Function1<E, Boolean> f) {
        throw new UnsupportedOperationException("TODO");
    }
}

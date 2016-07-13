package com.zerii.functional.collection;

import com.zerii.functional.Function1;

/**
 *
 * @author zerii
 * @param <E> 要素の型
 */
public interface IFilter<E> extends Function1<E, Boolean> {

    @Override
    public Boolean apply(E param1);
}

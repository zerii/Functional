package com.zerii.functional;

/**
 * 一変数関数を定義するインタフェースです。
 *
 * @author zerii
 * @param <T1> 引数の型
 * @param <R> 戻り値の型
 */
public interface Function1<T1, R> {

    /**
     * 関数の結果を求めます。
     *
     * @param param1 パラメーター
     * @return 関数の戻り値
     */
    R apply(T1 param1);
}

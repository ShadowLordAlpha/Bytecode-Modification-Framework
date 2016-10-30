package io.github.bmf.util;

/**
 * Boxed generic type T
 * 
 * @param <T>
 */
public class Box<T> {
    public T value;

    public Box() {
        this(null);
    }

    public Box(T value) {
        this.value = value;
    }

    //
    // Static builders
    //

    public static Box<String> string(String s) {
        return new Box<String>(s);
    }
}
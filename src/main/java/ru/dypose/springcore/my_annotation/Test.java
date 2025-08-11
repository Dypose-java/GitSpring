package ru.dypose.springcore.my_annotation;


@Author(name = "name", age = 15)
public class Test {

}


@Deprecated
@MyAnnotation
class TestAnnotation {
    @Deprecated
    @MyAnnotation
    private String name;

    @Deprecated
    @MyAnnotation
    public TestAnnotation(String name) {
        this.name = name;
    }

    @Deprecated
    @MyAnnotation
    private static void checkMethodAnnotation() {
        @MyAnnotation String annotation;
    }

    @Deprecated
    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {

    }
}

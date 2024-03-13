package com.careerit.jfs.oop.override.newfatures;

sealed class Shape permits Circle, Rectangle, Square, Triangle {

}

sealed class Circle extends Shape permits DummyCircle {

}
final class DummyCircle extends Circle {

}

final class Rectangle extends Shape {

}

final class Square extends Shape {

}

final class Triangle extends Shape {

}


public class SealedClassExample {
}
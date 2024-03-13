package com.careerit.jfs.day14;

public class ParseAndTypeCasting {

    public static void main(String[] args) {

        String data = "1001,Manoj,5.8,Developer,300000";
        String[] arr = data.split(",");
        int empno = Integer.parseInt(arr[0]);  // "1001" => 1001
        String name = arr[1];
        double height = Double.parseDouble(arr[2]);
        String desg = arr[3];
        double salary = Double.parseDouble(arr[4]);
        System.out.println("Empno : " + empno);
        System.out.println("Name : " + name);
        System.out.println("Height : " + height);
        System.out.println("Desg : " + desg);
        System.out.println("Salary : " + salary);
        int num = 15;
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Byte "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
        System.out.println("Short "+Short.MIN_VALUE+" "+Short.MAX_VALUE);
        System.out.println("Integer "+Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
        System.out.println("Long "+Long.MIN_VALUE+" "+Long.MAX_VALUE);
        System.out.println("Float "+Float.MIN_VALUE+" "+Float.MAX_VALUE);
        System.out.println("Double "+Double.MIN_VALUE+" "+Double.MAX_VALUE);
        System.out.println("Character "+Character.MIN_VALUE+" "+Character.MAX_VALUE);
        System.out.println("Boolean "+Boolean.TRUE+" "+Boolean.FALSE);

        // Type casting
        // Converting one type to another type is called type casting
        // 1. Implicit type casting (Widening)
        // 2. Explicit type casting (Narrowing)

        // Implicit type casting

        int a = 10;
        float b = a;
        System.out.println(a);
        System.out.println(b);

        float c = 10.99f;
        int d = (int)c;
        System.out.println(c);
        System.out.println(d);
    }

    // byte => Byte,
    // short => Short,
    // int => Integer,
    // long => Long,
    // float => Float,
    // double => Double,
    // char => Character,
    // boolean => Boolean
}

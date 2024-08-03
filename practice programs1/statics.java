class MyClass {
    static {
        System.out.println("Static block 1");
    }

    {
        System.out.println("Instance initializer 1");
    }

    MyClass() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block 2");
    }

    {
        System.out.println("Instance initializer 2");
    }
}

class Hii {
    static {
        System.out.println("Static block hii");
    }

    Hii() {
        System.out.println("Constructor");
    }
}

public class Statics extends MyClass {
    public static void main(String[] args) {
        System.out.println("hey main");
        MyClass obj = new MyClass();
        Hii h = new Hii();
        // MyClass obj2 = new MyClass();
    }
}


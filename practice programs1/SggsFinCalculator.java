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

public class statics{
    public static void main(String[] args) {
        System.out.println("hey main");
        MyClass obj = new MyClass();
    }
}

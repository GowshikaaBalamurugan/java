package innerOuterClasses;

public class OuterClass {
    Integer number=9;
    public void sayHi(){
        System.out.println("Hi..from Outer Class(Super class)");
    }
    public void getMsg(){
        System.out.println("Hi..Its an outer class");
        System.out.println("Hi from Outer class outer method");

        class Inner{
            void InnerMethod(){
                System.out.println("Hi from Inner class inner method");
            }
        }
        Inner inner=new Inner();
        inner.InnerMethod();
    }
    public static class  InnerClass{
        Integer number=9;
        public void getMsg(){
            System.out.println("Hi..Its an inner class");
        }
    }
}

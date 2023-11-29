package innerOuterClasses;

import java.lang.reflect.AnnotatedArrayType;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        outerClass.getMsg();
        //When inner class is non static---need an outerclass obj
      //  OuterClass.InnerClass innerClass=outerClass.new InnerClass();
        //when its static
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        innerClass.getMsg();
        outerClass1.sayHi();
        anonymous.sayHi();
    }
    static OuterClass outerClass1=new OuterClass(){
        @ Override
        public void sayHi() {
            super.sayHi();
            System.out.println("Hi..Its an anonymous class");
        }
        };
   static Anonymous anonymous=new Anonymous() {
        @Override
        public void sayHi() {
            System.out.println("Hi from anonymous interface");
        }
    };
}

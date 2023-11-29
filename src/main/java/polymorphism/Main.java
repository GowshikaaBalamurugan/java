package polymorphism;

public class Main {
    public static void main(String[] args) {
        Parent parent=new Parent();
        parent.display();
        Child child=new Child();
        child.display();
        Parent parent1=new Child();
        parent1.display();
        //Child child1=new Parent();
    }
}

package dsa;

public class Runner {
    public static void main(String[] args) {
//        LinkedList linkedList=new LinkedList();
//        linkedList.insert(5);
//        linkedList.insert(2);
//        linkedList.insert(13);
//        linkedList.insert(90);
//        linkedList.show();
//        System.out.println();
//        linkedList.insertAtStart(901);
//        linkedList.show();
//        System.out.println();
//        linkedList.insertAt(1,900);
//        linkedList.show();
//        System.out.println();
//        linkedList.deleteAt(1);
//        linkedList.show();
//        System.out.println();
//        linkedList.deleteElement(2);
//        linkedList.show();
//          Stack stack=new Stack();
//          stack.pop();
//          stack.push(6);
//          stack.push(5);
//          stack.push(9);
//          stack.push(10);
//          stack.push(16);
//          stack.show();
//          stack.push(10);
//          stack.pop();
//          stack.show();
//          System.out.println(stack.peek());
//          DStack dStack=new DStack();
//          dStack.pop();
//          dStack.push(6);
//          dStack.push(5);
//          dStack.push(9);
//          dStack.push(10);
//          dStack.push(16);
//          dStack.show();
//          dStack.push(10);
//          dStack.push(10);
//          dStack.show();
//
//          dStack.pop();
//          dStack.pop();
//          dStack.pop();
//          dStack.pop();
//
//          dStack.show();
//          System.out.println(dStack.peek());

//          Queue queue=new Queue();
//          queue.deQueue();
//          queue.enQueue(8);
//          queue.enQueue(18);
//          queue.enQueue(81);
//          queue.enQueue(83);
//          queue.enQueue(86);
//          queue.show();
//          queue.enQueue(86);
//          queue.deQueue();
//          queue.show();

          BinaryTree binaryTree=new BinaryTree();
          binaryTree.insert(8);
          binaryTree.insert(7);
          binaryTree.insert(12);
          binaryTree.insert(15);
          binaryTree.insert(2);
          binaryTree.insert(5);
          binaryTree.inOrder();
          binaryTree.preOrder();
          binaryTree.postOrder();


    }
}

import java.util.LinkedList;
import java.util.List;

public class Main {

    /*

     Cracking the Coding Interview - Linked Lists

     2.3 - Delete Middle Node:
     Implement an algorithm to delete a node in the middle (i.e., any node but
     the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
     that node.

    */

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        deleteMiddleNode(list);
        deleteMiddleNode(list2);
    }

    public static void deleteMiddleNode(List<Integer> list) {
        if (list.size() <= 2) {
            System.out.println("No middle element!");
        } else {
            Integer middleElement = 0;
            for (int i = 0; i < list.size(); i++) {
                try {
                    Integer lastElement = list.get(i * 2);
                    middleElement = list.get(i);
                } catch (IndexOutOfBoundsException e) {
                    break;
                }
            }
            list.remove(middleElement);
            list.forEach(System.out::println);
        }
    }
}

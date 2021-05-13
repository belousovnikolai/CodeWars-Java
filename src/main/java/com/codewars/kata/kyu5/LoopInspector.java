package com.codewars.kata.kyu5;

/*
 * Can you get the loop
 * https://www.codewars.com/kata/52a89c2ea8ddc5547a000863
 */

public class LoopInspector {

    // Mock for Node class used in the task
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

        public Node getNext() {
            return next;
        }
    }

    public int loopSize(Node node) {

        Node sNode = node;
        Node fNode = node;

        while (sNode != null && fNode != null && fNode.getNext() != null) {
            sNode = sNode.getNext();
            fNode = fNode.getNext().getNext();

            if (sNode == fNode) {
                int res = 1;
                Node tmp = sNode;

                while(tmp.getNext() != sNode) {
                    res++;
                    tmp = tmp.getNext();
                }
                return res;
            }
        }
        return 0;
    }
}

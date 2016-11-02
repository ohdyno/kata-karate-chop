package me.ohdyno.xing.katas.karatechop.tree.node;

public class NodeFactory {
    public static Node create(int[] numbers, int low, int high) {
        if (low >= high)
            return NullNode.instance();
        else
            return new ValidNode(numbers, low, high);
    }
}

package me.ohdyno.xing.katas.karatechop.tree;

import me.ohdyno.xing.katas.karatechop.tree.node.Node;
import me.ohdyno.xing.katas.karatechop.tree.node.NodeFactory;

class BST {
    private Node root;

    BST(int[] numbers) {
        this.root = NodeFactory.create(numbers,0, numbers.length);
    }

    int find(int key) {
        return find(key, root);
    }

    private int find(int key, Node root) {
        if (root.compareKey(key) == 0)
            return root.getValue();

        if (root.compareKey(key) < 0)
            return find(key, root.left());
        else
            return find(key, root.right());
    }
}


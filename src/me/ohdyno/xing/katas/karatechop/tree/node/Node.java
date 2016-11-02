package me.ohdyno.xing.katas.karatechop.tree.node;

public interface Node {
    Node left();
    Node right();

    int compareKey(int key);
    int getValue();
}

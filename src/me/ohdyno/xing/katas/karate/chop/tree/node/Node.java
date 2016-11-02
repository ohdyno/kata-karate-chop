package me.ohdyno.xing.katas.karate.chop.tree.node;

public interface Node {
    Node left();
    Node right();

    int compareKey(int key);
    int getValue();
}

package me.ohdyno.xing.katas.karatechop.tree;

interface Node {
    Node left();

    Node right();

    int compareKey(int key);

    int getValue();
}

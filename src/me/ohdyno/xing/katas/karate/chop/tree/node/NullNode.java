package me.ohdyno.xing.katas.karate.chop.tree.node;

class NullNode implements Node {

    private static NullNode instance;

    @Override
    public Node left() {
        return this;
    }

    @Override
    public Node right() {
        return this;
    }

    @Override
    public int compareKey(int key) {
        return 0;
    }

    @Override
    public int getValue() {
        return -1;
    }

    static NullNode instance() {
        if (instance == null) {
            instance = new NullNode();
        }

        return instance;
    }
}
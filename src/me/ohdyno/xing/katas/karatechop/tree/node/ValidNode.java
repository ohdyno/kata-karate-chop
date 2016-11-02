package me.ohdyno.xing.katas.karatechop.tree.node;

class ValidNode implements Node {
    private int low, high;
    private int[] numbers;

    ValidNode(int[] numbers, int low, int high) {
        this.numbers = numbers;
        this.low = low;
        this.high = high;
    }

    @Override
    public Node left() {
        return NodeFactory.create(numbers, low, getMid());
    }

    @Override
    public Node right() {
        return NodeFactory.create(numbers, getMid() + 1, high);
    }

    @Override
    public int compareKey(int key) {
        return key - getKey();
    }

    @Override
    public int getValue() {
        return getMid();
    }

    private int getKey() {
        return numbers[getMid()];
    }
    private int getMid() {
        return (low + high) / 2;
    }
}

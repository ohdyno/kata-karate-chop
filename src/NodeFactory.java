class NodeFactory {
    static Node create(int[] numbers, int low, int high) {
        if (low >= high)
            return new NullNode();
        else
            return new BSTNode(numbers, low, high);
    }
}

class BSTNode implements Node {
    private int low, high;
    private int[] numbers;

    BSTNode(int[] numbers, int low, int high) {
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

class NullNode implements Node {

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
}
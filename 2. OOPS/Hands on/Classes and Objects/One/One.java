package One;
class Box {
    int height;
    int width;
    int depth;

    Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int volume() {
        return height * width * depth;
    }
}

class One {
    public static void main(String[] args) {
        Box boxObj = new Box(11, 10, 20);
        System.out.println(boxObj.volume());
    }
}
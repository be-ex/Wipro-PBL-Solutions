class Fruit {

    private String name;
    private String taste;
    private String size;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return this.taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void eat() {
        System.out.println(this.getName() + " tastes " + this.getTaste());
    }

}
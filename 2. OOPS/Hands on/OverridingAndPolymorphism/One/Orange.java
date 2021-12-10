public class Orange extends Fruit {
    private String name;
    private String taste;

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

    public Orange(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    @Override
    public void eat() {
        super.eat();
    }

}

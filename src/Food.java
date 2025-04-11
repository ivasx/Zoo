public class Food {
    private String name;
    private kindFood kind;
    private int satiety;

    public Food(String name, kindFood kind, int satiety) {
        this.name = name;
        this.kind = kind;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public kindFood getKind() {
        return kind;
    }

    public void setKind(kindFood kind) {
        this.kind = kind;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }
}

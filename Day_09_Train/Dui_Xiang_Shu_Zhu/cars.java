public class cars {
    private String name;
    private String color;
    private int prize;

    public cars(String name, String color, int prize) {
        this.name = name;
        this.color = color;
        this.prize = prize;
    }

    public cars() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}

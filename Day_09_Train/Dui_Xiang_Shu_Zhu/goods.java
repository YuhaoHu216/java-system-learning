public class goods {
    private String id;
    private String name;
    private double prize;
    private int count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public goods(){

    }
    public goods(String id, String name, double prize, int count) {
        this.id = id;
        this.name = name;
        this.prize = prize;
        this.count = count;
    }
}

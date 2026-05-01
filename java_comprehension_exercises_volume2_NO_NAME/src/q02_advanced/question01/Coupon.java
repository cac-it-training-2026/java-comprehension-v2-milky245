package q02_advanced.question01;

public class Coupon {
    private int id;
    private double discountRate;
    private String description;

    public Coupon() {
    }

    //引数で全てのフィールドを初期化するコンストラクタ
    public Coupon(int id, double discountRate, String description) {
        this.id = id;
        this.discountRate = discountRate;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString メソッドをオーバーライドして、クーポンの情報を文字列として返す
    @Override
    public String toString() {
        return "Coupon [" +
                "id=" + id +
                ", discountRate=" + discountRate +
                ", description='" + description +
                ']';
    }

    // 引数で全てのフィールドを初期化する静的なファクトリーメソッド
    public static Coupon getInstance(int id, double discountRate, String description) {
        return new Coupon(id, discountRate, description);
    }
}
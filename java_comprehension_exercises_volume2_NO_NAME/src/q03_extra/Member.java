package q03_extra;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

class Member {
    //TODO ここから実装する
    private int id; // 会員ID
    private String password; // パスワード
    private String name; // 会員の名前private
    //private int age; // 会員の年齢
    private int birthday; // 会員の誕生日
    private int rank; // 会員のランク

    private List<Coupon> coupons; // クーポンのリスト

    public Member() {
        this.password = null;
        this.name = null;
        this.birthday = 0;
        this.rank = 0;
    }

    public Member(int id, String password, String name, int birthday, int rank) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.rank = rank;
        this.coupons = new ArrayList<>();
    }

//    public void buyItem() {
//        //System.out.println(name + "さんが商品を購入しました。");
//        System.out.println(name + " purchased the item at 50% off");
//    }

    public static Member getInstance(int id, String password, String name, String birthdayString) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        int birthday = 0;
        try {
            birthday = Integer.parseInt(dateFormat.parse(birthdayString).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        int rank = (int) (Math.random() * 3) + 1; // 1~3 のランダムな整数を生成
        Member member = new Member(id, password, name, birthday, rank);

        Coupon coupon1 = Coupon.getInstance(1, 0.5, "最初の特典");
        Coupon coupon2 = Coupon.getInstance(2, 0.25, "今月の特典");
        member.setCoupons(List.of(coupon1, coupon2));
        return member;
    }

    @Override
    public String toString() {
        //birthdayをyyyy/MM/dd形式で表示するためのフォーマット
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String birthdayString = dateFormat.format(birthday);
        return "Member[" +
                "id=" + id +
                ", password='" + password +
                ", name='" + name +
                ", birthday='" + birthdayString +
                ", rank=" + rank +
                ", coupons=" + coupons +
                ']';
    }

    public void showMember() {
        //System.out.println("***MEMBER DATA***");
        System.out.println(toString());
        System.out.println("*****************");
    }

    // ゲッターとセッター
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    // クーポンのゲッターとセッター
    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

}

package q01_basic.question06;

class Member extends AbstMember {
    //TODO ここから実装する
    private int id; // 会員ID
    private String password; // パスワード
    private int age; // 会員の年齢
    private int rank; // 会員のランク

    public Member() {
        this.password = null;
        this.name = null;
        this.age = 0;
        this.rank = 0;
    }

    public Member(int id, String password, String name, int age, int rank) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public void buyItem() {
        //System.out.println(name + "さんが商品を購入しました。");
        System.out.println(name + " purchased the item at 50% off");
    }

    public void showMember() {
        System.out.println("***MEMBER DATA***");
        System.out.println("id:" + id);
        System.out.println("password:" + password);
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("rank:" + rank);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}

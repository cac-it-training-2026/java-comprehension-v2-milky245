package q01_basic.question02;

class Member {
    //TODO ここから実装する
    private String name; // 会員の名前
    private int age; // 会員の年齢
    private int rank; // 会員のランク

    public void showMember() {
        System.out.println("***MEMBER DATA***");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("rank:" + rank);
        System.out.println("*****************");
    }

    public void rankUp() {
        this.rank += 1; // ランクを1つ上げる
    }

    // ゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

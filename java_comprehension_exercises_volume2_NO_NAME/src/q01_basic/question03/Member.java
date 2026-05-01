package q01_basic.question03;

class Member {
    //TODO ここから実装する
    private String name; // 会員の名前
    private int age; // 会員の年齢
    private int rank; // 会員のランク

    // デフォルトコンストラクタ
    public Member() {
        this.name = null;
        this.age = 0;
        this.rank = 0;
    }

    // 引数ありコンストラクタ
    public Member(String name, int age, int rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    // 会員の情報を表示するメソッド
    public void showMember() {
        System.out.println("***MEMBER DATA***");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("rank:" + rank);
        System.out.println("*****************");
    }

    // 会員のランクを1つ上げるメソッド
    public void rankUp() {
        this.rank += 1;
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

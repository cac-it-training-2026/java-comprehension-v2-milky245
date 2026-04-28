package q01_basic.question01;


class Member {
	//TODO ここから実装する
    String name; // 会員の名前
    int age; // 会員の年齢
    int rank; // 会員のランク

    public void showMember() {
        System.out.println("***MEMBER DATA***");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("rank:" + rank);
        System.out.println("*****************");
    }

}

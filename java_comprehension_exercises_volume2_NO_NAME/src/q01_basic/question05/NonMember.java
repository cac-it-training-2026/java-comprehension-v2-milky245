package q01_basic.question05;

public class NonMember extends AbstMember {
    //TODO ここから実装する
    public NonMember(String name) {
        this.name = name;
    }

    // 商品を購入するメソッド
    public void buyItem() {
        //System.out.println(name + "さんが商品を購入しました。");
        System.out.println(name + " purchased the item at a fixed price");
    }

    // 非会員情報を表示するメソッド
    public void showMember() {
        System.out.println("***NON-MEMBER DATA***");
        System.out.println(name + "is a non-member");
        System.out.println("*********************");
    }
}

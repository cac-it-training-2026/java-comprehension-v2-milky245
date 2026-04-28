package q03_extra;

import java.util.List;

class MemberManager {

    /**
     * インスタンス化の禁止
     */
    private MemberManager() {
    }

    //TODO showAllMembersメソッドを実装する
    public static void showAllMembers(List<Member> members) {
        for (Member member : members) {
            member.showMember(); // 会員の情報を表示
        }
    }

    public static void updatePassword(List<Member> members, int id, String newPassword) {
        boolean found = false;
        for (Member member : members) {
            if (member.getId() == id) { // id一致する会員を探す
                member.setPassword(newPassword); // パスワードを更新
                found = true;
                System.out.println("パスワードが更新されました。");
                break; // 一致する会員が見つかったらループを抜ける
            }
        }
        if (!found) {
            System.out.println("該当者はいませんでした。");
        }
    }

    //MemberManager クラス：ShowCreateUser メソッドを定義する。引数で取得した複数の Member クラスオブジェクトの中か
    //ら引数で取得した id がフィールドの値と一致するオブジェクトの showMember メソッドを呼び出し、該当会員（新規作成し
    //たユーザー）のユーザー情報を出力する。
    public static void showCreateUser(List<Member> members, int id) {
        for (Member member : members) {
            if (member.getId() == id) { // id一致する会員を探す
                member.showMember(); // 該当会員の情報を表示
                return; // 一致する会員が見つかったらメソッドを終了
            }
        }
        System.out.println("該当者はいませんでした。");
    }
}

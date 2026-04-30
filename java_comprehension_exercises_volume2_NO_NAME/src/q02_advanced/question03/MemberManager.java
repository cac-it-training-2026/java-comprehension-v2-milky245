package q02_advanced.question03;

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

    //update Password
    // 複数の Member クラスオブジェクトの中から引数で取得した id がフィールドの値と一致するオブジェクト
    // のnewPassword に更新する。
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
}

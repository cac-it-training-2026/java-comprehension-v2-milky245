package q02_advanced.question02;

import java.util.List;

/*
* 14 MemberManager クラス：引数なしでアクセス修飾子は private のコンストラクタを定義し、インスタンス化を禁止する。
15 MemberManager クラス：showAllMembers メソッドを定義する。引数で取得した複数の Member クラスオブジェクトを 1 件
ずつ取得し、各オブジェクトの showMember メソッドを呼び出す。
16 MemberManager クラス：updatePassword メソッドを定義し、以下の内容を記述する。
16.1 引数で取得した複数の Member クラスオブジェクトの中から引数で取得した id とフィールドの値が一致するオブジェ
クトを取得する。
16.2 上記処理で id とフィールドの値が一致するデータが存在した場合、引数で取得した password をフィールドに代入し、
該当会員のパスワード変更処理を行う。
16.3  上記に該当しない場合、「該当者はいませんでした。」というメッセージを出力する。
* **/
class MemberManager {

    /**
     * インスタンス化の禁止
     */
    private MemberManager() {
    }

    //MemberManager クラス：showAllMembers メソッドを定義する。引数で取得した複数の Member クラスオブジェクトを 1 件ずつ取得し、各オブジェクトの showMember メソッドを呼び出す。
    //TODO showAllMembersメソッドを実装する
    public static void showAllMembers(List<Member> members) {
        for (Member member : members) {
            member.showMember(); // 会員の情報を表示
        }
    }

    //ShowCreateUser メソッドを定義する。
    // 引数で取得した複数の Member クラスオブジェクトの中から引数で取得した id がフィールドの値と一致するオブジェクトの showMember メソッドを呼び出し、該当会員（新規作成したユーザー）のユーザー情報を出力する。
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

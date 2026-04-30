package q03_extra;
//21 MemberPasswordReader クラス：setErrorMsg メソッドをオーバーライドする。エラーメッセージ「8 文字以上 16 文字以内
//の半角英数字で入力してください」を戻り値として返す。
//22 MemberPasswordReader クラス：isValid メソッドをオーバーライドする。引数で取得した inputString が指定の形式（8～16
//文字の半角英数字）と一致する場合は、戻り値として true、一致しない場合は false を返す。
//23 MemberPasswordReader クラス：isParseInt メソッドをオーバーライドし、戻り値として false を返す。
public class MemberPasswordReader implements IConsoleReader {
    @Override
    public String setErrorMsg() {
        return "8 文字以上 16 文字以内の半角英数字で入力してください";
    }

    @Override
    public boolean isValid(String inputString) {
        return inputString.matches("^[a-zA-Z0-9]{8,16}$");
    }

    @Override
    public boolean isParseInt() {
        return false;
    }

}

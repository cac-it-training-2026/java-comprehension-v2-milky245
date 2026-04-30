package q03_extra;

//18 MemberIdReader クラス：setErrorMsg メソッドをオーバーライドする。エラーメッセージ「1-9 の整数を入力してくださ
//い」を戻り値として返す。
//19 MemberIdReader クラス：isValid メソッドをオーバーライドする。引数で取得した inputString が指定の形式（1～9 のいずれ
//か 1 文字）と一致する場合は、戻り値として true、一致しない場合は false を返す。
//20 MemberIdReader クラス：isParseInt メソッドをオーバーライドし、戻り値として true を返す。
public class MemberIdReader implements IConsoleReader {
    @Override
    public String setErrorMsg() {
        return "1-9 の整数を入力してください";
    }

    @Override
    public boolean isValid(String inputString) {
        return inputString.matches("[1-9]");
    }

    @Override
    public boolean isParseInt() {
        return true;
    }

}

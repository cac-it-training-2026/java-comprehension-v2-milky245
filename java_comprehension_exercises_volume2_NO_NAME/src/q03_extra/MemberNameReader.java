package q03_extra;
//24 MemberNameReader クラス：setErrorMsg メソッドをオーバーライドする。エラーメッセージ「名前は半角英字 16 文字以内
//で入力してください」を戻り値として返す。
//25 MemberNameReader クラス：isValid メソッドをオーバーライドする。引数で取得した inputString が指定の形式（1～16 文
//字の半角英字またはスペース）と一致する場合は、戻り値として true、一致しない場合は false を返す。
//26 MemberNameReader クラス：isParseInt メソッドをオーバーライドし、戻り値として false を返す。
public class MemberNameReader implements IConsoleReader {
    @Override
    public String setErrorMsg() {
        return "名前は半角英字 16 文字以内で入力してください";
    }

    @Override
    public boolean isValid(String inputString) {
        return inputString.matches("^[a-zA-Z]{1,16}$");
    }

    @Override
    public boolean isParseInt() {
        return false;
    }

}

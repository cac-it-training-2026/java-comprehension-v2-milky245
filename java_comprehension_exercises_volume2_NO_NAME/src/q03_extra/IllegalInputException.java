package q03_extra;

public class IllegalInputException extends Exception {
    //IllegalInputException クラス：下記クラス構成、クラス図を参照しコンストラクタを定義する。コンストラクタ内の処理で親
    //クラス（Exception）のコンストラクタを呼び出す。

    public IllegalInputException() {
        super();
    }

    public IllegalInputException(String message) {
        super(message);
    }

    public IllegalInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalInputException(String message, Throwable cause, boolean enabledSuppression, boolean writableStackTrace) {
        super(message, cause, enabledSuppression, writableStackTrace);
    }

    public IllegalInputException(Throwable cause) {
        super(cause);
    }


}

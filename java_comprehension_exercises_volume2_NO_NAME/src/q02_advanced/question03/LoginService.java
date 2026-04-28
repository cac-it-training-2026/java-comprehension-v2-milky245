package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 * 15 LoginService クラス：コンストラクタを定義し、引数で取得した memberStorage をフィールドに代入する。
 * 16 LoginService クラス：doLogin メソッドを定義し、以下の内容を記述する。
 * 16.1 memberStorage フィールドに代入された会員情報の中から引数で取得した id と password がフィールドの値と一致する
 * ユーザーを取得し、戻り値として返す。
 * 16.2 一致するユーザーが存在しない場合は戻り値として null を返す。
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから処理を記述
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	public Member doLogin(int id, String password) {
		for (Member member : memberStorage.getMembers()) {
			if (member.getId() == id && member.getPassword().equals(password)) {
				return member;
			}
		}
		return null;
	}

}

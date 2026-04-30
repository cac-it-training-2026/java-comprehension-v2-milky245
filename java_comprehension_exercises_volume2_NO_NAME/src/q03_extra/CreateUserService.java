package q03_extra;

/**
 * MemberStorageにアクセスし、ユーザ登録処理を行う
 */
class CreateUserService {
	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	//TODO ここから実装する
	//コンストラクタを定義する。引数で取得した memberStorage をフィールドに代入する。
	public CreateUserService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	//execute メソッド
	//引数で取得した id が memberStorage 内の Member クラスのリストに存在する場合は、IllegalInputException をスローする。
	//存在しない場合は、引数で取得したインスタンスを生成し、memberStorage 内の Member クラスのリストに追加する。
	public boolean execute(int id, String password, String name, String birthday) throws IllegalInputException {
		for (Member member : memberStorage.getMembers()) {
			if (member.getId() == id) {
				throw new IllegalInputException("IDが重複しています。再度入力してください");
			}
		}
		Member newMember = Member.getInstance(id, password, name, birthday);
		memberStorage.addMember(newMember);
		return true;
	}

}

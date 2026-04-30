package q03_extra;

/**
 * この問題は採点対象外です。時間が余った際に解いてください
 * また、テストクラスはありません。問題文と出力例を参考に実装してください。
 *
 *
 * 30 SystemMain クラス：main メソッド内に以下の内容を記述する。
 * 30.1  以下、会員登録処理を行う。出力例を参考に実装すること。
 * 30.1.1 MemberIdReader クラスの input メソッドを呼び出し、会員 ID の入力を促す。
 * 30.1.2 MemberPasswordReader クラスの input メソッドを呼び出し、パスワードの入力を促す。
 * 30.1.3 MemberNameReader クラスの input メソッドを呼び出し、ユーザー名の入力を促す。
 * 30.1.4 MemberBirthdayReader クラスの input メソッドを呼び出し、誕生日の入力を促す。
 * 30.1.5 CreateUserService クラスの execute メソッドを呼び出し、入力値を基に会員登録処理を行う。
 * 30.1.6 会員登録処理の例外処理として、スタックとレースを出力する。
出力例1

新規に会員登録します。必要事項を入力してください
input id[1-9]>>6
input password>>zzzzZZZZ
input name>>Nobi Nobita
input birthday>>2000/08/07
ユーザが作成されました
ユーザ情報を表示します。
Member [id=6, password=zzzzZZZZ, name=Nobi Nobita, birthday=2000/08/07, rank=3, coupons=[Coupon [id=1, discountRate=0.5, description=最初の特典], Coupon [id=2, discountRate=0.25, description=今月の特典]]]
******************

出力例2(準異常系)

新規に会員登録します。必要事項を入力してください
input id[1-9]>>1
input password>>zzzzZZZZ
input name>>Nobi Nobita
input birthday>>2000/08/07
IDが重複しています。再度入力してください
input id[1-9]>>
//以下繰り返し

出力例3(異常系)
新規に会員登録します。必要事項を入力してください
input id[1-9]>>10
1-9の整数を入力してください
input id[1-9]>>a
1-9の整数を入力してください

出力例4(異常系)
input password>>a
8文字以上16文字以内の半角英数字で入力してください

出力例5(異常系)
input name>>野比のび太
名前は半角英字16文字以内で入力してください

出力例6(異常系)
input birthday>>2000/8/32
正しい形式(yyyy/MM/dd)で入力してください


 * 
 */
public class SystemMain {

	public static void main(String[] args) {

		MemberStorage memberStorage = new MemberStorage();
		CreateUserService createUserService = new CreateUserService(memberStorage);
		boolean isCreated = false;
		int inputId = 0;
		String inputPassword = "";
		String inputName = "";
		String inputBirthday = "";

		System.out.println("新規に会員登録します。必要事項を入力してください");
		//TODO ここから実装する

		while (!isCreated) {
			try {
				//get input from ConsoleReader
				System.out.print("input id[1-9]>>");
				inputId = (int) new MemberIdReader().input();
				System.out.print("input password>>");
				inputPassword = (String) new MemberPasswordReader().input();
				System.out.print("input name>>");
				inputName = (String) new MemberNameReader().input();
				System.out.print("input birthday>>");
				inputBirthday = (String) new MemberBirthdayReader().input();

				//execute createUserService
				isCreated = createUserService.execute(inputId, inputPassword, inputName, inputBirthday);
				if (isCreated) {
					System.out.println("ユーザが作成されました");
					System.out.println("ユーザ情報を表示します。");
					memberStorage.getMembers().getLast().showMember();
				}
			} catch (IllegalInputException e) {
				System.out.println(e.getMessage());
			} catch (SystemErrorException e) {
				e.printStackTrace();
			}
		}

	}

}

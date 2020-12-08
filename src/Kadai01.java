
public class Kadai01 {

	/**
	 * �ۑ�01
	 * ������̍��E�̕����𔽓]���ĕԂ����\�b�h
	 * @param s�@�Ώۂ̕���
	 * @return ���E�𔽓]��������
	 */
	String ReverseString(String s) {
		//TODO プログラムをここに作成する
		if(s==null) {
			return s;
		}
		String a="";
		for(int i = 0 ;i<s.length();i++) {
			a= a+s.charAt(s.length()-1-i);
		}
		return a;
	}
}

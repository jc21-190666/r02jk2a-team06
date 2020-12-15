import java.util.Arrays;

public class Kadai04 {

	/**
	 * 課題04
	 * 文字列の中に含まれるアルファベットの中で、一番多く使われている文字を返す
	 * @param s 文字列
	 * @return sの中に入っていた文字
	 */
	char getMaxString(String s) {
		
		char[] a = s.toCharArray();
		Arrays.sort(a);
		
		int i ;
		int j ;
		int count = 0;
		int max = 0;
		char mm = ' ';
		
		for( i = 0;i < s.length() -1;i = j) {
			
			for( j = i + 1;j < s.length() - 1;j++) {
				
				if(a[i] == a[j]) {
					count++;
						
				}
			}
			if(max < count) {
				max = count;
				mm = a[i];
			}
		}
		char c = mm;
		return c;
	}
	
}


public class Kadai06 {

	/**
	 * 課題06
	 * 引数として渡された配列の中で、降順で2番目の値を返す
	 * @param d 数値が入っている配列
	 * @return 配列の中の降順で2番目の値
	 */
	int get2ndMax(int[] d) {
		
		for(int i = 0;i < d.length - 1;i++) {
			
			for(int j =0;j < d.length - 1;j++) {
				
				if (d[i] < d[j+1]) {
					int min = d[j];
					d[j] = d[j+1];
					d[j+1] = min;
				}
			}
		}
		return d[1];
	}
}

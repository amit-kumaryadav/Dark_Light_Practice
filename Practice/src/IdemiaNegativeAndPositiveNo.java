
public class IdemiaNegativeAndPositiveNo {

	public static void main(String[] args) {
		int[] intArr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int j = 0;
		int temp;
		sortNumbers(intArr);
//		for (int i = 0; i < intArr.length; i++) {
//			if (intArr[i] < 0) {
//				if (i != j) {
//					temp = intArr[i];
//					intArr[i] = intArr[j];
//					intArr[j] = temp;
//				}
//				j++;
//			}
//		}
		for (int k = 0; k < intArr.length; k++) {
			System.out.println(intArr[k]);
		}
	}
	public static void sortNumbers(int[] A) {
        int a = 0;
        int b = A.length - 1;
        for (int i = 0; i < A.length && i <= b; i++) {
            int cur = A[i];
            if (cur < 0) {
                swap(A, i, a);
                a++;
            } else if (cur > 0) {
                swap(A, i, b);
                b--;
                i--;
            }
        }
    }
	
	private static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

}

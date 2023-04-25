package 연습;

public class Step1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*int a = 80;
			int b = 75;
			int c = 55;*/ //단순합을 구해 평균 구하기
	int[] a = new int[3];		
			a[0] = 80;
			a[1] = 75;
			a[2] = 55;
	int b=0;
		for(int i = 0;  i<a.length ; i++)
		{
		 b += a[i];
		}//배열이용 평균구하기
		
		System.out.println(b/a.length);
	}
	public void 홀수짝수() {
		
	}

}

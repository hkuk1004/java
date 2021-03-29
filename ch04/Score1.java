package ch04;

public class Score1 {
	public static void main(String[] args) {
		String subject = "성적표";
		String name[] = {"BTS","아이유","유재석","홍길동"};
		String title[] = {"이름","국어","영어","수학","총점","평균"};
		int[][] score = { {90,80,70}, {76,86,90}, {90,78,90}, {80,80,80}};
		int[] tot = new int[score[0].length]; // int[3] 과목별 합계;
		int len = 44, sum = 0;
		System.out.println(subject);
		System.out.println("===========================================");
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<len; i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j]; // 행별 합계
				tot[j] += score[i][j]; // 열별 합계
			}
			// 행별로 합계를 구하기 위하여
			System.out.println(sum+"\t"+sum/score[i].length);
			sum = 0;
		}
		for(int i=0; i<len; i++) {
			System.out.print("=");
		}
		System.out.print("\n합계\t");
		for(int j=0; j<tot.length; j++) {
			System.out.print(tot[j]+"\t");
			sum += tot[j];
		}
		System.out.println(sum+"\t"+sum/tot.length+"("+sum/tot.length/score.length+")");
	}
}

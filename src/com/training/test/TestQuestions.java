package com.training.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestQuestions {

	public static void main(String[] args) {
		// ① 文字列から指定した文字列を返却する
		//   例："abcde"→"bc"
		String str = "abcde";
		String sub = str.substring(1, 3);
		System.out.println(sub);
		
		// ② "abcde" 中に"bc"の存在チェック、"abcde" 中に"cc"の存在チェック 
		String chk1 = "bc";
		if (str.indexOf(chk1) != -1) {
			System.out.println(str + "に" + chk1 + "が存在する");
		} else {
			System.out.println(str + "に" + chk1 + "が存在しない");
		}
		String chk2 = "cc";
		if (str.indexOf(chk2) != -1) {
			System.out.println(str + "に" + chk2 + "が存在する");
		} else {
			System.out.println(str + "に" + chk2 + "が存在しない");
		}

		// ③ 「+、-、*、／」メソッド作成 
		int n1 = 127, n2 = 125;
		int sum = n1 + n2 ;
		System.out.println("n1 + n2 = " + sum);
		int minus = n1 - n2;
		System.out.println("n1 - n2 = " + minus);
		int multiply = n1 * n2;
		System.out.println("n1 * n2 = " + multiply);
		int divide = n1 / n2;
		System.out.println("n1 / n2 = " + divide);
		System.out.println();

		// ④ ソート int [2,4,8,1]昇順 
		int[] arr = new int[] { 2, 4, 8, 1 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// ⑤　九九表
		for(int i = 1; i < 10; i++) {
			String numstr = "";
			for(int j = 1; j <= i; j++) {
				numstr += j + "*" + i + "=" + (j*i) + " ";
			}
			System.out.println(numstr);
		}
		
		// ⑥　楊輝三角	
		int[][] triangle = new int[9][];
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[i + 1];
			for (int j = 0; j < triangle[i].length; j++) {
				if (i == 0 || j == 0 || i == j) {
					triangle[i][j] = 1;
				} else {
					triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
				}
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}

		// ⑦　文字列にある「半角スペース」「全角スペース」を置き換えて返却する		
		//　　　例："a b　cde "→"abcde"		
		String str2 = "a b　cde ";
		String halfSpace = " ";
		String doubleSpace = "　";
		String result = str2.replace(halfSpace, "").replace(doubleSpace, "");
		System.out.println(result);
		
		// ⑧　ArrayListクラスをインスタンス作成し、5つの要素を追加する。また、3番目の要素を別の値に再設定する。
		//　　　例："日本"、"ブラジル"、"イングランド"、"ポルトガル"、"フランス"
		//　　　　→"日本"、"ブラジル"、"England"、"ポルトガル"、"フランス"
		List<String> list = new ArrayList<String>(){
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
		    	add("日本");
				add("ブラジル");
				add("イングランド");
				add("ポルトガル");
				add("フランス");
		    }
		};
		// List<String> list = new ArrayList<String>();
		// list.add("日本");
		// list.add("ブラジル");
		// list.add("イングランド");
		// list.add("ポルトガル");
		// list.add("フランス");
		System.out.println(list);
		list.set(2, "England");
		System.out.println(list);
	}

}

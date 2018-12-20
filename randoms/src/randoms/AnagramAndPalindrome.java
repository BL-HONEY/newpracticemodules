package randoms;

import java.util.Scanner;

public class AnagramAndPalindrome 
{
		public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			int n;
			int count = 0;
			int pp = 0;
			int aa = 0;
			int a[] = new int[10];
			int c[][] = new int[100][25];
			int p[] = new int[200];
			for (int i = 2; i < 1000; i++) {
				int flag = 1;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag++;
						break;
					}

				}
				if (flag == 1) {
					System.out.println(i);
					p[pp] = i;
					pp++;
					count++;

				}
				if (i % 100 == 0 || i % 999 == 0) {
					a[aa] = count;
					count = 0;
					aa++;
				}
			}
			for (int v = 0; v < 168; v++) {

				System.out.println(v + " " + p[v]);
			}

			int l = 0;
			int i = 0;
			int x = 0;
			int y = 0;
			int j = 0;
			int k = 0;
			for (i = 100 - i; i <= 1000; i += 100) {
				l = a[x];

				for (j = 0; j < l; j++) {
					for (k = 0; k < 2; k++) {
						if (k == 1) {
							c[j][k] = p[y];
							System.out.println(c[j][k]);
							y++;
						}
						c[j][k] = p[y];
						y++;
					}
					System.out.println(i + "  " + j + " " + c[j][1]);
				}
				x++;

			}

		}

		int c[][] = new int[100][25];
		int p[] = new int[200];
		{
			for (int i = 2; i < 1000; i++) {
				int flag = 1;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag++;
						break;
					}
				}

				if (p[i] == p[p.length - 1 - i]) {
					System.out.println("pallindrome numbers are" + i);

				}
			}
	}
}

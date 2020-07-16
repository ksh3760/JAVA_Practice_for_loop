class Tri {
	void Triangle() {
		
		System.out.println("--- Triangle ---");
		
		int k = 5;
		
		for(int i = 0 ; i < k ; i++) {
			System.out.print(i + " ");
			for(int j = i ; j < k ; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < (i*2) + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
}// end class Tri


class Tri2 {
	void RightTriangle() {
		
			System.out.println("--- Right Triangle ---");
			
		int k = 5;
		
		for(int i = 0 ; i < k ; i++) {
			System.out.print(i + " ");
			for(int m = 0 ; m < 2 ; m++) {
				for(int j = i ; j < k ; j++) {
					System.out.print(" ");
				}
				for(int j = 0 ; j < i+1 ; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}// end RightTriangle

	
	public void Triangles(int p) {
		
		System.out.println("--- Triangles ---");
		
		int k = 5;
		
		for(int i = 0 ; i < k ; i++) {
			System.out.print(i + " ");
			for(int m = 0 ; m < p ; m++) {
				for(int j = i ; j < k ; j++) {
					System.out.print(" ");
				}
				for(int j = 0 ; j < i+1 ; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}// end Triangle2
	
	public void Diamond() {
		System.out.println("--- Diamond ---");
		
		int n = 5;

		for(int i = 0 ; i < n ; i++) {
			System.out.print(i + " ");
			for(int j = i ; j < n ; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < (i*2) + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1 ; i < n ; i++) {
			System.out.print(i+4 + " ");
			
			for(int j = 0 ; j < i+1 ; j++ ) {
				System.out.print(" ");
			}
			for(int j = i+1 ; j < (n*2) - i ; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		
	}// end Diamond


	public void Diamonds(int n, int p) {	//n : ����,  p : ����
		System.out.println("--- Diamonds ---");
		
		// �ﰢ��(��)
		for(int i = 0 ; i < n/2 ; i++) {
			System.out.print(i + " ");
			// ���� �� ���� �ﰢ��
			for(int j = i ; j < n/2 ; j++) {
				System.out.print(" ");
			}
			
			
			for(int m = 0 ; m < p ; m++) {
				// �ﰢ��
				for(int j = 0 ; j < (i*2) + 1; j++) {
					System.out.print("*");
				}
				
				// ���� �� �ﰢ��
				for(int j = i+1 ; j < ((n/2) * 2) - i ; j++) {
					System.out.print(" ");
				}
			}
			
			System.out.println();	// �ٹٲ�

		}
		
		// ����(��)
		for(int i = 1 ; i < n/2 ; i++) {
			System.out.print((i + n/2) + " ");
			// ���� ���� �ﰢ��
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print(" ");
			}
			
			for(int m = 0 ; m < p ; m++) {
				// �� �ﰢ��
				for(int j = i+1 ; j < ((n/2) * 2) - i ; j++) {
					System.out.print("*");
				}
				
				// �ﰢ��
				for(int j = 0 ; j < (i*2) + 1; j++) {
					System.out.print(" ");
				}
			}

			System.out.println(); // �ٹٲ�
		}
		
		
	}// end Diamonds
	
	
}// end class Tri2


public class main {
	public static void main(String[] args) {
		Tri obj;
		obj = new Tri();
		obj.Triangle();
		
		Tri2 obj2;
		obj2 = new Tri2();
		obj2.RightTriangle();
		obj2.Triangles(4);		// parameter�� ������ �����մϴ�.
		obj2.Diamond();
		obj2.Diamonds(10, 3);	// parameters�� ����, ������ �����մϴ�.
		
	}// end main
}// end class
	   

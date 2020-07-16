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


	public void Diamonds(int n, int p) {	//n : 길이,  p : 개수
		System.out.println("--- Diamonds ---");
		
		// 삼각형(상)
		for(int i = 0 ; i < n/2 ; i++) {
			System.out.print(i + " ");
			// 공백 역 직각 삼각형
			for(int j = i ; j < n/2 ; j++) {
				System.out.print(" ");
			}
			
			
			for(int m = 0 ; m < p ; m++) {
				// 삼각형
				for(int j = 0 ; j < (i*2) + 1; j++) {
					System.out.print("*");
				}
				
				// 공백 역 삼각형
				for(int j = i+1 ; j < ((n/2) * 2) - i ; j++) {
					System.out.print(" ");
				}
			}
			
			System.out.println();	// 줄바꿈

		}
		
		// 상각형(하)
		for(int i = 1 ; i < n/2 ; i++) {
			System.out.print((i + n/2) + " ");
			// 공백 직각 삼각형
			for(int j = 0 ; j < i+1 ; j++) {
				System.out.print(" ");
			}
			
			for(int m = 0 ; m < p ; m++) {
				// 역 삼각형
				for(int j = i+1 ; j < ((n/2) * 2) - i ; j++) {
					System.out.print("*");
				}
				
				// 삼각형
				for(int j = 0 ; j < (i*2) + 1; j++) {
					System.out.print(" ");
				}
			}

			System.out.println(); // 줄바꿈
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
		obj2.Triangles(4);		// parameter로 개수를 지정합니다.
		obj2.Diamond();
		obj2.Diamonds(10, 3);	// parameters로 높이, 개수를 지정합니다.
		
	}// end main
}// end class
	   

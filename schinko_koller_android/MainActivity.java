<<<<<<< HEAD
public void thisIsANewMethod(){
<<<<<<< HEAD
	int y=10000;

int x = 100;
}

>>>>>>> 442a44165d045b4b624c245de4b7545478513cd9
public int size () {
<<<<<<< HEAD
		int size=20;
		String test = "Hello git";
		int testInt = 10;
>>>>>>> 01a2b43b2c45a582a1aca9641a9544c55d91e698
		return size;
	}

public String toString() {
		StringBuffer s = new StringBuffer(20);
		s.append("binary search tree: ");
		
			int i=0;
			int min=min();
			int max=max();

			while(min<=max){	
				boolean find = find(min);
				
				if(find==true){	
					s.append(min);
					if(i<size-1){
					s.append(", ");
					}
				i++;
				}
			min++;	
			}

		s.append(".");
		return s.toString();
	}
>>>>>>> af3d68141e9f478337266137afaa116195816a2f

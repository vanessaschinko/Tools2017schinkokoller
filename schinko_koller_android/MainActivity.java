<<<<<<< HEAD
public void thisIsANewMethod(){
int x = 100;
}

public int size () {
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

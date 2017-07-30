package com.array;

public class RottenOranges {
	static int[][] array1 = {{2,1,0,2,1},
			{1,0,1,2,1},
			{1,0,0,2,1}};
	static int[][] array2 = {{2,1,0,2,1},
						{0,0,1,2,1},
						{1,0,0,2,1}};
	public static void main(String[] args) {
		
		
		RottenOranges ro = new RottenOranges();
		
		ro.countRottenOranges(array1);
//		ro.countRottenOranges(array2);
	}

	private int countRottenOranges(int[][] array) {
		
		int count= 0;
		
			for(int i=0; i<array.length; i++){
				for(int j=0; j<array[i].length; j++){
					//Right Check
					if(isRotten(array[i][j]) && isRightValid(j, array[i].length)){
						if(isFreshOrange(array[i][j+1])){
							array[i][j+1] = 2;
						}
					}
					//Left Check
					if(isRotten(array[i][j]) && isLeftValid(j-1)){
						if(isFreshOrange(array[i][j-1])){
							array[i][j-1] = 2;
						}
					}
					//Top Check
					if(isRotten(array[i][j]) && isTopValid(i-1)){
						if(isFreshOrange(array[i-1][j])){
							array[i-1][j] = 2;
						}
					}
					//Bottom Check
					if(isRotten(array[i][j]) && isBottomValid(i+1)){
						if(isFreshOrange(array[i+1][j])){
							array[i+1][j] = 2;
						}
					}
				}
			}
			
			boolean flag = checkIfAllOrangesAreRotten(array);
			
			if(flag){
				for(int i=0; i<array.length; i++){
					for(int j=0; j<array[i].length; j++){
						System.out.print(array[i][j] + ",");
					}
					System.out.println();
				}
			}else{
				countRottenOranges(array);
			}
			System.out.println(count+ " : count");
		return count;
	}

	private boolean isFreshOrange(int i) {
		// TODO Auto-generated method stub
		if(i == 1)
			return true;
		
		return false;
	}

	private boolean isBottomValid(int i) {
		// TODO Auto-generated method stub
		if(i < array1.length)
			return true;
		return false;
	}

	private boolean isTopValid(int i) {
		// TODO Auto-generated method stub
		if(i >= 0)
			return true;
		
		return false;
	}

	private boolean isLeftValid(int i) {
		// TODO Auto-generated method stub
		if(i >= 0)
			return true;
		
		return false;
	}

	private boolean isRightValid(int j, int length) {
		// TODO Auto-generated method stub
		if(j < length - 1)
			return true;
		
		return false;
	}

	private boolean isRotten(int i) {
		// TODO Auto-generated method stub
		if(i == 2)
			return true;
		
		return false;
	}

	private boolean checkIfAllOrangesAreRotten(int[][] array) {
		// TODO Auto-generated method stub
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				if(array[i][j] == 2 || array[i][j] == 0){
					continue;
				}else if(array[i][j] == 1){
					if(isEmpty(i, j, array, array[i].length, array.length))
						continue;
				}else
					return false;
			}
		}
		return true;
	}

	private boolean isEmpty(int i, int j, int[][] array, int length, int length2) {
		// TODO Auto-generated method stub
		if(isBottomValid(i) && i < length2-1){
			isZero(i+1, j, array);
		}else if(isTopValid(i)){
			isZero(i-1, j, array);
		}else if(isLeftValid(j)){
			isZero(i, j-1, array);
		}else if(isRightValid(j, length)){
			isZero(i, j+1, array);
		}
		return false;
	}

	private boolean isZero(int i, int j, int[][] array) {
		// TODO Auto-generated method stub
		if(array[i][j] == 0)
			return true;
		
		return false;
	}	
}


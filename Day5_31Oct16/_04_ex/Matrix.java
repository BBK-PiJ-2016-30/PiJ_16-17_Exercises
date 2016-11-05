//exercise 4 creating matrices

public class Matrix{
	
	int [][] matrixField;	

	Matrix(int row, int col){
		matrixField = new int[row][col];
		for(int i=0; i<row;i++ ){
			for(int j=0; j<col; j++){
				matrixField[i][j] = 1;
			}
		}
	}
	
	Matrix(int squareM){
		matrixField = new int[squareM][squareM];
		for(int i=0; i<squareM;i++ ){
			for(int j=0; j<squareM; j++){
				matrixField[i][j] = 1;
			}
		}
	}

	public boolean checkIndices(int row, int col){
		int sizeRow = matrixField.length;
		int sizeCol = matrixField[0].length;
		
		if(row >= 0 & row < sizeRow & col >= 0 & col < sizeCol){
			return(true);
		}
		return(false);
	}

	public void setElement (int row, int col, int value){
		if(checkIndices(row,col)){
			matrixField[row][col] = value;
		}
		return;
	}

	public void setRow(int row, String numList){
		int colSize = numCount(numList)-1;
		if(checkIndices(row,colSize) & colSize == matrixField[0].length){
			int [] numArr = strToNumArr(numList);
			for(int i=0; i<colSize+1;i++ ){
				matrixField[row][i] = numArr[i];
			}
		}
		return;
	}
	
	public void setColumn(int col, String numList){
		int rowSize = numCount(numList);
		if(checkIndices(rowSize,col) & rowSize == matrixField.length){
			int [] numArr = strToNumArr(numList);
			for(int i=0; i<rowSize;i++ ){
				matrixField[i][col] = numArr[i];
			}
		}
		return;

	}
	
	public int numCount(String str){
		int count = 0;
		for(int i=0; i<str.length();i++){
			if(str.charAt(i) == ','){
				count ++;
			}
		}
		return(count+1);
	}
	
	public int [] strToNumArr(String str){
		int [] numArr;
		int size = numCount(str);
		numArr	= new int[size];
		
		int count = 0;
		String tmp = "";

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ','){
				numArr[count] = Integer.parseInt(tmp);
				tmp = "";
				count ++;
			}else{
				tmp = tmp + str.charAt(i);
			}
		}
		
		numArr[count] = Integer.parseInt(tmp);
		
		return(numArr);
	}

	public String toString(){
		String str = "[";
		int sizeRow = matrixField.length;
		int sizeCol = matrixField[0].length;
		for(int i=0; i<sizeRow;i++ ){
			for(int j=0; j<sizeCol; j++){
				if(j != (sizeCol-1)){
					str = matrixField[i][j] + ",";
				}else{
					str = matrixField[i][j] + ";";
				}
			}
		}
		return (str + "]");
	}

	public void prettyPrint(){
		String str = "";
		int sizeRow = matrixField.length;
		int sizeCol = matrixField[0].length;
		for(int i=0; i<sizeRow;i++ ){
			for(int j=0; j<sizeCol; j++){
				str = str + "\t| " + matrixField[i][j];
			}
			System.out.println(str);
			str = "";
		}
	}
}
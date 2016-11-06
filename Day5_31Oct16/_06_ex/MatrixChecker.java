//exercise 6 Symmetry looks pretty

public class MatrixChecker{
	
	public boolean isSymmetrical(int [] matChk){
		int matSize = matChk.length;
		
		for(int i=0; i<((matSize/2)+1); i++){
			if(matChk[i] != matChk[(matSize-1)-i]){
				return(false);
			}
		}
		return(true);
	}
	
	public boolean isSymmetrical(int [][] matChk){
		int rowSize = matChk.length;
		int colSize = matChk[0].length;
		
		for(int i=0; i<rowSize; i++){
			for(int j=0; j<colSize; j++){
				System.out.println("Coordinates row " + i + " col " + j + " Values " + matChk[i][j] + " & " + matChk[j][i]);
				if(matChk[i][j] != matChk[j][i]){
					return(false);
				}
			}
		}
		return(true);
	}
	
	public boolean isTriangular(int [][] matChk){
		int rowSize = matChk.length;
		int colSize = matChk[0].length;
		
		for(int i=0; i<rowSize; i++){
			for(int j=0; j<colSize; j++){
				if(i>j & matChk[i][j] != 0){
					return(false);
				}
			}
		}
		return(true);
	}
}
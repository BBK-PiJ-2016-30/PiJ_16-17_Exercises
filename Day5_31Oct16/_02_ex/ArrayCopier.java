//Copying arrays
public class ArrayCopier{
	
	public boolean ArrEqual(int [] src, int [] dst){
		int srcSize = src.length;
		int dstSize = dst.length;
		if(srcSize == dstSize){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean ArrSrcBig(int [] src, int [] dst){
		int srcSize = src.length;
		int dstSize = dst.length;
		if(srcSize > dstSize){
			return true;
		}else{
			return false;
		}
		
		
	}
	
	public void copy (int [] src, int [] dst){
		//copy elements from array 1 to array 2
		if(ArrEqual(src,dst)){
			for(int i=0; i<src.length; i++){
				dst[i] = src[i];
			}
		}else if(ArrSrcBig(src,dst)){
			for(int i =0; i < dst.length; i++){
				dst[i] = src[i];
			}
		}else{
			for(int i =0; i < dst.length; i++){
				if(i<src.length){
					dst[i] = src[i];
				}else{
					dst[i] = 0;
				}
				
			}
		}
	}
}
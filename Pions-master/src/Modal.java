
public class Modal implements Gestion{
	
	int[][][] Tab;
	
	
	public Modal(int dim,int taille) {
		
		if(dim==2) {
			
			this.Tab= new int[taille][taille][1];
		}
		else if(dim==3){
			
			this.Tab= new int[taille][taille][taille];
			
		}
		else {
		 System.out.println("Only dim of 2 or 3 is possible");
		}
		
	}
	
	
	
	
	public boolean isValable(int i, int j,int k) {
		
		if(Tab[i][j][k]>0) {
			return true;
		}
		else {
			return false; 
		}
		
	
	}

	//Permet de mettre l'id du joueur sur la case qu'il a selectionnée
	public void placePoint(int id, int x, int y, int z) {	

		Tab[x][y][z]=id;
	}
	
	
	


	@Override
	public double calculNorme() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isColinear() {
		// TODO Auto-generated method stub
		return false;
	}
}

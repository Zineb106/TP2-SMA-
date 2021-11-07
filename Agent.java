import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Agent {

	int id;
	String[] memo=new String[10];
	String situation_agt;
	//ArrayList<String> memo1 = new ArrayList<String>(10);
	int col;
	int row;
	
	public
	Map<String, String[] > perception(Agent agent,Environnement env_sys) 
	{
		
		Map<String, String[]> env = new HashMap<String, String[]>();
		//if(this.memo==null) {this.memo[0]="A";}
		env.put("memo", this.memo);
		
		String[] eta_post=new String[1];
		eta_post[0]=env_sys.grille[agent.row][agent.col];
		
		env.put("eta_post", eta_post);
		
		
		return (env);
		
	}
	
	
	Agent(){}
	
	public Agent(int id2, String[] memo2, String situation, int row2, int col2) {
		// TODO Auto-generated constructor stub
		this.id=id2;
		this.memo=memo2;
		this.situation_agt=situation;
		this.col=col2;
		this.row=row2;
	}

	@SuppressWarnings("null")
	void Action (Agent agent,Environnement env_sys)
	{
		

		
		
		String[] memo =agent.memo;
	    String[] eta_post=perception(agent,env_sys).get("eta_post");
	    

		if (agent.situation_agt==null) {agent.situation_agt="0";}
		
		
	   //System.out.println("etat de poste "+eta_post[0]);
	    //System.out.println("l'agent a l'objet "+agent.situation_agt);
	    
	    if (eta_post[0] == "0")
	    { 
	      if(agent.situation_agt=="0") 
	      {
	    	    //System.out.println("memoire 9 "+agent.memo[9]);
	    		System.out.println("l'état de poste est : "+eta_post[0]);
	    		System.out.println("l'agent "+agent.id+" ne prend rien et avance d'un pas ");
	    		agent.Avancer (agent);
	    		ajouter_memo(memo,eta_post);
	    		//System.out.println("memoire 9 devient  "+agent.memo[9]);
	       }
	      else 
	      {
	    	if(agent.situation_agt=="A")
	    	{
	    		int result=Calcul_Proba("A", agent, env_sys);
		    	if(result==0) 
		    	{  
		    		
		    		//System.out.println("memoire 9 "+agent.memo[9]);
		    		System.out.println("l'état de poste est : "+eta_post[0]);
		    		//System.out.println("l'agent "+agent.id+" port l'objet "+agent.situation_agt);
		    		System.out.println("l'agent "+agent.id+" dépose l'objet A");
		    		env_sys.grille[agent.row][agent.col]="A";
		    		eta_post[0]=env_sys.grille[agent.row][agent.col];
		    		agent.situation_agt="0";
		    		agent.Avancer(agent);
		    		//System.out.println("memoire 9 "+agent.memo[9]);
		    		System.out.println("l'etat de poste devient "+eta_post[0]);
		    	}
		    	else
		    	{
		    		//System.out.println("memoire 9 "+agent.memo[9]);
		    		System.out.println("l'etat de poste "+eta_post[0]);
		    		System.out.println("l'agent "+agent.id+" porte toujours l'objet "+agent.situation_agt);
		    		System.out.println("l'agent "+agent.id+" avance d'un pas");
		    		agent.Avancer (agent);
		    		ajouter_memo(memo,eta_post);
		    		//System.out.println("memoire 9 devient  "+agent.memo[9]);
	    		}
	    	} 
	    	else
	    	{
	    	    if(agent.situation_agt=="B") 
	    		{
	    	       int result=Calcul_Proba("B", agent, env_sys);
		    	   if(result==0)
		    	   {

		    		   //System.out.println("memoire 9 "+agent.memo[9]);
			    		System.out.println("l'etat du poste est "+eta_post[0]);
			    		//System.out.println("l'agent "+agent.id+"  porte l'objet "+agent.situation_agt);
			    		System.out.println("l'agent "+agent.id+" dépose l'objet B");
			    		env_sys.grille[agent.row][agent.col]="B";
			    		eta_post[0]=env_sys.grille[agent.row][agent.col];
			    		agent.situation_agt="0";
			    		agent.Avancer(agent);
			    		//System.out.println("memoire 9 "+agent.memo[9]);
			    		System.out.println("l'etat de poste devient "+eta_post[0]);	
		    	   }
		    	   else 
		    	   {

		    		   //System.out.println("memoire 9 "+agent.memo[9]);
			    		System.out.println("etat de poste "+eta_post[0]);
			    		System.out.println("l'agent "+agent.id+" porte toujours l'objet "+agent.situation_agt);
			    		System.out.println("l'agent "+agent.id+" avance d'un pas");
			    		agent.Avancer (agent);
			    		ajouter_memo(memo,eta_post);
			    		//System.out.println("memoire 9 devient  "+agent.memo[9]);
		    		}
	           }
	    	   else {System.out.println("Erreur!");}
	        }
	      }
	    }
	    	
	    else
	    {
	    	if (eta_post[0]== "A") 
	    	{ 
	    		if(agent.situation_agt=="0") 
	    		{ 
	    			int result=Calcul_Proba("A", agent, env_sys);
	    			if(result==1) 
	    			{   

	    				//System.out.println("memoire 9 "+agent.memo[9]);
			    		System.out.println("etat de poste "+eta_post[0]);
			    		//System.out.println("l'agent "+agent.id+" ne porte rien");
	    				System.out.println("l'agent "+agent.id+" prend l'objet A");
	    				agent.situation_agt="A";
	    				env_sys.grille[agent.row][agent.col]="0";
	    				eta_post[0]=env_sys.grille[agent.row][agent.col];
	    				agent.Avancer(agent);
	    				//System.out.println("memoire 9 "+agent.memo[9]);
			    		System.out.println("etat de poste devient "+eta_post[0]);	
	    				
	                 }
	    			
	    	      else 
	    	         {

	    	    	  //System.out.println("memoire 9 "+agent.memo[9]);
			    		System.out.println("etat de poste "+eta_post[0]);
			    		System.out.println("l'agent "+agent.id+" ne porte toujours rien");
			    		System.out.println("l'agent "+agent.id+" avance d'un pas");
			    		agent.Avancer (agent);
			    		ajouter_memo(memo,eta_post);
			    		//System.out.println("memoire 9 devient  "+agent.memo[9]);

			    		System.out.println("etat de poste devient "+eta_post[0]);
	    		     }
	    		}
	    		else
	    		{
	    			//System.out.println("memoire 9 "+agent.memo[9]);
		    		System.out.println("etat de poste "+eta_post[0]);
		    		System.out.println("l'agent "+agent.id+" ne porte toujours rien");
		    		System.out.println("l'agent "+agent.id+" avance d'un pas");
		    		agent.Avancer (agent);
		    		ajouter_memo(memo,eta_post);
		    		//System.out.println("memoire 9 devient  "+agent.memo[9]);
		    		System.out.println("etat de poste devient "+eta_post[0]);
   		        }
	    	}
	    	
	    	 else 
	    	 { 
	    		 if (eta_post[0]== "B") 
	 	    	{ 
	 	    		if(agent.situation_agt=="0") 
	 	    		{ 
	 	    			int result=Calcul_Proba("B", agent, env_sys);
	 	    			if(result==1) 
	 	    			{   
	 	    				//System.out.println("memoire 9 "+agent.memo[9]);
				    		System.out.println("etat de poste "+eta_post[0]);
				    		//System.out.println("l'agent "+agent.id+" ne prend rien");
		    				System.out.println("l'agent "+agent.id+" prend l'objet B");
		    				agent.situation_agt="B";
		    				env_sys.grille[agent.row][agent.col]="0";
		    				eta_post[0]=env_sys.grille[agent.row][agent.col];
		    				agent.Avancer(agent);
		    				//System.out.println("memoire 9 "+agent.memo[9]);
				    		System.out.println("etat de poste devient "+eta_post[0]);	
	 	                 }
	 	    			   
	 	    	         else 
	 	    	         {
	 	    	        	
	 	    	        	//System.out.println("memoire 9 "+agent.memo[9]);
				    		System.out.println("etat de poste "+eta_post[0]);
				    		System.out.println("l'agent "+agent.id+" ne porte toujours rien");
				    		System.out.println("l'agent "+agent.id+" avance d'un pas");
				    		agent.Avancer (agent);
				    		ajouter_memo(memo,eta_post);
				    		//System.out.println("memoire 9 devient  "+agent.memo[9]);

				    		System.out.println("etat de poste devient "+eta_post[0]);
	 	    		     }
	 	    		}
	    	 
	    		 else {
	    			    //System.out.println("memoire 9 "+agent.memo[9]);
			    		System.out.println("etat de poste "+eta_post[0]);
			    		System.out.println("l'agent "+agent.id+" ne porte toujours rien");
			    		System.out.println("l'agent "+agent.id+" avance d'un pas");
			    		agent.Avancer (agent);
			    		ajouter_memo(memo,eta_post);
			    		//System.out.println("memoire 9 devient  "+agent.memo[9]);

			    		System.out.println("l'etat de poste devient " +eta_post[0]);
	    		 
	    		      }
	    	  }
	    	  else {System.out.println("Probleme !!");
  		       System.out.println(eta_post[0]);
  		 
  		      }
	    	 }
	    }
	    }
	    	
	    
	    	
	    
	    	
	    
	    

	

    void Avancer(Agent agent)
    {
		int[] list_row = new int[3];
		list_row[0]=agent.row;
		list_row[1]=(agent.row)+1;
		list_row[2]=(agent.row)-1;
		
		int[] list_col= new int[3];
		list_col[0]=agent.col;
		list_col[1]=(agent.col)+1;
		list_col[2]=(agent.col)-1;
	
		if (agent.row==0) {list_row[2]=agent.row;}
		if (agent.col==0) {list_col[2]=agent.row;}
		if (agent.row==49) {list_row[1]=agent.row;}
		if (agent.col==49) {list_col[1]=agent.row;}
		
		Random random = new Random();
		int value = random.nextInt(3);
		int value1 = random.nextInt(3);
		
		agent.col=list_col[value];
		agent.row=list_row[value1];
			
    }
    void ajouter_memo(String[] memo,String[] eta_post) 
    { 	
    	for(int i=0; i<9; i++)
    	{
    		memo[i]=memo[i+1];
    	}
    	memo[9]=eta_post[0];
    }
    
	int Calcul_Proba (String objet,Agent agent,Environnement env_sys)
	{
	    
		String[] memo = perception(agent,env_sys).get("memo");
	    int t=memo.length;
	    double K_plus= 0.1;
	    double K_moins=0.3;
	    int cont_objet=0;
	    for (int i=0; i<t; i++)
	    {
	      if (memo[i] == objet) { cont_objet = cont_objet+1;}
	     
	    }
	    float F_objet =(float)(cont_objet*0.1);
	    double P_prise=(float) (K_plus /(K_plus+F_objet))*(K_plus /(K_plus+F_objet));
	    double P_depot=(float) (F_objet/(K_moins+F_objet))*(F_objet/(K_moins+F_objet));
	    System.out.println("P_depot = "+P_depot);
	    System.out.println("P_prise = "+P_prise);
	    if (P_prise>P_depot) return 1;
	    else return 0;

	}	
	
	
	
}

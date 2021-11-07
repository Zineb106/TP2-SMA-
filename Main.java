import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
			
		// Création de la grille 
  		
		
		Environnement env =new Environnement();
		
		env.initializer(env);
		
		
		String[] memo=new String[10];
		//for(int i =0;i<10;i++)
			
		//{   String[] value= {"A","B","0"};
		  //  Random random = new Random();
		    //int j = random.nextInt(3);
			//memo[i]=value[j];
			//}
		for(int i =0;i<10;i++)
		
		{
			memo[i]="0";
		}
		
		
		
		Agent agent1= new Agent(1,memo,"0",45,9);
		Agent agent2= new Agent(2,memo,"0",30,6);
		Agent agent3= new Agent(3,memo,"0",45,9);
		Agent agent4= new Agent(4,memo,"0",16,0);
		Agent agent5= new Agent(5,memo,"0",13,7);
		Agent agent6= new Agent(6,memo,"0",0,34);
		Agent agent7= new Agent(7,memo,"0",20,20);
		Agent agent8= new Agent(8,memo,"0",19,6);
		Agent agent9= new Agent(9,memo,"0",30,2);
		Agent agent10= new Agent(10,memo,"0",8,9);
		Agent agent11= new Agent(11,memo,"0",5,9);
		Agent agent12= new Agent(12,memo,"0",3,6);
		Agent agent13= new Agent(13,memo,"0",4,9);
		Agent agent14= new Agent(14,memo,"0",6,0);
		Agent agent15= new Agent(15,memo,"0",1,7);
		Agent agent16= new Agent(16,memo,"0",0,3);
		Agent agent17= new Agent(17,memo,"0",0,20);
		Agent agent18= new Agent(18,memo,"0",9,6);
		Agent agent19= new Agent(19,memo,"0",0,2);
		Agent agent20= new Agent(20,memo,"0",1,9);
		
	
		
		
		//System.out.println(col);
		//System.out.println(ow);
		   
		 
		 for(int i =1;i<25 ; i++)
		 {
		  
			  
		  agent2.Action(agent2, env);
		  System.out.println();
		  
		  agent1.Action(agent1, env);
		  System.out.println();
		  
		  agent4.Action(agent4, env);
		  System.out.println();
		  
		  agent5.Action(agent5, env);
		  System.out.println();
		  
		  agent6.Action(agent6, env);
		  System.out.println();
		  
		  agent7.Action(agent7, env);
		  System.out.println();
		  
		  agent3.Action(agent3, env);
		  System.out.println();
		  
		  agent8.Action(agent8, env);
		  System.out.println();
		  
		  agent9.Action(agent9, env);
		  System.out.println();
		  
		  agent10.Action(agent10, env);
		  System.out.println();
		  
		  agent11.Action(agent11, env);
		  System.out.println();
		  
		  agent12.Action(agent12, env);
		  System.out.println();
		  
		  agent13.Action(agent13, env);
		  System.out.println();
		  
		  agent14.Action(agent14, env);
		  System.out.println();
		  
		  agent15.Action(agent15, env);
		  System.out.println();
		  
		  agent16.Action(agent16, env);
		  System.out.println();
		  
		  agent17.Action(agent17, env);
		  System.out.println();
		  
		  agent18.Action(agent18, env);
		  System.out.println();
		  
		  agent19.Action(agent19, env);
		  System.out.println();
		  
		  agent20.Action(agent20, env);
		  System.out.println();
		  //agent1.Action(agent1, env);
		  //System.out.println();
		  
		  //agent10.Action(agent10, env);
		  //System.out.println();
		  
		  //agent8.Action(agent8, env);
		  
		  //System.out.println("contenue de la gille en cette position"+env.grille[agent2.row][agent2.col]);
		  //System.out.println();
		  
		 }
		 //agent2.Action(agent2);
		 //agent3.Action(agent3);
		 //agent4.Action(agent4);
		 //agent5.Action(agent5);
		 //agent6.Action(agent6);
		 //agent7.Action(agent7);
		 //agent8.Action(agent8);
		 //agent9.Action(agent9);
		 //agent10.Action(agent10);
		 //agent11.Action(agent11);
		 //agent12.Action(agent12);
		 //agent13.Action(agent13);
		 //agent14.Action(agent14);
		 //agent15.Action(agent15);
		 //agent16.Action(agent16);
		 //agent17.Action(agent17);
		 //agent18.Action(agent18);
		 //agent19.Action(agent19);
		 //agent20.Action(agent20);
		 
		 
	
	}}
	



package com.dbEngine.project.dbEngine;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  


		public class dataa extends Dbtest{
			int id;
			int season;
			String city;
			Date date;
			String team1;
			String team2;
			String toss_winner;
			String toss_decision;
			String result;
			int dl_applied;
			String winner;
			int win_by_runs;
			int win_by_wickets;
			String player_of_match;
			String venue;
			String umpire1;
			String umpire2;
			String umpire3;
		
			

		    /**
		     * @param args the command line arguments
		     */
		    public void qry() throws Exception {
		    	
		    	
		       String[] f=new String[100000];
		       String[][] td=new String[10000][10000];
		       int p=0,k=0;
		       try
		       {
		       FileReader ip=new FileReader("/home/sapient/Downloads/ipl.csv");
		       try
		       {
		       Scanner parser=new Scanner(ip);
		       while(parser.hasNextLine())
		       {
		           String line=parser.nextLine();
		           String[] att=line.split(",");
		           for(int q=0;q<att.length;q++)
		           {
		               f[p]=att[q];
		               p++;
		           }
		       }
		       }
		       finally
		       {
		           ip.close();
		       }
		       }
		       catch(FileNotFoundException ex)
		       {
		           System.out.println("File not found "+ex);
		       }
		       catch(IOException ex)
		       {
		           System.out.println("Unexpected I/O error "+ex);
		       }
		       
		       //System.out.println(f[22]);
		      for(int i=0;i<578;i++)
		      {
		          for(int j=0;j<18;j++)
		          {
		              td[i][j]=f[k];
		              k++;
		          }
		      }
		      /*for(int i=0;i<578;i++)
		      {
		          for(int j=0;j<18;j++)
		          {
		              System.out.println(td[i][j]);
		          }
		      }*/
		      
		     dataa[] obj=new dataa[578];
		      for (int i=1;i<=577;i++)
		         obj[i]= new dataa();
		      try {
		      for (int i=1;i<=577;i++)
		      {
		    	  obj[i].id=Integer.parseInt(td[i][0]);
		    	  obj[i].season=Integer.parseInt(td[i][1]);
		    	  obj[i].city=td[i][2];
		    	  obj[i].date=new SimpleDateFormat("yyyy-MM-dd").parse(td[i][3]);
		    	  obj[i].team1=td[i][4];
		    	  obj[i].team2=td[i][5];
		    	  obj[i].toss_winner=td[i][6];
		    	  obj[i].toss_decision=td[i][7];
		    	  obj[i].result=td[i][8];
		    	  obj[i].dl_applied=Integer.parseInt(td[i][9]);
		    	  obj[i].winner=td[i][10];
		    	  obj[i].win_by_runs=Integer.parseInt(td[i][11]);
		    	  obj[i].win_by_wickets=Integer.parseInt(td[i][12]);
		    	  obj[i].player_of_match=td[i][13];
		    	  obj[i].venue=td[i][14];
		    	  obj[i].umpire1=td[i][15];
		    	  obj[i].umpire2=td[i][16];
		    	  obj[i].umpire3=td[i][17];
		      }}
		      catch(NumberFormatException ex){ // handle your exception
		    	   
		    	}
		      
		    	 /* for (int i=1;i<=577;i++)
			      {
			    	  System.out.println(obj[i].id);
			    	  System.out.println(obj[i].season);
			    	  System.out.println(obj[i].city);
			    	  System.out.println(obj[i].date);
			    	  System.out.println( obj[i].team1);
			    	  System.out.println(obj[i].team2);
			    	  System.out.println( obj[i].toss_winner);
			    	  System.out.println(obj[i].toss_decision);
			    	  System.out.println(obj[i].result);
			    	  System.out.println(obj[i].dl_applied);
			    	  System.out.println(obj[i].winner);
			    	  System.out.println(obj[i].win_by_runs);
			    	  System.out.println(obj[i].win_by_wickets);
			    	  System.out.println(obj[i].player_of_match);
			    	  System.out.println(obj[i].venue);
			    	  System.out.println(obj[i].umpire1);
			    	  System.out.println(obj[i].umpire2);
			    	  System.out.println(obj[i].umpire3);
			      }
		    	  
		    	    
		    	    /*for (int i=1;i<=577;i++)
		    	       if(obj[i].team1.matches("Chennai Super Kings"))
		    	       {System.out.print(obj[i].id);
				    	  System.out.print(obj[i].season);
				    	  System.out.print(obj[i].city);
				    	  System.out.print(obj[i].date);
				    	  System.out.print( obj[i].team1);
				    	  System.out.print(obj[i].team2);
				    	  System.out.print( obj[i].toss_winner);
				    	  System.out.print(obj[i].toss_decision);
				    	  System.out.print(obj[i].result);
				    	  System.out.print(obj[i].dl_applied);
				    	  System.out.print(obj[i].winner);
				    	  System.out.print(obj[i].win_by_runs);
				    	  System.out.print(obj[i].win_by_wickets);
				    	  System.out.print(obj[i].player_of_match);
				    	  System.out.print(obj[i].venue);
				    	  System.out.print(obj[i].umpire1);
				    	  System.out.print(obj[i].umpire2);
				    	  System.out.println(obj[i].umpire3);
		    	    	   
		    	       }*/
		    	 //String[] field= { ""};
		    	  /*int i =1;
		    	  while(!(spqry[i].matches("from")))
		    			  {
		    		  if(spqry[i].matches(","))
		    		  {field[i]=spqry[i];
		    		  i++;}
		    		  
		    			  }*/
		    	  
		    	  //System.out.println(spqry[4]);
		    	  /*for(int i=0;i<spqry.length;i++)
		    	  {
		    		  while(!(spqry[i].matches("from")))
		    				  {
		    			  if(!(spqry[i].matches(",")))
		    			  {
		    				  field[i]=spqry[i];
		    			  }
		    				  }
		    	  }
		    	  for (int j=0;j<field.length;j++)
		    		  System.out.println(field[j]);*/
		    	 
		    	  String[] field = {"","","",""};
		    	  String[] sign  = new String[5];
		    	  String[] value = new String[5];
		    	  
		    	 String[][] arr= new String[5][5];	
		    	 try {
		    	 for (int i=0;i<restrictions.length;i++)
		    		  {
		    		  if (!(restrictions[i].matches(" ")))
		    		  {
		    			  arr[i] =restrictions[i].split(" ");
		    			  field[i]= arr[i][0];
		    			  sign[i]= arr[i][1];
		    			  value[i]=arr[i][2];
		    			  
		    			  System.out.println(field[i]);
		    			  System.out.println(sign[i]);
		    			  System.out.println(value[i]);
		    		  }
		    		  }}
		    	 catch(ArrayIndexOutOfBoundsException e) {}
		    	 int[] valueint_id = new int[8];
		    	 int[] valueint_season = new int[8];
		    	 int[] valueint_dl_applied = new int[8];
		    	 int[] valueint_win_by_runs = new int[8];
		    	 int[] valueint_win_by_wickets = new int[8];
		    	 String[] valueint_city = new String[8];
		    	 String[] valueint_team1 = new String[8];
		    	 String[] valueint_team2 = new String[8];
		    	 String[] valueint_toss_winner = new String[8];
		    	 String[] valueint_toss_decision = new String[8];
		    	 String[] valueint_result = new String[8];
		    	 String[] valueint_winner = new String[8];
		    	 String[] valueint_player_of_match = new String[8];
		    	 String[] valueint_venue = new String[8];
		    	 String[] valueint_umpire1 = new String[8];
		    	 String[] valueint_umpire2 = new String[8];
		    	 String[] valueint_umpire3 = new String[8];
		    	 
		    	 
		    	 for (int i=0;i<field.length;i++)
		    	 {
		    		 if (!(field[i].matches("")))
		    		{ 
		    	 
		    			 switch (field[i]) {
		    			 case "id":
		    				 valueint_id[i]=Integer.parseInt(arr[i][2]);
		    				 break;
		    			 case "season":
		    				 valueint_season[i]=Integer.parseInt(arr[i][2]);
		    				 break;
		    			 case "dl_applied":
		    				 valueint_dl_applied[i]= Integer.parseInt(arr[i][2]);
		    				 break;
		    			 case "win_by_runs":
		    				 
		    				 valueint_win_by_runs[i]= Integer.parseInt(arr[i][2]);
		    				 break;
		    			 case "win_by_wickets" :
		    				 valueint_win_by_wickets[i]= Integer.parseInt(arr[i][2]);
		    				 break;
		    			 case "city":
		    				 valueint_city[i]= (arr[i][2]);
		    				 break;
		    			 case "team1":
		    				 valueint_team1[i]= (arr[i][2]);
		    				 break;
		    			 case "team2":
		    				 valueint_team2[i]= (arr[i][2]);
		    				 break;
		    			 case "toss_winner":
		    				 valueint_toss_winner[i]= (arr[i][2]);
		    				 break;
		    			 case "toss_decision":
		    				 valueint_toss_decision[i]= (arr[i][2]);
		    				 break;
		    			 case "result":
		    				 valueint_result[i]= (arr[i][2]);
		    				 break;
		    			 case "winner":
		    				 valueint_winner[i]= (arr[i][2]);
		    				 break;
		    			 case "player_of_match":
		    				 valueint_player_of_match[i]= (arr[i][2]);
		    				 break;
		    			 case "venue":
		    				 valueint_venue[i]= (arr[i][2]);
		    				 break;
		    			 case "umpire1":
		    				 valueint_umpire1[i]= (arr[i][2]);
		    				 break;
		    			 case "umpire2":
		    				 valueint_umpire2[i]= (arr[i][2]);
		    				 break;
		    			 case "umpire 3":
		    				 valueint_umpire3[i]= (arr[i][2]);
		    				 break;
		    				 
		    		
		    		
		    				 }
		    	 }
		    		}
		    	 //System.out.println(valueint_season[0]);
		    	 
		    	 //for (int i=0;i<field.length;i++)
		    	 //{
		    		 //if (!(field[i].matches("")))
		    		 //{ 
		    	 int i=0;
		    			 switch (field[i]) {
		    			 case "id":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].id < valueint_id[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 //if (!(select[i].matches("")))
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].id == valueint_id[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].id > valueint_id[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    				 
		    				 
		    				 
		    				 
		    		 
		    				 
		    				 
		    			 case "season":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].season < valueint_season[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].season == valueint_season[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].season > valueint_season[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 System.out.println("");
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.print(obj[j].id + " ");
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city + " ");
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 }
		    				 break;//end of case id
		    			 case "win_by_runs":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_runs < valueint_win_by_runs[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_runs == valueint_win_by_runs[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_runs > valueint_win_by_runs[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    				 
		    				 
		    			 case "win_by_wickets":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets == valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    				 
		    				 
		    		  case "city":
	    				 switch (sign[i])
	    				 {
	    				 case "<":
	    					 for (int j=1;j<578;j++)
	    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
	    					 {for (int l=0;l<select.length;l++) {
	    						 switch(select[l]) {
	    						 case "*":
	    							 System.out.println(obj[j].id);
	    					    	  System.out.println(obj[j].season);
	    					    	  System.out.println(obj[j].city);
	    					    	  System.out.println(obj[j].date);
	    					    	  System.out.println( obj[j].team1);
	    					    	  System.out.println(obj[j].team2);
	    					    	  System.out.println( obj[j].toss_winner);
	    					    	  System.out.println(obj[j].toss_decision);
	    					    	  System.out.println(obj[j].result);
	    					    	  System.out.println(obj[j].dl_applied);
	    					    	  System.out.println(obj[j].winner);
	    					    	  System.out.println(obj[j].win_by_runs);
	    					    	  System.out.println(obj[j].win_by_wickets);
	    					    	  System.out.println(obj[j].player_of_match);
	    					    	  System.out.println(obj[j].venue);
	    					    	  System.out.println(obj[j].umpire1);
	    					    	  System.out.println(obj[j].umpire2);
	    					    	  System.out.println(obj[j].umpire3);
	    					    	  break;
	    						 case "id":
	    							 System.out.println(obj[j].id);
	    							 break;
	    						 case "season":
	    							 System.out.println(obj[j].season);
	    							 break;
	    						 case "city":
	    							 System.out.println(obj[j].city);
	    							 break;
	    						 case "date":
	    							 
	    							 System.out.println(obj[j].date);
	    							 break;
	    						 case "team1":
	    							 System.out.println( obj[j].team1);
	    							 break;
	    						 case "team2":
	    							 System.out.println( obj[j].team2);
	    							 break;
	    						 case "toss_winner":
	    							 System.out.println( obj[j].toss_winner);
	    							 break;
	    						 case "toss_decision":
	    							 System.out.println( obj[j].toss_decision);
	    						     break;
	    						 case "result":
	    							 System.out.println( obj[j].result);
	    							 break;
	    						 case "dl_applied":
	    							 System.out.println( obj[j].dl_applied);
	    						     break;
	    						 case "winner":
	    							 System.out.println( obj[j].winner);
	    							 break;
	    						 case "win_by_runs":
	    							 System.out.println( obj[j].win_by_runs);
	    							 break;
	    							 
	    						 case "win_by_wickets":
	    							 System.out.println( obj[j].win_by_wickets);
	    							 break;
	    						 case "player_of_match":
	    							 System.out.println( obj[j].player_of_match);
	    							 break;
	    						 case "venue":
	    						      System.out.println( obj[j].venue);
	    						      break;
	    						      
	    						 case "umpire1":
	    						      System.out.println( obj[j].umpire1);
	    						      break;
	    						 
	    						 case "umpire2":
	    						      System.out.println( obj[j].umpire2);
	    						      break;
	    							 
	    						 case "umpire3":
	    						      System.out.println( obj[j].umpire3);
	    						      break;
	    						 }	 
	    						 
	    							 
	    						
	    						 }
	    					 }
	    						 
	    						 
	    							 
	    					 }
	    					 
	    					 break;
	    				 case "=":
	    					 for (int j=1;j<578;j++)
	    					 {if(obj[j].city.matches(valueint_city[i]))
	    					 {for (int l=0;l<select.length;l++) {
	    						 switch(select[l]) {
	    						 case "*":
	    							 System.out.println(obj[j].id);
	    					    	  System.out.println(obj[j].season);
	    					    	  System.out.println(obj[j].city);
	    					    	  System.out.println(obj[j].date);
	    					    	  System.out.println( obj[j].team1);
	    					    	  System.out.println(obj[j].team2);
	    					    	  System.out.println( obj[j].toss_winner);
	    					    	  System.out.println(obj[j].toss_decision);
	    					    	  System.out.println(obj[j].result);
	    					    	  System.out.println(obj[j].dl_applied);
	    					    	  System.out.println(obj[j].winner);
	    					    	  System.out.println(obj[j].win_by_runs);
	    					    	  System.out.println(obj[j].win_by_wickets);
	    					    	  System.out.println(obj[j].player_of_match);
	    					    	  System.out.println(obj[j].venue);
	    					    	  System.out.println(obj[j].umpire1);
	    					    	  System.out.println(obj[j].umpire2);
	    					    	  System.out.println(obj[j].umpire3);
	    					    	  break;
	    						 case "id":
	    							 System.out.println(obj[j].id);
	    							 break;
	    						 case "season":
	    							 System.out.println(obj[j].season);
	    							 break;
	    						 case "city":
	    							 System.out.println(obj[j].city);
	    							 break;
	    						 case "date":
	    							 
	    							 System.out.println(obj[j].date);
	    							 break;
	    						 case "team1":
	    							 System.out.println( obj[j].team1);
	    							 break;
	    						 case "team2":
	    							 System.out.println( obj[j].team2);
	    							 break;
	    						 case "toss_winner":
	    							 System.out.println( obj[j].toss_winner);
	    							 break;
	    						 case "toss_decision":
	    							 System.out.println( obj[j].toss_decision);
	    						     break;
	    						 case "result":
	    							 System.out.println( obj[j].result);
	    							 break;
	    						 case "dl_applied":
	    							 System.out.println( obj[j].dl_applied);
	    						     break;
	    						 case "winner":
	    							 System.out.println( obj[j].winner);
	    							 break;
	    						 case "win_by_runs":
	    							 System.out.println( obj[j].win_by_runs);
	    							 break;
	    							 
	    						 case "win_by_wickets":
	    							 System.out.println( obj[j].win_by_wickets);
	    							 break;
	    						 case "player_of_match":
	    							 System.out.println( obj[j].player_of_match);
	    							 break;
	    						 case "venue":
	    						      System.out.println( obj[j].venue);
	    						      break;
	    						      
	    						 case "umpire1":
	    						      System.out.println( obj[j].umpire1);
	    						      break;
	    						 
	    						 case "umpire2":
	    						      System.out.println( obj[j].umpire2);
	    						      break;
	    							 
	    						 case "umpire3":
	    						      System.out.println( obj[j].umpire3);
	    						      break;
	    						 }	 
	    						 
	    							 
	    						
	    						 }
	    					 }
	    						 
	    						 
	    							 
	    					 }
	    					 
	    					 break;
	    				 case ">":
	    					 for (int j=1;j<578;j++)
	    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
	    					 {for (int l=0;l<select.length;l++) {
	    						 switch(select[l]) {
	    						 case "*":
	    							 System.out.println(obj[j].id);
	    					    	  System.out.println(obj[j].season);
	    					    	  System.out.println(obj[j].city);
	    					    	  System.out.println(obj[j].date);
	    					    	  System.out.println( obj[j].team1);
	    					    	  System.out.println(obj[j].team2);
	    					    	  System.out.println( obj[j].toss_winner);
	    					    	  System.out.println(obj[j].toss_decision);
	    					    	  System.out.println(obj[j].result);
	    					    	  System.out.println(obj[j].dl_applied);
	    					    	  System.out.println(obj[j].winner);
	    					    	  System.out.println(obj[j].win_by_runs);
	    					    	  System.out.println(obj[j].win_by_wickets);
	    					    	  System.out.println(obj[j].player_of_match);
	    					    	  System.out.println(obj[j].venue);
	    					    	  System.out.println(obj[j].umpire1);
	    					    	  System.out.println(obj[j].umpire2);
	    					    	  System.out.println(obj[j].umpire3);
	    					    	  break;
	    						 case "id":
	    							 System.out.println(obj[j].id);
	    							 break;
	    						 case "season":
	    							 System.out.println(obj[j].season);
	    							 break;
	    						 case "city":
	    							 System.out.println(obj[j].city);
	    							 break;
	    						 case "date":
	    							 
	    							 System.out.println(obj[j].date);
	    							 break;
	    						 case "team1":
	    							 System.out.println( obj[j].team1);
	    							 break;
	    						 case "team2":
	    							 System.out.println( obj[j].team2);
	    							 break;
	    						 case "toss_winner":
	    							 System.out.println( obj[j].toss_winner);
	    							 break;
	    						 case "toss_decision":
	    							 System.out.println( obj[j].toss_decision);
	    						     break;
	    						 case "result":
	    							 System.out.println( obj[j].result);
	    							 break;
	    						 case "dl_applied":
	    							 System.out.println( obj[j].dl_applied);
	    						     break;
	    						 case "winner":
	    							 System.out.println( obj[j].winner);
	    							 break;
	    						 case "win_by_runs":
	    							 System.out.println( obj[j].win_by_runs);
	    							 break;
	    							 
	    						 case "win_by_wickets":
	    							 System.out.println( obj[j].win_by_wickets);
	    							 break;
	    						 case "player_of_match":
	    							 System.out.println( obj[j].player_of_match);
	    							 break;
	    						 case "venue":
	    						      System.out.println( obj[j].venue);
	    						      break;
	    						      
	    						 case "umpire1":
	    						      System.out.println( obj[j].umpire1);
	    						      break;
	    						 
	    						 case "umpire2":
	    						      System.out.println( obj[j].umpire2);
	    						      break;
	    							 
	    						 case "umpire3":
	    						      System.out.println( obj[j].umpire3);
	    						      break;
	    						 }	 
	    						 
	    							 
	    						
	    						 }
	    					 }
	    						 
	    						 
	    							 
	    					 }
	    					 
	    					 break;
	    					 
	    					 }
	    				 break;//end of case id
		    		  case "team1":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].team1.matches(valueint_team1[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "team2":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].team2.matches(valueint_team2[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "toss_winner":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].toss_winner.matches(valueint_toss_winner[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "toss_decision":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].toss_decision.matches(valueint_toss_decision[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "result":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].result.matches(valueint_result[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "winner":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].winner.matches(valueint_winner[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "player_of_match":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].player_of_match.matches(valueint_player_of_match[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "venue":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].venue.matches(valueint_venue[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "umpire1":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].umpire1.matches(valueint_umpire1[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "umpire2":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].umpire2.matches(valueint_umpire2[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    		  case "umpire3":
		    				 switch (sign[i])
		    				 {
		    				 case "<":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets < valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case "=":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].umpire3.matches(valueint_umpire3[i]))
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    				 case ">":
		    					 for (int j=1;j<578;j++)
		    					 {if(obj[j].win_by_wickets > valueint_win_by_wickets[i])
		    					 {for (int l=0;l<select.length;l++) {
		    						 switch(select[l]) {
		    						 case "*":
		    							 System.out.println(obj[j].id);
		    					    	  System.out.println(obj[j].season);
		    					    	  System.out.println(obj[j].city);
		    					    	  System.out.println(obj[j].date);
		    					    	  System.out.println( obj[j].team1);
		    					    	  System.out.println(obj[j].team2);
		    					    	  System.out.println( obj[j].toss_winner);
		    					    	  System.out.println(obj[j].toss_decision);
		    					    	  System.out.println(obj[j].result);
		    					    	  System.out.println(obj[j].dl_applied);
		    					    	  System.out.println(obj[j].winner);
		    					    	  System.out.println(obj[j].win_by_runs);
		    					    	  System.out.println(obj[j].win_by_wickets);
		    					    	  System.out.println(obj[j].player_of_match);
		    					    	  System.out.println(obj[j].venue);
		    					    	  System.out.println(obj[j].umpire1);
		    					    	  System.out.println(obj[j].umpire2);
		    					    	  System.out.println(obj[j].umpire3);
		    					    	  break;
		    						 case "id":
		    							 System.out.println(obj[j].id);
		    							 break;
		    						 case "season":
		    							 System.out.println(obj[j].season);
		    							 break;
		    						 case "city":
		    							 System.out.println(obj[j].city);
		    							 break;
		    						 case "date":
		    							 
		    							 System.out.println(obj[j].date);
		    							 break;
		    						 case "team1":
		    							 System.out.println( obj[j].team1);
		    							 break;
		    						 case "team2":
		    							 System.out.println( obj[j].team2);
		    							 break;
		    						 case "toss_winner":
		    							 System.out.println( obj[j].toss_winner);
		    							 break;
		    						 case "toss_decision":
		    							 System.out.println( obj[j].toss_decision);
		    						     break;
		    						 case "result":
		    							 System.out.println( obj[j].result);
		    							 break;
		    						 case "dl_applied":
		    							 System.out.println( obj[j].dl_applied);
		    						     break;
		    						 case "winner":
		    							 System.out.println( obj[j].winner);
		    							 break;
		    						 case "win_by_runs":
		    							 System.out.println( obj[j].win_by_runs);
		    							 break;
		    							 
		    						 case "win_by_wickets":
		    							 System.out.println( obj[j].win_by_wickets);
		    							 break;
		    						 case "player_of_match":
		    							 System.out.println( obj[j].player_of_match);
		    							 break;
		    						 case "venue":
		    						      System.out.println( obj[j].venue);
		    						      break;
		    						      
		    						 case "umpire1":
		    						      System.out.println( obj[j].umpire1);
		    						      break;
		    						 
		    						 case "umpire2":
		    						      System.out.println( obj[j].umpire2);
		    						      break;
		    							 
		    						 case "umpire3":
		    						      System.out.println( obj[j].umpire3);
		    						      break;
		    						 }	 
		    						 
		    							 
		    						
		    						 }
		    					 }
		    						 
		    						 
		    							 
		    					 }
		    					 
		    					 break;
		    					 
		    					 }
		    				 break;//end of case id
		    }
		    			 
		    }
		}
		
		    				 
		    				 
		    
		//}
		    
		//}
		   
		


	



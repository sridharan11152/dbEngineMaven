	package com.dbEngine.project.dbEngine;
	import java.util.Scanner;
	
	public class Dbtest {
		static String qry;
		static String[] spqry= null;
		static String[] restrictions = {"","","",""};
		static String basepart ="";  
		static String[] select = {"","","",""};
		public static void main(String[] args)throws Exception {
			
			
			System.out.println("Enter the query:");
	//	   	Scanner scanner = new Scanner(System.in);
	//		qry = scanner.nextLine();
			qry = "select id,city from ipl.csv where city = Bangalore";
		    querycl obj=new querycl();
		    spqry= obj.splqry(qry);
			obj.extfname(spqry);
			basepart= obj.splwhr(spqry);
			obj.aftwhr(spqry);
			restrictions= obj.restrictions(spqry,qry);
			obj.grpfld(spqry,qry);
			obj.ordfld(spqry,qry);
			select = obj.aggselp(basepart);
			//scanner.close();
		    dataa obj2 =new dataa();
			obj2.qry();
		}
		
	
	}

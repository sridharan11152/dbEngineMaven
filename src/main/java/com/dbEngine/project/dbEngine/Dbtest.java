package com.dbEngine.project.dbEngine;
import java.util.Scanner;

public class Dbtest {
	static String qry;
	static String[] spqry= null;
	static String[] restrictions = {"","","",""};

	public static void main(String[] args)throws Exception {
		
		// TODO Auto-generated method stub
		System.out.println("Enter the query:");
	   	Scanner scanner = new Scanner(System.in);
		qry = scanner.nextLine();
	    querycl obj=new querycl();
	    spqry= obj.splqry(qry);
		obj.extfname(spqry);
		obj.splwhr(spqry);
		obj.aftwhr(spqry);
		restrictions= obj.restrictions(spqry,qry);
		obj.grpfld(spqry,qry);
		obj.ordfld(spqry,qry);
		obj.aggselp(spqry);
		scanner.close();
	    dataa obj2 =new dataa();
		obj2.qry();
	}
	

}

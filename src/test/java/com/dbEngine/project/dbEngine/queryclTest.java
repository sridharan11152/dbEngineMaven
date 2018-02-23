package com.dbEngine.project.dbEngine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.dbEngine.project.dbEngine.querycl;

import junit.framework.Assert;
@RunWith(JUnitPlatform.class)

class queryclTest {
	querycl obj = new querycl();
	Dbtest obj1 = new Dbtest();
	String query ="select * from ipl.csv where season > 2014 and city = Bangalore order by win_by_runs group by team1";
	String[] spl_qry=obj.splqry(query);
	
	@BeforeEach
	void setUp() throws Exception 
	     {
		System.out.println("select * from ipl.csv where season > 2014 and city = Bangalore order by win_by_runs group by team1");
	     }

	@Test
	void test1() // To test the filename extracting method
	     {
		
		String file_name = obj.extfname(spl_qry);
    	assertEquals("ipl.csv",file_name,"incorrect filename");
	     }
    	
    void test2() // To test the basepart extracting method
         {
    	String base_part = obj.splwhr(spl_qry);
    	assertEquals("select*fromipl.csv",base_part,"incorrect basepart");
    	 }
    void test3() // To test the filter part extracting method
        {
    	String filter_part = obj.aftwhr(spl_qry);
    	assertEquals("season>2014andcity=Bangaloreorderbywin_by_runsgroupbyteam1",filter_part,"incorrect filterpart");
    	} 
    void test4() // To check the conditions extracting method
        {
    	String []conditions= {"","","",""};
    	conditions = obj.restrictions(spl_qry,query);
    	assertEquals("season>2014",conditions[0],"incorrect conditions");
    	assertEquals("city=Bangalore",conditions[1],"incorrect conditions");
    	}
    void test5() // To check the logical operators extracting method
    	{
    	String []ops= {"","","",""};
    	ops = obj.logical_ops(spl_qry,query);
    	assertEquals("and",ops[0],"incorrect logical operators");
    	}
    void test6() // To check the group by field extracting method
    	{
    	String group= "";
    	group= obj.grpfld(spl_qry,query);
    	assertEquals("team1",group,"incorrect group by field");
    	}
    void test7() // To check the order by field extracting method
    	{
    		String order= "";
    	order= obj.ordfld(spl_qry,query);
    	assertEquals("win_by_runs",order,"incorrect order by field");
    	}
}
    	
    	
    	
    	
	



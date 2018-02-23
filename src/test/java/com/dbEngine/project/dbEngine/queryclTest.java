package com.dbEngine.project.dbEngine;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
//annotation used to run junit test cases
@RunWith(JUnitPlatform.class)

class queryclTest {
	querycl obj = new querycl();
	Dbtest obj1 = new Dbtest();
	String query ="select * from ipl.csv where season > 2014 and city = Bangalore order by win_by_runs group by team1";
	String[] spl_qry=obj.splqry(query);
	
	@BeforeEach
	void setUp() throws Exception 
	     {
		//System.out.println("select * from ipl.csv where season > 2014 and city = Bangalore order by win_by_runs group by team1");
	     }

	@Test
	void test1() // To test the filename extracting method
	     {
		
		String file_name = obj.extfname(spl_qry);
    	assertEquals("ipl.csv",file_name,"incorrect filename");
	     }
	@Test	
    void test2() // To test the basepart extracting method
         {
    	String base_part = obj.splwhr(spl_qry);
    	assertEquals("select*fromipl.csv",base_part,"incorrect basepart");
    	 }
	@Test
    void test3() // To test the filter part extracting method
        {
    	String filter_part = obj.aftwhr(spl_qry);
    	assertEquals(" season > 2014 and city = Bangalore order by win_by_runs group by team1",filter_part,"incorrect filterpart");
    	} 
	@Test
    void test4() // To check the conditions extracting method
        {
    	String []conditions= {"","","",""};
    	conditions = obj.restrictions(spl_qry,query);
    	assertEquals("season > 2014",conditions[0],"incorrect conditions");
    	assertEquals("city = Bangalore",conditions[1],"incorrect conditions");
    	}
	@Test
    void test5() // To check the logical operators extracting method
    	{
    	String []ops= {"","","",""};
    	ops = obj.logical_ops(spl_qry,query);
    	assertEquals("and",ops[0],"incorrect logical operators");
    	}
	@Test
    void test6() // To check the group by field extracting method
    	{
    	String group= "";
    	group= obj.grpfld(spl_qry,query);
    	assertEquals("team1",group,"incorrect group by field");
    	}
	@Test
    void test7() // To check the order by field extracting method
    	{
    		String order= "";
    	order= obj.ordfld(spl_qry,query);
    	assertEquals("win_by_runs",order,"incorrect order by field");
    	}
    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
        
    }
}
    	
    	
    	
    	
	



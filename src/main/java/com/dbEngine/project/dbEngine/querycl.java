	package com.dbEngine.project.dbEngine;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	public class querycl {
		static public final String WITH_DELIMITER = "((?<=%1$s)|(?=%1$s))";
		String []basepart= {""};
		String[] splqry(String qry)//method to split the input query into separate words
		{
			String arr[]=qry.split(String.format(WITH_DELIMITER, "[ ;,<=>=]"));
		    boolean isWhitespace =true;
		    int j=0;
		    int count=0;
		    for (int i=0;i<arr.length;i++)
		    	{
		        isWhitespace = arr[i].matches("\\s");
		    	if(isWhitespace)
		    		{ 
		    		int len=i;
		    		for(j=len+1;j<arr.length;j++)
		    			{
		    			arr[len]=arr[j];
		    	        len++;
		    }
		    		
		    		count++;
	
		}
		    }
		    String []new_arr=new String[arr.length-count];
		    for(int i=0;i<new_arr.length;i++)
		           new_arr[i]=arr[i];
		    for(int i=0;i<new_arr.length;i++)
		    System.out.println(new_arr[i]);
			return new_arr;
		}
		
		
		String extfname(String[] qry) //method to extract the file name
		{
			String []new_arr =qry;
			String filename ="hello";
			for(int k=0;k<new_arr.length;k++)
				{
				if(new_arr[k].matches("from"))
					{
					filename=new_arr[k+1];
					}
				}
			System.out.println("Filename:"+filename);
			return filename;
				    }
		
		 String splwhr(String[] sepqry)  // method to extract the base part of query
		{
			String []new_arr=sepqry;
			String basepart="";
			for(int k=0;k<new_arr.length;k++)
		    {
			   basepart=basepart+" "+new_arr[k];
			   if(new_arr[k+1].matches("where"))
			   break;
			}
		    System.out.println("basepart:"+basepart);
		    return basepart;
		}
		   
		 String aftwhr(String[] sepqry)   // method to extract the filter part of query
		 {
		    String filterpart="";
		    String []new_arr=sepqry;
		    for(int k=0;k<new_arr.length;k++)
		    {
			    if(new_arr[k].matches("where"))
			    {
			    	for( int l=k+1;l<new_arr.length;l++)
				    filterpart =filterpart+" "+ new_arr[l];
			        break;
			    }
			}
		    System.out.println("filterpart:"+filterpart);
		    return filterpart;
	
		}
		 
		String[] restrictions(String[] sepqry, String qry) // method to extract the conditions
		{
			String []new_arr=sepqry;
			String []conditions={"","",""};
		    int i=0;
		    for(int k=0;k<new_arr.length;)
		    {   
			    if((new_arr[k].matches("<"))||(new_arr[k].matches(">"))||(new_arr[k].matches("="))||(new_arr[k].matches("!")))
		        {       
				   conditions[i]=new_arr[k-1]+" " +new_arr[k]+" "+ new_arr[k+1];
				   if (new_arr[k+1].matches("="))
				   {
					   conditions[i]=conditions[i]+" "+new_arr[k+2];
					   k++;
				   }
				i++;
				}
			k++;
		    }
	
		   System.out.println("conditions");
		   for(  i=0;i<conditions.length;i++)
		   System.out.println(conditions[i]);
		   return conditions;
		}
	
		
		String[] logical_ops(String[] sepqry, String qry) // method to extract the logical operators
		{
			 int i=0;
			 String []new_arr=sepqry;
		     String []operators={"","","",""};
		     for(int k=0;k<new_arr.length;k++)
		     {   
			     if((new_arr[k].matches("and"))||(new_arr[k].matches("or"))||(new_arr[k].matches("not")))
			     {
			    	 operators[i]=new_arr[k];
		             i++;
		         }
		     }
		     System.out.println("logical operators");
		     for(  i=0;i<operators.length;i++)
		         System.out.println(operators[i]);
		     return operators;
		}
		
		String grpfld (String[] sepqry,String qry)  //method to extract groupby field 
		{
			String []new_arr=sepqry;
			String group ="";
		    for(int k=1;k<new_arr.length;k++)
		    {
			     if((new_arr[k].matches("group"))&&(new_arr[k+1].matches("by")))
			     {
				group=new_arr[k+2];
			     }
			}
			System.out.println("groupby:"+group);
			return group;
		}
	
	String ordfld(String[] sepqry,String qry)  // method to extract order by field
	{
		String []new_arr=sepqry;
		String order ="";
	    for(int k=1;k<new_arr.length;k++)
	    {
		   if((new_arr[k].matches("order"))&&(new_arr[k+1].matches("by")))
		   {
			order=new_arr[k+2];
		   }
		}
		System.out.println("orderby:"+order);
		return order;
	}	     
	String[] aggselp (String sep)// method to extract aggregate field
	{
		String []new_arr=sep.split(" ");
		String []req= {"","","",""};
		int k=0;
		
		for(int i=0;!(new_arr[i].matches("from"));i++)
		{	
			if (!(new_arr[i].matches(","))&& !(new_arr[i].matches(""))&& !(new_arr[i].matches("select")))
			{
				req[k]=new_arr[i];
				k++;
		        
			}
			
				
		}
		
		for(int i=0;i<req.length;i++)
		    System.out.println(req[i]);
		return req;
	} 
		}
	
	

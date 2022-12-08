package com.microcare.corejava;

 public class StringExamples{
	 static String check=" ";
	 
	 public static void main(String[] args) {
		 
		 String text ="DragAnd Drop";
		 String area = new String("Clickandhold");
		 
		 
		 
		// int size =text.length();
		 System.out.println(text.length());
		 System.out.println(text+area);
		 System.out.println(text.concat(area));
		 System.out.println(text.charAt(5) );
		 System.out.println(area.charAt(area.length()-2));
		 System.out.println(area.substring(7));
		 System.out.println(text.substring(4, 7));
		 System.out.println(text.replace(" ", ""));
		 System.out.println(text.replace(" Drop", "check"));
		 System.out.println(text.toLowerCase());
		 System.out.println(area.toUpperCase());
		 System.out.println(text.startsWith("Drag"));
         System.out.println(area.endsWith("d"));
         
        System.out.println(text.equalsIgnoreCase("dragand drop"));
        
        System.out.println(text.indexOf("And"));
        
        System.out.println(check.isEmpty());
        
        String[] arr = {"xvas","sdvsav","svas","svas","sdvasdv"};
     System.out.println(arr.length);
     System.out.println(arr[4]);
     
  
     
     
		 
		 
		 
	 }
	 
	 
 }
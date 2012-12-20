package com.neven.java.basic;

public class StaticTest {
	 public static int k=0;
	 public static String string="String";
     public static StaticTest t1=new StaticTest(string);
     public static StaticTest t2=new StaticTest("t2");
     public static int i=print("i");
     public static int n=99;
    
     public int j=print("j");
    
    {
        print("构造块");
     }
    
    static{
       print("静态块");
    }
    
   public StaticTest(String str){
        System.out.println((++k)+":"+str+"    i="+i+"    n="+n);
        ++i;++n;
   }
    
    public static int print(String str){
         System.out.println((++k)+":"+str+"    i="+i+"    n="+n);
         ++n;
          return ++i;
    }
    
    public static void main(String...strings ){
        
  }
}

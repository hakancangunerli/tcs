class Main { // file name == class name 
  public static void main(String[] args) {
   int x = 2;
int y= 5;
int z= 10; 
   
boolean condition1;  // one eq is variable assignment 
condition1 = x == z ;// two is for values 
boolean condition2;  
condition2 =  x<z; 
boolean condition3;
condition3 = y < z; 


if (condition1){      
System.out.println("this is wrong");
}else if (condition2){ // the condition that is true FIRST is the one that is represented. 
  System.out.println("this is also wrong");
}else if (condition3){
  System.out.println("this is true");
}else{
  System.out.println("i got nothing");

}





  }
}

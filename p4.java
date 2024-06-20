   //synchronized method 
   //Synchronization in Java is the capability to control the access of multiple threads to any shared resource.

class Table{  
    synchronized void printTable(int n){ 
      for(int i=1;i<=5;i++){  
        System.out.println(n*i);  
        try{  
         Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);}  
      }  
     
    }  
   }  
     
   class MyThread1 extends Thread{  
   Table t;  
   MyThread1(Table t){  
   this.t=t;  
   }  
   public void run(){  
   t.printTable(5);  
   }  
     
   }  
   class MyThread2 extends Thread{  
   Table t;  
   MyThread2(Table t){  
   this.t=t;  
   }  
   public void run(){  
   t.printTable(100);  
   }  
   }  
     
   public class p4{  
   public static void main(String args[]){  
   Table obj = new Table();//only one object  
   MyThread1 t1=new MyThread1(obj);  
   MyThread2 t2=new MyThread2(obj);  
   t1.start();  
   t2.start();  
   }  
   }  




//synchronized block
// class Table  
// {      
//  void printTable(int n){    
//    synchronized(this){    
//      for(int i=1;i<=5;i++){    
//       System.out.println(n*i);    
//       try{    
//        Thread.sleep(400);    
//       }catch(Exception e){System.out.println(e);}    
//      }    
//    }    
//  }//end of the method    
// }    
    
// class MyThread1 extends Thread{    
// Table t;    
// MyThread1(Table t){    
// this.t=t;    
// }    
// public void run(){    
// t.printTable(5);    
// }    
    
// }    
// class MyThread2 extends Thread{    
// Table t;    
// MyThread2(Table t){    
// this.t=t;    
// }    
// public void run(){    
// t.printTable(100);    
// }    
// }    
    
// public class p4{    
// public static void main(String args[]){    
// Table obj = new Table();//only one object    
// MyThread1 t1=new MyThread1(obj);    
// MyThread2 t2=new MyThread2(obj);    
// t1.start();    
// t2.start();    
// }    
// } 
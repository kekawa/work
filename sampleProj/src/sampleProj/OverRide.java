package sampleProj;

class OverRide{
	public static void main(String args[]){
    	SubB2 b2 = new SubB2();
    	b2.display();
 	}
}

class SuperA{
  public void display(){
    System.out.println("電化製品です");
  }
}

class SubB1 extends SuperA{
  public void display(){
    System.out.println("エアコンです");
    super.display();
  }
}

class SubB2 extends SubB1{
	public void display(){
		System.out.println("三菱製です");
		super.display();
	}	
}

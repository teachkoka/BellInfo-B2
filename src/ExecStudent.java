
public class ExecStudent {
	
	public static void main(String[] args){
		
		Student std0  = new Student();
		
		std0.setCourse("Java");
		std0.setName("Siva");
		std0.setRollNumber(1);
		
		Student std1  = new Student();
		std1.setName("Pradeep");
		std1.setCourse("Advanced");
		std1.setRollNumber(2);
		
		System.out.println("========================");
		System.out.println("Name: "+std0.getName()+" Course: "+std0.getCourse()+" RollNumber: "+std0.getRollNumber());
		System.out.println("Name: "+std1.getName()+" Course: "+std1.getCourse()+" RollNumber: "+std1.getRollNumber());
	}

}

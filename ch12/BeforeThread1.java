package ch12;

public class BeforeThread1 extends Thread{
	public BeforeThread1(String name) {
		super(name);
	}
	private void addCar() {
		System.out.println("addCar");
		 JoinTest.carList.add("소나타");
		 JoinTest.carList.add("말두타");
		 JoinTest.carList.add("곰도타");
		 JoinTest.carList.add("불나타");
	}
	public void run() {
		System.out.println(getName()+"실행");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			addCar();
			}
	}
}

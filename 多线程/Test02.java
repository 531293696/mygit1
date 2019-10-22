public class Test02{
	public static void main(String[] args){
		Taxi t=new Taxi();
		new Thread(t,"888").start();
		new Thread(t,"999").start();
		new Thread(t,"666").start();
		new Thread(t,"555").start();
		new Thread(t,"111").start();
	}
}
class Taxi implements Runnable{
	private int fares=100;
	public void run(){
		while (true){
			dispathfares();
			if(fares<=0){
				break;
			}
		}
	}
		private synchronized void dispathfares(){
		if(fares > 0){
			try{
			Thread.sleep(10);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
				System.out.println(Thread.currentThread().getName() + "---½ÓËÍµÄ³Ë¿Í"
				        + fares--);
			}
		}
	}
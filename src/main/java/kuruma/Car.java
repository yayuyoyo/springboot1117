package kuruma;

public class Car {
	
	private Engine engine;
	
	public  Car(Engine engine) {
		
		this.engine = engine;
		
	}
	
	public void engineStart() {
		engine.boot();
	}
	
	public void engineStop() {
		engine.stop();
	}
}

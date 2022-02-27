package kuruma;

public class Main {

	public static void main(String[] args) {
		
		Engine hondaEngine1 = EngineFactory.createHondaEngine(); 
		Engine NissanEngine1 = EngineFactory.createNissanEngine();
		
		Car car1 = new Car(hondaEngine1);
		Car car2 = new Car(NissanEngine1);
		
		car1.engineStart();
		car1.engineStop();
		car2.engineStart();
		car2.engineStop();

	}

}

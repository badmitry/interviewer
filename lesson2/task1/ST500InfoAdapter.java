public class ST500InfoAdapter implements MeteoSensor{
	private ST500Info info;
	
	public adapter(ST500Info info) {
			$this = info;
	}

	public int getId() {
		info.identifier();
	}
	
	public float getTemperature(){
		return (float) info.temperature();
	}
	
	public float getHumidity(){
		return 0; // я так понимаю датчик не измеряет влажность
	}
	
	public float getPressure(){
		return 0; // я так понимаю датчик не измеряет давление
	}
	
	public LocalDateTime getDateTime(){
		return LocalDateTime.now();
	}


}

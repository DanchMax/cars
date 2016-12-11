package cars;

public class Car {

	private String name;
	private final Wheel wheel;
	private final Body body;
	private final Volante volante;
	
	public Car(String name, Rozmir rozmir, Boolean batton, int diametr, Rezina rezina, Color kolir, String type) {
		this.name = name;
		this.volante = new Volante(rozmir,batton);
		this.wheel = new Wheel (diametr, rezina);
		this.body = new Body (kolir,type);
	}
	public void changeRozmir(Rozmir rozmir){
		volante.changeRozmir(rozmir);
	}
	
	public void increaseDiametr(int value) {
		wheel.increaseDiametr(value);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void changeRezina(Rezina rezina) {
		wheel.changeRezina(rezina);
	}
	public Rezina getRezina() {
		return wheel.getRezina();
	}
	public String getType() {
		return body.getType();
	}
	public void changeKolir(Color kolir) {
		body.changeKolir(kolir);
	}
	public void changeName(String name){
		this.name = name;
	}

	public void setDiametr(int diametr) {
		wheel.setDiametr(diametr);
	}
	public boolean isBatton() {
		return volante.isBatton();
	}
	public Rozmir getRozmir() {
		return volante.getRozmir();
	}
	public Color getKolir() {
		return body.getKolir();
	}
	public int getDiametr() {
		return wheel.getDiametr();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((volante == null) ? 0 : volante.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (volante == null) {
			if (other.volante != null)
				return false;
		} else if (!volante.equals(other.volante))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", wheel=" + wheel + ", body=" + body + ", volante=" + volante + "]";
	}
	
}


public class Ambiente {
	public Ambiente(int numero, int sillas, int televisores, int mesas, int lamparas, int tableros, int tomaCorrientes,
			int portatiles, int cargadores, int guayas, String descripcion) {
		this.numero = numero;
		this.sillas = sillas;
		this.televisores = televisores;
		this.mesas = mesas;
		this.lamparas = lamparas;
		this.tableros = tableros;
		this.tomaCorrientes = tomaCorrientes;
		this.portatiles = portatiles;
		this.cargadores = cargadores;
		this.guayas = guayas;
		Descripcion = descripcion;
	}

	int numero;
	int sillas;
	int televisores;
	int mesas;
	int lamparas;
	int tableros;
	int tomaCorrientes;
	int portatiles;
	int cargadores;
	int guayas;
	String Descripcion;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSillas() {
		return sillas;
	}
	public void setSillas(int sillas) {
		this.sillas = sillas;
	}
	public int getTelevisores() {
		return televisores;
	}
	public void setTelevisores(int televisores) {
		this.televisores = televisores;
	}
	public int getMesas() {
		return mesas;
	}
	public void setMesas(int mesas) {
		this.mesas = mesas;
	}
	public int getLamparas() {
		return lamparas;
	}
	public void setLamparas(int lamparas) {
		this.lamparas = lamparas;
	}
	public int getTableros() {
		return tableros;
	}
	public void setTableros(int tableros) {
		this.tableros = tableros;
	}
	public int getTomaCorrientes() {
		return tomaCorrientes;
	}
	public void setTomaCorrientes(int tomaCorrientes) {
		this.tomaCorrientes = tomaCorrientes;
	}
	public int getPortatiles() {
		return portatiles;
	}
	public void setPortatiles(int portatiles) {
		this.portatiles = portatiles;
	}
	public int getCargadores() {
		return cargadores;
	}
	public void setCargadores(int cargadores) {
		this.cargadores = cargadores;
	}
	public int getGuayas() {
		return guayas;
	}
	public void setGuayas(int guayas) {
		this.guayas = guayas;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Ambiente [numero=" + numero + ", sillas=" + sillas + ", televisores=" + televisores + ", mesas=" + mesas
				+ ", lamparas=" + lamparas + ", tableros=" + tableros + ", tomaCorrientes=" + tomaCorrientes
				+ ", portatiles=" + portatiles + ", cargadores=" + cargadores + ", guayas=" + guayas + ", Descripcion="
				+ Descripcion + "]";
	}
	
	
}

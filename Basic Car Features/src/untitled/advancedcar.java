package untitled;

public class advancedcar {
	private int silindir;
	private int koltuksayisi;
	private int kapisayisi;
	
	public advancedcar(int silindir,int koltuksayisi,int kapisayisi) {
		this.silindir=silindir;
		this.koltuksayisi=koltuksayisi;
		this.kapisayisi=kapisayisi;
	}
	
	public advancedcar() {
		this.silindir=0;
		this.koltuksayisi=0;
		this.kapisayisi=0;
	}
	

	public void stop() {
		System.out.println("Araba Durdu");		
	}
	
	
	public int getSilindir() {
		return this.silindir;	
	}
	public void setSilindir(int silindir) {
		this.silindir=silindir;	
	}

	
	public int getKoltuksayisi() {
		return koltuksayisi;
	}
	public void setKoltuksayisi(int koltuksayisi) {
		this.koltuksayisi = koltuksayisi;
	}

	
	public int getKapisayisi() {
		return kapisayisi;
	}
	public void setKapisayisi(int kapisayisi) {
		this.kapisayisi = kapisayisi;
	}
	
	
	public void showInfo() {
		System.out.println("Kapı Sayısı:" + this.kapisayisi);
		System.out.println("Koltuk Sayısı:" + this.koltuksayisi);
		System.out.println("Silindir Sayısı:" + this.silindir);
		this.stop();
	}
	
	public void showInfodef() {
		System.out.println("Kapı Sayısı:" + this.kapisayisi);
		System.out.println("Koltuk Sayısı:" + this.koltuksayisi);
		System.out.println("Silindir Sayısı:" + this.silindir);
		
	}
	
	
}

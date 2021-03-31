import java.util.Vector;
public class Main {

	public static void main(String[] args) {
		
		/*
		Vector s�n�f� yaln�zca nesneler i�erebilir, ilkel veri tiplerini i�eremez. 
		Ama ilkel veri tipleri bir nesne i�ine konularak kullan�l�r. 
		�rne�in int tipinde Vector s�n�f� tan�mlanmaz, Integer s�n�f�nda tan�mlan�r. 
		ArrayList ve Vector, Collection Framework hiyerar�isi alt�ndaki s�n�flard�r. 
		ArrayList ve Vector, her ikisi de, dizinin gerekti�i gibi ve gerekti�inde 
		b�y�yebilece�i dinamik bir nesne dizisi olu�turmak i�in kullan�l�r. 
		ArrayList ve Vector'i birbirinden ay�ran iki temel fark vard�r; 
		Vector, Vector ��esinin daha sonra koleksiyon s�n�flar�n� desteklemek 
		i�in yeniden yap�land�r�lm�� olan Legacy s�n�flar�na ait oldu�u halde, 
		ArrayList standart bir koleksiyon s�n�f�d�r. Di�er bir �nemli fark ise, 
		ArrayList'in di�er yandan senkronize olmamas�d�r; Vekt�r senkronize edildi.
		
		*/
		
		
		
		Vector<String> vec = new Vector<String>();
		
		vec.add("Mehmet");
		vec.add("Serkan");
		vec.add("Atilla");
		vec.add("Denizhan");
		
		System.out.println("Vekt�r�n Elemanlar�:");
		
		for(int i =0; i<vec.size();i++) {
			
			System.out.println(i+ ":" + vec.get(i));
			
			}
		
		vec.add(3,"Can");
		
		System.out.println("\n Eklenmi� Son Vekt�r�n Elemanlar�");
		
		for(int i=0; i<vec.size();i++) {
			System.out.println(i+":"+vec.get(i));

	}

}
}

import java.util.Vector;
public class Main {

	public static void main(String[] args) {
		
		/*
		Vector sýnýfý yalnýzca nesneler içerebilir, ilkel veri tiplerini içeremez. 
		Ama ilkel veri tipleri bir nesne içine konularak kullanýlýr. 
		Örneðin int tipinde Vector sýnýfý tanýmlanmaz, Integer sýnýfýnda tanýmlanýr. 
		ArrayList ve Vector, Collection Framework hiyerarþisi altýndaki sýnýflardýr. 
		ArrayList ve Vector, her ikisi de, dizinin gerektiði gibi ve gerektiðinde 
		büyüyebileceði dinamik bir nesne dizisi oluþturmak için kullanýlýr. 
		ArrayList ve Vector'i birbirinden ayýran iki temel fark vardýr; 
		Vector, Vector öðesinin daha sonra koleksiyon sýnýflarýný desteklemek 
		için yeniden yapýlandýrýlmýþ olan Legacy sýnýflarýna ait olduðu halde, 
		ArrayList standart bir koleksiyon sýnýfýdýr. Diðer bir önemli fark ise, 
		ArrayList'in diðer yandan senkronize olmamasýdýr; Vektör senkronize edildi.
		
		*/
		
		
		
		Vector<String> vec = new Vector<String>();
		
		vec.add("Mehmet");
		vec.add("Serkan");
		vec.add("Atilla");
		vec.add("Denizhan");
		
		System.out.println("Vektörün Elemanlarý:");
		
		for(int i =0; i<vec.size();i++) {
			
			System.out.println(i+ ":" + vec.get(i));
			
			}
		
		vec.add(3,"Can");
		
		System.out.println("\n Eklenmiþ Son Vektörün Elemanlarý");
		
		for(int i=0; i<vec.size();i++) {
			System.out.println(i+":"+vec.get(i));

	}

}
}

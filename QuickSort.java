
public class QuickSort {

	private int partition(Double[] kur, String[] tarih, int baslangic, int bitis) {
		Double pivot = kur[bitis];
		int i = baslangic-1;
		
		for (int j=baslangic; j<bitis; j++) {
			if(kur[j] < pivot) {
				i++;
				
				Double temp = kur[i];
				kur[i] = kur[j];
				kur[j] = temp;
				String temp_s = tarih[i];
				tarih[i] = tarih[j];
				tarih[j] = temp_s;
			}
		}
		Double temp = kur[i+1];
		kur[i+1] = kur[bitis];
		kur[bitis] = temp;
		String temp_s = tarih[i+1];
		tarih[i+1] = tarih[bitis];
		tarih[bitis] = temp_s;
		
		return i+1;
	}
	
	public void quickSort(Double[] kur, String[] tarih, int baslangic, int bitis) {
		if (baslangic < bitis) {
			int pi = partition(kur, tarih, baslangic, bitis);
			
			quickSort(kur, tarih, baslangic, pi-1);
			quickSort(kur, tarih, pi+1, bitis);
		}
	}
	
}

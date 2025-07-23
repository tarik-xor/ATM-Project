package baslangic;

import java.util.Scanner;

public class atmProject {

	public static void main(String[] args) {
		int bakiye = 1000;
		int islemSecimi;
		boolean durum = true;
		
		Scanner girdiAl = new Scanner(System.in);
		System.out.print("Bakiyeniz: " + bakiye + "\n");
		
		
		
		while(durum == true) {
			System.out.print("1- Para Yatır \n");
			System.out.print("2 - Para Çek \n");
			System.out.print("3 - Bakiye Sorgulama \n");
			System.out.print("4 - Çıkış \n");
			
			System.out.print("İşlem seçiniz: ");
			islemSecimi = girdiAl.nextInt();
			
			switch(islemSecimi) {
			
			case 1:
				int yatanPara;
				int sonPara;
				int bitisSorgu;
				System.out.print("----Para yatırma işlemi seçildi---- \n");
				durum = false;
				System.out.print("Yatırılacak paranın miktarını giriniz: ");
				yatanPara = girdiAl.nextInt();
				sonPara = bakiye + yatanPara;
				bakiye = sonPara;
				System.out.print("Son bakiyeniz: " + sonPara + "\n");
				System.out.print("Devam etmek isterseniz 1, kapatmak isterseniz 2 yi tuşlayın:  ");
				bitisSorgu = girdiAl.nextInt();
				if (bitisSorgu == 1) {
					durum = true;
				}else if (bitisSorgu == 2) {
					System.out.print("Sistem kapatıldı.");
					durum = false;
				}
				break;
				
				
			case 2:
				int cekilenPara;
				int sonPara2;
				int bitisSorgu2;
				
				System.out.print("----Para çekme işlemi seçildi---- \n");
				durum = false;
				System.out.print("Çekilecek paranın miktarını giriniz: ");
				cekilenPara = girdiAl.nextInt();
				sonPara2 = bakiye - cekilenPara;
				bakiye = sonPara2;
				
				
				if (sonPara2 < 0) {
					System.out.print("Bakiyeniz negatif olamaz tekrar deneyin. \n");
					durum = true;
				}else {
					System.out.print("Son bakiyeniz: " + sonPara2 + "\n");
					System.out.print("Devam etmek isterseniz 1, kapatmak isterseniz 2 yi tuşlayın:  ");
					bitisSorgu2 = girdiAl.nextInt();
					if (bitisSorgu2 == 1) {
						durum = true;
					}else if (bitisSorgu2 == 2) {
						System.out.print("Sistem kapatıldı.");
						durum = false;
					}
					
				} 
				break;
				
			case 3:
				System.out.print("Bakiyeniz: " + bakiye + "\n");
				break;
				
			
			}
			
			if(islemSecimi == 4) {
				System.out.print("Sistem sonlandı.");
				break;
			}
		}
	}

}

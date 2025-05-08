package chap05;

import java.util.Random;

public class ArrayExam4 {
	public static void main(String[] args) {
		String[] singer = {"RM","진","뷔","지민","슈가","제이홉","정국"};
		String[] singerFavoriteSubject 
			= {"java","servlet","jsp","spring"
					,"jenkins","kubernetes","raspberryPI"};
		int index = 0;
		
		
		for(int i = 0; i<singer.length; i++) {
			System.out.println(singer[i] +  " - " + singerFavoriteSubject[i]);
			if(singerFavoriteSubject[i].length() >= 5) {
				index++;
			}
			
		}
		
		System.out.println();
		String[] lonNameSubjectFavoriteSinger = new String[index];
		index = 0;

		for(int i = 0; i<singer.length; i++) {
			if(singerFavoriteSubject[i].length() >= 5) {
				lonNameSubjectFavoriteSinger[index] = singer[i];
				index++;
			}
			
		}
		
		for(String singer2 : lonNameSubjectFavoriteSinger) {
			System.out.print(singer2 + " ");
		}

	}

}
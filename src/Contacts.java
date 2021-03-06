import java.io.IOException;


public class Contacts {

	public static void main(String[] args) throws IOException {
		//test.txt open
		DataBaseForAddress dba =  new DataBaseForAddress("test.txt");
		RandomDataMaker rdm = new RandomDataMaker();
		
		System.out.println(Math.random());
		//n개의 자료 삽입 시간 체
		long startTime = System.currentTimeMillis();
		System.out.println("Insert start");
		for(int i=0;i<100;i++){
			dba.insertData(i,rdm.makeName(),rdm.makePhone());
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time : " + (endTime-startTime) + "ms");
		
		//특정 번호 값 검색
		System.out.println(dba.getContact(50));
		
	}

}

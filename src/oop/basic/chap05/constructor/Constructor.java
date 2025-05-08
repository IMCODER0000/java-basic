//package oop.basic.chap05.constructor;
//
//public class Constructor {
//	
//	private String name;
//	private String id;
//	private String pass;
//	private String telNum;
//	
//	 //데이터수정용 생성자
//    public Constructor(String name,String id,String pass) {
//        this.name = name;
//        this.id = id;
//        this.pass = pass;
//        System.out.println("매개변수3개생성자");
//    }
//    //데이터삽입용 - 매개변수6개
//    public Constructor(String name, String id, String pass, String addr, String telNum, String ssn) {
//        this(name,id,pass);
//        this.addr = addr;
//        this.telNum = telNum;
//        this.ssn = ssn;
//        System.out.println("매개변수6개생성자");
//        
//    }
//    //조회용    - 매개변수8개
//    public Constructor(String name, String id, String pass, String addr, String telNum, String ssn, String nickName,
//            int point) {
//        this(name,id,pass,addr,telNum,ssn);
//        this.nickName = nickName;
//        this.point = point;
//        System.out.println("매개변수8개생성자");
//    }
//
//}

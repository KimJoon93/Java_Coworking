import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class Maxdddd implements Joon{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numberlist = new ArrayList<>();
		numberlist.add(20);
		numberlist.add(30);
		numberlist.add(40);
		
		Iterator<Integer> iii = numberlist.iterator();
		
		
		for (Integer data : numberlist) {
			System.out.println(data);
		}
		System.out.println("=================================");

		System.out.println("=================================");
		for (int i = 0; i < numberlist.size(); i++) {
			System.out.println(numberlist.get(i));
		}
		System.out.println("=================================");
		

//		System.out.println(Integer.MAX_VALUE);
//		boolean memoryCheck =  numberlist.add(Integer.MAX_VALUE);
//		if(userInput Integer.MAX_VALUE)
		numberlist.add(20);
		numberlist.add(50);
		HashMap<String, Integer> student = new HashMap<String, Integer>();
		student.put("김준", 201728);
		student.put("이주용", 2018);
		
		
		LinkedList<Integer> linkedlist = new LinkedList<>();
		linkedlist.add(20);
		linkedlist.add(100);
		linkedlist.add(300);
		
		Iterator<Integer> itr =  linkedlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("=================================");
		for(int i=0; i<linkedlist.size(); i++) {
			System.out.println(linkedlist.get(i));
		}
		
		
		HashSet<Integer> setex = new HashSet<>();
		setex.add(100);
		setex.add(200);
		
//		Iterator<Integer> data =  setex.iterator();
//		while(data.hasNext()) {
//			if(data.next() == 30) {
//				data.remove();
//			}
////			System.out.println(data.next());
//		}
		
		dataRemove(setex.iterator(), 200);
		dataRemove(numberlist.iterator(), 20);
		
		ArrayList<String> name = new ArrayList<>();
		name.add("a1");
		name.add("a2");
		name.add("a3");
		if(dataRemove(name.iterator(), "a12")) {
			System.out.println("데이터 삭제 성공!");
		} else {
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
		}
//		System.out.println(dataRemove(name.iterator(), "a12"));
		StudentInfo st1 = new StudentInfo("Joon", "Com", 121321);
		ArrayList<StudentInfo> studentLists = new ArrayList<>();
		studentLists.add(st1);
		studentLists.add(new StudentInfo("JYL", "IT", 123782891));
		
		for (StudentInfo aa : studentLists) {
			aa.studentInfo();
		}
		
		
//		for(int i=0; i<studentLists.size(); i++) {
//			StudentInfo st = studentLists.get(i);
//			st.studentInfo();
//		}
		
		ArrayList<Integer> feedlist = new ArrayList<>();
		feedlist.add(1);
		feedlist.add(2);
		feedlist.add(3);
		feedlist.add(4);
		
		for(int i = feedlist.size()-1; i>=0; i--) {
			System.out.println(feedlist.get(i));
		}
		
		Collections.sort(feedlist, Collections.reverseOrder());
		
		for (Integer data : feedlist) {
			System.out.println(data);
		}
	}

	public static <DeleteType> Boolean dataRemove(Iterator<DeleteType> data, DeleteType removeData) {
		while(data.hasNext()) {
			if(data.next() == removeData) {
				data.remove();
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void greeting(String message) {
		// TODO Auto-generated method stub
	}
	

}

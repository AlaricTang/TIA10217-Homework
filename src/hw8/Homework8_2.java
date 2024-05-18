package hw8;

//import java.util.ArrayList;		//給list用
import java.util.Collection;
//import java.util.Collections;	//給list用
import java.util.Iterator;
import java.util.List;
import java.util.Set;		//給Set用
import java.util.TreeSet;	//給Set用

public class Homework8_2 {
	public static void main(String[] args) {
		Set<Train> trainTS = new TreeSet<>();		//給Set用
//		List<Train> trainTS = new ArrayList<>();	//給list用
		trainTS.add(new Train(202,"普悠瑪","樹林","花蓮",400));
		trainTS.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainTS.add(new Train(118, "自強", "高雄", "台北", 500));
		trainTS.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainTS.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainTS.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainTS.add(new Train(1254, "區間", "屏東", "基隆", 700));
		

//		listToUni(trainTS);	//給List用，除掉重複的
//		Collections.sort(trainTS);	//給List用
		
//印的方法
//		printTrainForLoop(trainTS);	//給list用
		printTrainForEach(trainTS);	
//		printTrainIterator(trainTS);
	}
	
	
	static 	void printTrainForEach(Collection<Train> train) {
		for(Train trainObj:train) {
			System.out.println(trainObj.getTrainInfo());
		}
	}
	static void printTrainIterator(Collection<Train> train) {
		Iterator<Train> trainTsIt = train.iterator();
		while(trainTsIt.hasNext()) {
			System.out.println(((Train)trainTsIt.next()).getTrainInfo());
		}
	}
	static void printTrainForLoop(Collection<Train> train) {
		for(int i=train.size();i>0;i--) {
			Object objForLoop = ((List<Train>)train).get(i);
			System.out.println(((Train)objForLoop).getTrainInfo());
		}
	}
	
//給list用
//	static void listToUni(List<Train> listBeUni){
//		Iterator<Train> listBeUniIt = listBeUni.iterator();
//		List<Train> listUni = new ArrayList<>();	//建空List
//		
//		while(listBeUniIt.hasNext()){				//空List沒有的元素就放入，有的則刪掉
//			Train train = listBeUniIt.next();
//			if(!(checkUni(listUni, train))){
//				listUni.add(train);
//			}else {
//				listBeUniIt.remove();
//			}
//		}
//	}
//	
//	static boolean checkUni(List<Train> listUni,Train beUni) {	//確認元素是否重複
//		for(Train o:listUni) {
//			if(beUni.getNumber()==o.getNumber()) {
//				return true;
//			}
//		}
//		return false;
//	}
}

class Train implements Comparable<Train>{
	private int number;
	private String type,start,dest;
	private double price;
	
	 Train(int number,String type, String start, String dest, double price) {
		this.number = number;
		this.type=type;
		this.start=start;
		this.dest=dest;
		this.price=price;
	}
	void setTrain(int number,String type, String start, String dest, double price) {
		this.number = number;
		this.type=type;
		this.start=start;
		this.dest=dest;
		this.price=price;
	}
	String getTrainInfo() {
		String trainInfo = "班次:" + number + " ,車種:" + type + " 出發地:" +start+" 目的地:"+ dest + " 票價:" + price; 
		return trainInfo;
	}
	int getNumber() {
		return number;
	}
	@Override
	public int compareTo(Train other) {
		if (this.number>other.number) {
			return -1;
		}else if(this.number<other.number) {
			return 1;
		}else 
			return 0;
	}
}


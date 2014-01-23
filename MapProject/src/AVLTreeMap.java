
import java.util.TreeMap;



public class AVLTreeMap extends AvlNode implements StudentMap {

	public AVLTreeMap(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	//creates a tree map to store students and their corresponding id's
	TreeMap <Integer, String> myMap = new TreeMap<Integer, String>();
	
	AvlNode position;

	AvlNode avlTree;

	public static int max (int lhs, int rhs) {

		return lhs > rhs ? lhs : rhs;

		}
	public static int getHeight (AvlNode position) {

		if (position == null){
			return -1;
		}else{
			return position.getHeight();
		}
	}
	public static AvlNode singleRotateWithLeft (AvlNode k2) {

		AvlNode k1;
		k1 = k2.getLeft();
		k2.setLeft(k1.getRight());
		k1.setRight(k2);
		k2.setHeight(max(getHeight(k2.getLeft()),	 getHeight(k2.getRight()))+1);
		k1.setHeight(max(getHeight(k1.getLeft()),k2.getHeight())+1);
		return k1;

		}
	public static AvlNode singleRotateWithRight (AvlNode k1) {

		AvlNode k2;
		k2 = k1.getRight();
		k1.setRight(k2.getLeft());
		k2.setLeft(k1);
		k1.setHeight(max(getHeight(k1.getLeft()),getHeight(k1.getRight()))+1);
		k2.setHeight(max(getHeight(k2.getRight()),k1.getHeight())+1);
		return k2;

		}
	public static AvlNode doubleRotateWithLeft (AvlNode k3) {

		k3.setLeft(singleRotateWithRight(k3.getLeft()));
		return singleRotateWithLeft(k3);

		}
		
	public static AvlNode doubleRotateWithRight (AvlNode k1) {

		k1.setRight(singleRotateWithLeft(k1.getRight()));

		return singleRotateWithRight(k1);

		}
	
	public AvlNode insert (int value, AvlNode t) {

		if(t == null) {
		
			t = new AvlNode(value);

		}else if(value < t.getValue()) {

			t.setLeft(insert(value,t.getLeft()));

			if(getHeight(t.getLeft())-getHeight(t.getRight()) == 2){
	
				if(value < t.getLeft().getValue()){
		
				t = singleRotateWithLeft(t);
		
				}else{
		
				t = doubleRotateWithLeft(t);
				
				}
			}	

		}else 	 if(value > t.getValue()) {

			t.setRight(insert(value,t.getRight()));
	
			if(getHeight(t.getRight())-getHeight(t.getLeft()) == 2){
	
				if(value > t.getRight().getValue()){
		
				t = singleRotateWithRight(t);
		
				}else{
		
				t = doubleRotateWithRight(t);
				
				}
			}
		}

		t.setHeight(max(getHeight(t.getLeft()),	 getHeight(t.getRight()))+1);

		return t;

		}
	
	public int retrieve (AvlNode t) {

		return t.getValue();

		}
	/*public void preOrder(AvlNode t) {

		System.out.println(t.getValue());

		if(t.getLeft() != null) {
			preOrder(t.getLeft());
		}

		if(t.getRight() != null) {
			preOrder(t.getRight());
		}

	}*/

	@Override
	public void add(int id, Student s) {
		// TODO Auto-generated method stub
		myMap.put(2011205129, "BŸßra");
		myMap.put(2011400290, "Mert");
		myMap.put(2011205123, "Merve");
		myMap.put(2010205124, "Kerem");
		myMap.put(2012205148, "Mustafa");
		myMap.put(2013400390, "Serdar");
		myMap.put(2012400280, "Ali");
		
	}
	@Override
	public Student get(int id) {
		return (Student) myMap.keySet();
		// TODO Auto-generated method stub
		
	}
	@Override
	public void BFT() {
		// TODO Auto-generated method stub

		
	}
	
}

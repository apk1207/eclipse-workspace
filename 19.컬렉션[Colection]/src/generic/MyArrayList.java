package generic;

public class MyArrayList<E> {
	private Object[] elementData;
	private int size;
	public MyArrayList() {
		elementData=new Object[0];
		size=elementData.length;
	}
	public void add(E element) {
		Object[] tempElementData=new Object[elementData.length+1];
		for (int i = 0; i < elementData.length; i++) {
			tempElementData[i]=elementData[i];
		}
		tempElementData[tempElementData.length-1] = element;
		this.elementData=tempElementData;
		this.size=this.elementData.length;
		
	}
	public E get(int index) {
		return (E)this.elementData[index];
	}
	
	public E remove(int index) {
		Object[] tempElementData=
				new Object[elementData.length-1]; 
		Object removeElement=null;
		int newIndex=0;
		for (int i = 0; i < elementData.length; i++) {
			if(i != index) {
				tempElementData[newIndex] = elementData[i];
				newIndex++;
			}else {
				removeElement = elementData[i];
			}
		}
		elementData=tempElementData;
		size=elementData.length;
		
		return (E)removeElement;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int size() {
		return size;
	}
	

}
package moderate;

public class SearchTree {
	
	private String nome;
	private int key;
	private SearchTree parent;
	private SearchTree right;
	private SearchTree left;
	
	// GET and SET - Elements
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public SearchTree getParent() {
		return parent;
	}
	public void setParent(SearchTree parent) {
		this.parent = parent;
	}
	public SearchTree getRight() {
		return right;
	}
	public void setRight(SearchTree right) {
		this.right = right;
	}
	public SearchTree getLeft() {
		return left;
	}
	public void setLeft(SearchTree left) {
		this.left = left;
	}
	
	// Construct Method
	public SearchTree(int key, String nome) {
		setKey(key);
		setNome(nome);
		setParent(null);
		setLeft(null);
		setRight(null);
	}
	
	public SearchTree left() {
		if(getLeft() == null)
			return null;
		else
			return getLeft();
	}
	
	public boolean hasLeft() {
		if(getLeft() == null)
			return false;
		else
			return true;
	}
	
	public SearchTree right() {
		if(getRight() == null)
			return null;
		else
			return getRight();
	}
	
	public boolean hasRight() {
		if(getRight() == null)
			return false;
		else
			return true;
	}
	
	public void preorder() {
		System.out.println(getKey() + " ");
		if(hasLeft())
			getLeft().postorder();
		if(hasRight())
			getRight().postorder();
	}
	
	public void postorder() {
		if(hasLeft())
			getLeft().postorder();
		if(hasRight())
			getRight().postorder();
		System.out.println(getKey() + " ");
	}
	
	public void inorder() {
		if(hasLeft())
			getLeft().postorder();
		System.out.println(getKey() + " ");
		if(hasRight())
			getRight().postorder();
	}
	
	public void addNode(int key, String nome) {
		SearchTree newNode = new SearchTree(key, nome);
		SearchTree nodeTrab = this;
		
		while(true) {
			if(newNode.getKey() < nodeTrab.getKey()) {
				if(nodeTrab.getLeft() == null) {
					nodeTrab.setLeft(newNode);
					newNode.setParent(nodeTrab);
					newNode.setNome(nome);
					return;
				}
				else
					nodeTrab = nodeTrab.getLeft();
			}
			else {
				if(nodeTrab.getRight() == null) {
					nodeTrab.setRight(newNode);
					newNode.setParent(nodeTrab);
					newNode.setNome(nome);
					return;
				}
				else
					nodeTrab = nodeTrab.getRight();
			}
		}
	}
	
	public SearchTree searchKey(int key) {
		SearchTree nodeTrab = this;
		while(nodeTrab != null && nodeTrab.getKey() != key) {
			if(key < nodeTrab.getKey()) {
				nodeTrab = nodeTrab.getLeft();
			}
			else
				nodeTrab = nodeTrab.getRight();
		}
		
		return nodeTrab;
	}
}

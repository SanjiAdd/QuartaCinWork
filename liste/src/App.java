public class App {
	public static void main(String[] args) {

        Lista l = new Lista();
	    l.add( "Mario" );
        l.add("Giacomo");
        l.add( "Anna");
	    l.addHead(new Nodo("Luigi"));
	    l.addTail(new Nodo("Blue"));
        
		System.out.println("Lunghezza lista: " + l.getLength());
		System.out.println("Contiene 'Mario'? " + l.exists("Mario"));
		System.out.println("Contiene 'Luigi'? " + l.exists("Luigi"));
		System.out.println(l);

        System.out.println(l.toReverseString());

		System.out.println("Rimuovo 'Mario': " + l.remove("Mario"));
		System.out.println(l);
	}
}
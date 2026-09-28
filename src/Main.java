import java.util.*;
record Book(int id,String title,String author,boolean borrowed){}
public class Main{
 static final List<Book> books=new ArrayList<>(List.of(new Book(1,"Clean Code","Robert Martin",false),new Book(2,"Effective Java","Joshua Bloch",false)));
 public static void main(String[]a){Scanner s=new Scanner(System.in);while(true){System.out.println("\nLIBRARY | 1 List 2 Borrow 3 Return 4 Search 0 Exit");String c=s.nextLine();if(c.equals("1"))books.forEach(System.out::println);else if(c.equals("2"))change(s,true);else if(c.equals("3"))change(s,false);else if(c.equals("4")){String q=s.nextLine();books.stream().filter(b->b.title().toLowerCase().contains(q.toLowerCase())).forEach(System.out::println);}else if(c.equals("0"))break;}}
 static void change(Scanner s,boolean borrow){int id=Integer.parseInt(s.nextLine());for(int i=0;i<books.size();i++)if(books.get(i).id()==id){Book b=books.get(i);books.set(i,new Book(b.id(),b.title(),b.author(),borrow));System.out.println("Updated.");}}
}

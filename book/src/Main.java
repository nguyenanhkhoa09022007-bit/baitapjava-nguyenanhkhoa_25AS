public class Main {
    public static void main(String[] args){
        Author author = new Author(" anh khoa "," khoadhdo@gmail ", 'n');
        System.out.println(author);
        author.setEmail(" khoaddkfds@gmail ");
        Book b1 = new Book("Java for Dummy", author, 19.95, 99);


        System.out.println(b1);
        System.out.println( " name is="+ author.getName());
        System.out.println( " email="+author.getEmail());
        System.out.println( " gender= "+ author.getGender());
    }
}
public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Iron Flame: 2", "Rebecca Yarros", 2023, "Entangled: Red Tower Books");
        Livro livro2 = new Livro("Going Infinite: The Rise and Fall of a New Tycoon", "Michael Lewis", 2023, "W. W. Norton & Company");
        Livro livro3 = new Livro("8 Little Planets: A Solar System Book for Kids with Unique Planet Cutouts", "Chris Ferrie", 2018, "Sourcebooks Explore");

        System.out.println("Livro 1:");
        System.out.println(livro1.toString());

        System.out.println("\nLivro 2:");
        System.out.println(livro2.toString());

        System.out.println("\nLivro 3:");
        System.out.println(livro3.toString());
    }
}

import java.util.*;
public interface RepositoryArticles {
    // in einem Interface gibt mann alle Methden an welche von Implementierenden Klassen ausprogrammiert werden müssen
    // Wichtig:  Interfaces geben einen Vertrag vor
   // es werden nur die Methoden Köpfe Angegeben es Existiert noch kein Code diese müssen die Implementierenden Klassen bereitstellen
    public boolean Save();
    public boolean insert(Article article);
    public boolean remove(int primaryKey);
    public boolean Update(int primaryKey, Article newArticleData);
    public List<Article> searchByName(String name);
    public List<Article> searchByCategory(String Category);
    public Article   searchById(int ID);



}

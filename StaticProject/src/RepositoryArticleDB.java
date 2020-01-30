import java.util.List;

public class RepositoryArticleDB implements RepositoryArticles {

// Implementiert eine Klasse ein Interface so verpflichtet sie sich dazu dass sie alle Mehtoden ausprogrammiert
    //Es können beliebig viele weitere Members (Felder,Mehtoden) vorhanden sein
    @Override
    public boolean Save() {
        return false;
    }

    @Override
    public boolean insert(Article article) {
        return false;
    }

    @Override
    public boolean remove(int primaryKey) {
        return false;
    }

    @Override
    public boolean Update(int primaryKey, Article newArticleData) {
        return false;
    }

    @Override
    public List<Article> searchByName(String name) {
        return null;
    }

    @Override
    public List<Article> searchByCategory(String Category) {
        return null;
    }

    @Override
    public Article searchById(int ID) {
        return null;
    }
}

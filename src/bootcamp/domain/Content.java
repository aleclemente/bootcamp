package bootcamp.domain;

public abstract class Content {
    //protected para apenas ser acessada pelas classes filhas e do mesmo pacote, static para ser possível acessar fora da classe Content, final para representar constante
    protected static final double DEFAULT_XP = 10d;
    private String title;
    private String description;

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

package hendryg56.com.valolineups;

public class Hero {
    private String heroname;
    private int imgSource;

    public Hero(String heroname, int imgSource) {
        this.heroname = heroname;
        this.imgSource = imgSource;
    }

    public String getHeroname() {
        return heroname;
    }

    public void setHeroname(String heroname) {
        this.heroname = heroname;
    }

    public int getImgSource() {
        return imgSource;
    }

    public void setImgSource(int imgSource) {
        this.imgSource = imgSource;
    }
}



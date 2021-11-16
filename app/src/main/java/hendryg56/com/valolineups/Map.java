package hendryg56.com.valolineups;

public class Map {
    private String mapName;
    private int mapImage;

    public Map(String mapName, int mapImage) {
        this.mapName = mapName;
        this.mapImage = mapImage;
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public int getMapImage() {
        return mapImage;
    }

    public void setMapImage(int mapImage) {
        this.mapImage = mapImage;
    }
}

public class BoosterMode extends PrintMode{

    private int intensityThreshold;
    @Override
    public void saveToner() {

    }

    @Override
    public void savePage() {

    }

    @Override
    public void boost() {

    }

    public int getIntensityThreshold() {
        return intensityThreshold;
    }

    public void setIntensityThreshold(int intensityThreshold) {
        this.intensityThreshold = intensityThreshold;
    }
}

// composition setter
public class touch{
    private Mobile mobile;
    private Screen screen;
    private Logo logo;
    private Resolution resolution;

    private Mobile getMobile() {
        return mobile;
    }
    public void Getmobilename(){
        System.out.println(getMobile().getName());
    }

    public Screen getScreen() {
        return screen;
    }

    public Logo getLogo() {
        return logo;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public touch(Mobile mobile, Screen screen, Logo logo, Resolution resolution) {
        this.mobile = mobile;
        this.screen = screen;
        this.logo = logo;
        this.resolution = resolution;
    }
}
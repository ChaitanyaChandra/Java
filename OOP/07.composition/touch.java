// composition setter (lists all classes)
public class touch {

        // declaring composition
        private Mobile mobile;
        private Screen screen;
        private Logo logo;
        private Resolution resolution;

        //composition  constructor
        public touch(Mobile mobile, Screen screen, Logo logo, Resolution resolution) {
            this.mobile = mobile;
            this.screen = screen;
            this.logo = logo;
            this.resolution = resolution;
    }

        //private getter
        private Mobile getMobile() {
            return mobile;
    }

        private Screen getScreen() {
            return screen;
    }

        private Logo getLogo() {
            return logo;
    }

        private Resolution getResolution() {
            return resolution;
    }



//    public void start(){
//            getScreen().Status("on");
//            getLogo().Status("on");
//            getResolution().Status("on");
//    }
//
//    public void stop(){
//            getScreen().Status("off");
//            getLogo().Status("off");
//            getResolution().Status("off");
//    }
//              or

    public void start(){
        screen.Status("on");
        logo.Status("on");
        resolution.Status("on");
    }

    public void stop(){
        screen.Status("off");
        logo.Status("off");
        resolution.Status("off");
    }

}
// inheritance
public class Screen extends Mobile{
    private String responce;
    private Logo logo;
    private Resolution resolution;



    public Screen(String name ,String responce , Logo logo,Resolution resolution){
        super(name);
        this.responce = responce;
        this.logo = logo;
        this.resolution = resolution;
    }

    public String getResponce(){
        return this.responce;
    }
    public Logo getLogo() {
        return this.logo;
    }
    public Resolution resolution(){
        return this.resolution;
    }


}
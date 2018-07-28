public class stringParameters {
    private String message;

    public stringParameters(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}

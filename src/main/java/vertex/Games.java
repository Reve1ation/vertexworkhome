package vertex;

public class Games {

    String catagory;


    public String getCategory() {
        return catagory;
    }

    public void setCategory(String category) {
        this.catagory = category;
    }

    public String willBeReleased() {
	    if (getCategory().length() > 2) {
		    System.out.println("Game will be popular!");
		    return "Game will be popular!";
	    } else if(getCategory().length() == 2){
		    System.out.println("Need better estimate!");
		    return "Need better estimate!";
	    } else {
		    System.out.println("Bad indi game!");
		    return "Bad indi game!";
	    }
    }
}

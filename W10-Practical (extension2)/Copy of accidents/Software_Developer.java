public class Software_Developer extends Employer{
    /**
     * @customer sd
     */
    public String employerType = "Software Developer";

    String[] specialSkills = new String[3];
    
    public String[] getSpecialSkills() {
        return specialSkills;
    }

    public void setSpecialSkills(String[] specialSkills) {
        for(int i=0;i<3;i++){
        	this.specialSkills[i] = specialSkills[i];
        }
    }

}

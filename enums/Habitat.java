package enums;

public enum Habitat {
    
    DOMESTIC( 1,  "Domestic"),
    WILD_FOREST( 2,  "Forest"),
    WILD_SAVANNA( 3,  "Savanna"),
    WILD_OCEAN( 4,  "Ocean"),
    URBAN( 5,  "Urban"),
    FARM( 6,  "Farm");
    

    private final int code;
    private final String displayName;

    Habitat(int code , String displayName){

        this.code = code ;
        this.displayName = displayName;

    }

    public int getCode(){

        return code;

    }

    public String getDisplayName(){

        return displayName;

    }

    //Transcrevendo habitat
    public static Habitat fromCode(int code){
        for (Habitat h: values()) {
            if (h.code == code)
                return h;
        }
        throw new IllegalArgumentException("Habitat invalido:" + code);
    }
}

package Enum;

public enum tuna
 {
    ram("Tall","24"),
    rahim("Short","26"),
    sham("Average","27"),
    abc("verytall","20"),
    xyz("veryshort","15"),
    pqr("medium","20");
    
    private final String height;
    private final String age;
    
    tuna(String ht,String ag)
    {
        height=ht;
        age=ag;
    }
    public String getheight()
    {
        return height;
    }
    public String getage()
    {
        return age;
    }
}

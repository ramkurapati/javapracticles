package Basics;

 enum Alphabets 
 {
    A("Ant"),B("Bull"),C("Cat"),D("Dog"),
    E("Elephant"),F("Fox"),G("Goat"),H("Horse"),
    I("Impala"),J("Jackal"),K("Kangaro"),L("Lion"),
    M("Monkey"),N("Nightingale"),O("Ox"),P("Parrot"),
    Q("Quail(bird type)"),R("Rat"),S("Snake"),T("Tiger"),U("Urial(Hill goat)"),V("Vulture"),
    W("Whale"),X("Xenopus(frog type)"),Y("Yalk"),Z("Zebra");
    
    String value;
    private Alphabets(String value)
    {
    	this.value=value;
    }
	public String getValue() {
		return value;
	}
	 
}

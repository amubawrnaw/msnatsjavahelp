public class course
{
	public course ()
	{
		
	}
	public void assignVal(String cCode)
	{
		checkCode("OBJECTP");
		checkRoom("G302A");
		checkSect("S11");
		checkUnits(3.0);
	}
	public void assignVal1(String cCode)
	{
		checkCode(cCode);
		checkRoom("G302A");
		checkSect("S11");
		checkUnits(3.0);
	}
	public void assignVal2(String cCode,String room)
	{
		checkCode(cCode);
		checkRoom(room);
		checkSect("S11");
		checkUnits(3.0);
	}
	public void assignVal3(String cCode,String room,String section)
	{
		checkCode(cCode);
		checkRoom(room);
		checkSect(section);
		checkUnits(3.0);
	}
		public void assignVal4(String cCode,String room,String section, double units)
	{
		checkCode(cCode);
		checkRoom(room);
		checkSect(section);
		checkUnits(units);
	}
	public void checkCode(String cCode)
	{
		if (cCode.length() == 7)
			this.cCode=cCode;
		else this.cCode = "OBJECTP";
	}
	public void checkRoom(String room)
	{
		if (room.length() >0)
			this.room=room;
		else this.room = "G302A";
	}
	public void checkSect(String section)
	{
		if (section.length() >0)
			this.section=section;
		else this.section = "S11";
	}
	public void checkUnits(double yes)
	{
		if (yes==1||yes==0.5||yes==2.0||yes==3.0||yes==4.0)
			units=yes;
		else units = 3.0;
	}
	public String retString()
	{
		//units.toString();
		useful = cCode.concat(" ").concat(room).concat(" ").concat(section).concat(" ");
		return useful;
	}
	
	private String cCode;
	private double units;
	private String room;
	private String section;
	private String useful;
}
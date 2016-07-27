public class Teacher extends Person
{
   public Teacher(Name name, int IDnum)
   { 
      super(name, IDnum);
	  area = null;
   }
	public Teacher(Name name, int IDnum, String[] area)
   { 
      super(name, IDnum);
	  this.area = area;
   }
   public Name getName()
   {   
      return name;
   }

   public int getIDnum()
   {
      return IDnum;
   }

   public String[] getArea()
   {
      return area;
   }
   
   public void setArea(String[] content)
   {
	   if (area != null)
		   System.out.println("Replacing old entry");
	
       area = content;
   }

   public String toString()
   {  String temp = "";
      int x;
      if (area != null)
        for (x = 0; x < area.length; x++) 
           temp = temp + area[x] + "\n";  

      return name.toString() + " (" + IDnum + "): \n" + temp;
   }

/*   
   public boolean isInList(String key)
   {
      boolean found = false;

      if (area == null)
        return false;
      else {
         int i = 0;
         while (i < area.length && !found)
            if (area[i].equalsIgnoreCase(key))
               found = true;
            else i++;
 
         return found;
     }           
   }

   public boolean isSameArea(Teacher otherT)
   {
       if (area == null && otherT.area == null) {
           System.out.println("both are empty");
		   return true;
	   }
       else if (area == null || otherT.getArea() == null)
           return false;
       else {
         int i;
         boolean eq = true;
         for (i = 0; i < otherT.area.length; i++)
           if (isInList(otherT.area[i]) == false)
              eq = false;
         return eq;
      } 
   } 
*/
	 public void performDuty()
   {
	   System.out.println("Teaching...");
   }
	/*public String toString()
	{
		return toString() + area.length;
	}*/
   protected String[]     area; 
}
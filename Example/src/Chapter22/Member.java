package Chapter22;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id=id;
	}

	@Override
	public int hashCode() {
	
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
          if(obj instanceof Member) {
          Member compareMember=(Member)obj;
          if(this.id==compareMember.id) { 
              return true;  
            } 
           } return false;
	      } 
	    }



